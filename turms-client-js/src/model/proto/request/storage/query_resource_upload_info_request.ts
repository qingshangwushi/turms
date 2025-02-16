// Code generated by protoc-gen-ts_proto. DO NOT EDIT.
// versions:
//   protoc-gen-ts_proto  v2.6.1
//   protoc               v5.29.1
// source: request/storage/query_resource_upload_info_request.proto

/* eslint-disable */
import { BinaryReader, BinaryWriter } from "@bufbuild/protobuf/wire";
import { StorageResourceType } from "../../constant/storage_resource_type";
import { Value } from "../../model/common/value";

export const protobufPackage = "im.turms.proto";

export interface QueryResourceUploadInfoRequest {
  type: StorageResourceType;
  idNum?: string | undefined;
  idStr?: string | undefined;
  name?: string | undefined;
  mediaType?: string | undefined;
  customAttributes: Value[];
}

function createBaseQueryResourceUploadInfoRequest(): QueryResourceUploadInfoRequest {
  return { type: 0, idNum: undefined, idStr: undefined, name: undefined, mediaType: undefined, customAttributes: [] };
}

export const QueryResourceUploadInfoRequest: MessageFns<QueryResourceUploadInfoRequest> = {
  encode(message: QueryResourceUploadInfoRequest, writer: BinaryWriter = new BinaryWriter()): BinaryWriter {
    if (message.type !== 0) {
      writer.uint32(8).int32(message.type);
    }
    if (message.idNum !== undefined) {
      writer.uint32(16).int64(message.idNum);
    }
    if (message.idStr !== undefined) {
      writer.uint32(26).string(message.idStr);
    }
    if (message.name !== undefined) {
      writer.uint32(34).string(message.name);
    }
    if (message.mediaType !== undefined) {
      writer.uint32(42).string(message.mediaType);
    }
    for (const v of message.customAttributes) {
      Value.encode(v!, writer.uint32(122).fork()).join();
    }
    return writer;
  },

  decode(input: BinaryReader | Uint8Array, length?: number): QueryResourceUploadInfoRequest {
    const reader = input instanceof BinaryReader ? input : new BinaryReader(input);
    let end = length === undefined ? reader.len : reader.pos + length;
    const message = createBaseQueryResourceUploadInfoRequest();
    while (reader.pos < end) {
      const tag = reader.uint32();
      switch (tag >>> 3) {
        case 1: {
          if (tag !== 8) {
            break;
          }

          message.type = reader.int32() as any;
          continue;
        }
        case 2: {
          if (tag !== 16) {
            break;
          }

          message.idNum = reader.int64().toString();
          continue;
        }
        case 3: {
          if (tag !== 26) {
            break;
          }

          message.idStr = reader.string();
          continue;
        }
        case 4: {
          if (tag !== 34) {
            break;
          }

          message.name = reader.string();
          continue;
        }
        case 5: {
          if (tag !== 42) {
            break;
          }

          message.mediaType = reader.string();
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