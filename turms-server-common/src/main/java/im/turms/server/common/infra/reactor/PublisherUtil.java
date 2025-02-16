/*
 * Copyright (C) 2019 The Turms Project
 * https://github.com/turms-im/turms
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package im.turms.server.common.infra.reactor;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import jakarta.validation.constraints.NotNull;

import io.netty.util.concurrent.Future;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import im.turms.server.common.infra.collection.CollectorUtil;
import im.turms.server.common.infra.function.ThrowingSupplier;

/**
 * @author James Chen
 */
public final class PublisherUtil {

    private PublisherUtil() {
    }

    public static <T> Mono<T> fromFuture(Future<T> future) {
        if (future.isDone()) {
            T returnValue = future.getNow();
            if (returnValue == null) {
                return Mono.empty();
            }
            return future.isSuccess()
                    ? Mono.just(returnValue)
                    : Mono.error(future.cause());
        }
        return Mono.create(sink -> future.addListener(f -> {
            if (f.isSuccess()) {
                Object returnValue = f.getNow();
                if (returnValue == null) {
                    sink.success();
                    return;
                }
                sink.success((T) returnValue);
            } else {
                sink.error(f.cause());
            }
        }));
    }

    public static <T> Mono<T> fromFuture(ThrowingSupplier<CompletableFuture<T>> future) {
        try {
            return Mono.fromFuture(future.get());
        } catch (Exception e) {
            return Mono.error(e);
        }
    }

    public static Mono<Boolean> areAllTrue(Mono<Boolean>... monos) {
        if (monos.length == 0) {
            return PublisherPool.FALSE;
        }
        return Flux.merge(monos)
                .collect(CollectorUtil.toList(monos.length))
                .map(results -> {
                    for (boolean result : results) {
                        if (!result) {
                            return false;
                        }
                    }
                    return true;
                });
    }

    public static Mono<Boolean> areAllTrue(@NotNull List<Mono<Boolean>> monos) {
        if (monos.isEmpty()) {
            return PublisherPool.FALSE;
        }
        return Flux.merge(monos)
                .collect(CollectorUtil.toList(monos.size()))
                .map(results -> {
                    for (boolean result : results) {
                        if (!result) {
                            return false;
                        }
                    }
                    return true;
                });
    }

    public static Mono<Boolean> atLeastOneTrue(@NotNull List<Mono<Boolean>> monos) {
        if (monos.isEmpty()) {
            return PublisherPool.FALSE;
        }
        return Flux.merge(monos)
                .collect(CollectorUtil.toList(monos.size()))
                .map(results -> {
                    for (boolean result : results) {
                        if (result) {
                            return true;
                        }
                    }
                    return false;
                });
    }

    public static Mono<Void> whenDelayError(Future<?>... futures) {
        int count = futures.length;
        if (count == 0) {
            return Mono.empty();
        }
        List<Mono<?>> monos = new ArrayList<>(count);
        for (Future<?> future : futures) {
            monos.add(fromFuture(future));
        }
        return Mono.whenDelayError(monos);
    }

}