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

package im.turms.server.common.infra.collection;

import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * @author James Chen
 */
public class ConcatIterator<T> implements Iterator<T> {

    private final Iterator<T> firstIterator;
    private final Iterator<T> secondIterator;

    public ConcatIterator(Iterator<T> firstIterator, Iterator<T> secondIterator) {
        this.firstIterator = firstIterator;
        this.secondIterator = secondIterator;
    }

    @Override
    public T next() {
        if (firstIterator.hasNext()) {
            return firstIterator.next();
        } else if (secondIterator.hasNext()) {
            return secondIterator.next();
        }
        throw new NoSuchElementException();
    }

    @Override
    public boolean hasNext() {
        return firstIterator.hasNext() || secondIterator.hasNext();
    }

}
