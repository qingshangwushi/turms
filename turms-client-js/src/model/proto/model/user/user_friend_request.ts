// Code generated by protoc-gen-ts_proto. DO NOT EDIT.
// versions:
//   protoc-gen-ts_proto  v2.6.1
//   protoc               v5.29.1
// source: model/user/user_friend_request.proto

/* eslint-disable */
import { BinaryReader, BinaryWriter } from "@bufbuild/protobuf/wire";
import { RequestStatus } from "../../constant/request_status";
import { Value } from "../common/value";

export const protobufPackage = "im.turms.proto";

export interface UserFriendRequest {
  id?: string | undefined;
  creationDate?: string | undefined;
  content?: string | undefined;
  requestStatus?: RequestStatus | undefined;
  reason?: string | undefined;
  expirationDate?: string | undefined;
  requesterId?: string | undefined;
  recipientId?: string | undefined;
  customAttributes: Value[];
}

function createBaseUserFriendRequest(): UserFriendRequest {
  return {
    id: undefined,
    creationDate: undefined,
    content: undefined,
    requestStatus: undefined,
    reason: undefined,
    expirationDate: undefined,
    requesterId: undefined,
    recipientId: undefined,
    customAttributes: [],
  };
}

export const UserFriendRequest: MessageFns<UserFriendRequest> = {
  encode(message: UserFriendRequest, writer: BinaryWriter = new BinaryWriter()): BinaryWriter {
    if (message.id !== undefined) {
      writer.uint32(8).int64(message.id);
    }
    if (message.creationDate !== undefined) {
      writer.uint32(16).int64(message.creationDate);
    }
    if (message.content !== undefined) {
      writer.uint32(26).string(message.content);
    }
    if (message.requestStatus !== undefined) {
      writer.uint32(32).int32(message.requestStatus);
    }
    if (message.reason !== undefined) {
      writer.uint32(42).string(message.reason);
    }
    if (message.expirationDate !== undefined) {
      writer.uint32(48).int64(message.expirationDate);
    }
    if (message.requesterId !== undefined) {
      writer.uint32(56).int64(message.requesterId);
    }
    if (message.recipientId !== undefined) {
      writer.uint32(64).int64(message.recipientId);
    }
    for (const v of message.customAttributes) {
      Value.encode(v!, writer.uint32(122).fork()).join();
    }
    return writer;
  },

  decode(input: BinaryReader | Uint8Array, length?: number): UserFriendRequest {
    const reader = input instanceof BinaryReader ? input : new BinaryReader(input);
    let end = length === undefined ? reader.len : reader.pos + length;
    const message = createBaseUserFriendRequest();
    while (reader.pos < end) {
      const tag = reader.uint32();
      switch (tag >>> 3) {
        case 1: {
          if (tag !== 8) {
            break;
          }

          message.id = reader.int64().toString();
          continue;
        }
        case 2: {
          if (tag !== 16) {
            break;
          }

          message.creationDate = reader.int64().toString();
          continue;
        }
        case 3: {
          if (tag !== 26) {
            break;
          }

          message.content = reader.string();
          continue;
        }
        case 4: {
          if (tag !== 32) {
            break;
          }

          message.requestStatus = reader.int32() as any;
          continue;
        }
        case 5: {
          if (tag !== 42) {
            break;
          }

          message.reason = reader.string();
          continue;
        }
        case 6: {
          if (tag !== 48) {
            break;
          }

          message.expirationDate = reader.int64().toString();
          continue;
        }
        case 7: {
          if (tag !== 56) {
            break;
          }

          message.requesterId = reader.int64().toString();
          continue;
        }
        case 8: {
          if (tag !== 64) {
            break;
          }

          message.recipientId = reader.int64().toString();
          continue;
        }
        case 15: {
          if (tag !== 122) {
            break;
          }

          message.customAttributes.push(Value.decode(reader, reader.uint32()));
          continue;
        }
      }
      if ((tag & 7) === 4 || tag === 0) {
        break;
      }
      reader.skip(tag & 7);
    }
    return message;
  },
};

export interface MessageFns<T> {
  encode(message: T, writer?: BinaryWriter): BinaryWriter;
  decode(input: BinaryReader | Uint8Array, length?: number): T;
}
