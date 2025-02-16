// Code generated by protoc-gen-ts_proto. DO NOT EDIT.
// versions:
//   protoc-gen-ts_proto  v2.6.1
//   protoc               v5.29.1
// source: model/conversation/group_conversation.proto

/* eslint-disable */
import { BinaryReader, BinaryWriter } from "@bufbuild/protobuf/wire";
import { Value } from "../common/value";

export const protobufPackage = "im.turms.proto";

export interface GroupConversation {
  groupId: string;
  memberIdToReadDate: { [key: string]: string };
  customAttributes: Value[];
}

export interface GroupConversation_MemberIdToReadDateEntry {
  key: string;
  value: string;
}

function createBaseGroupConversation(): GroupConversation {
  return { groupId: "0", memberIdToReadDate: {}, customAttributes: [] };
}

export const GroupConversation: MessageFns<GroupConversation> = {
  encode(message: GroupConversation, writer: BinaryWriter = new BinaryWriter()): BinaryWriter {
    if (message.groupId !== "0") {
      writer.uint32(8).int64(message.groupId);
    }
    Object.entries(message.memberIdToReadDate).forEach(([key, value]) => {
      GroupConversation_MemberIdToReadDateEntry.encode({ key: key as any, value }, writer.uint32(18).fork()).join();
    });
    for (const v of message.customAttributes) {
      Value.encode(v!, writer.uint32(122).fork()).join();
    }
    return writer;
  },

  decode(input: BinaryReader | Uint8Array, length?: number): GroupConversation {
    const reader = input instanceof BinaryReader ? input : new BinaryReader(input);
    let end = length === undefined ? reader.len : reader.pos + length;
    const message = createBaseGroupConversation();
    while (reader.pos < end) {
      const tag = reader.uint32();
      switch (tag >>> 3) {
        case 1: {
          if (tag !== 8) {
            break;
          }

          message.groupId = reader.int64().toString();
          continue;
        }
        case 2: {
          if (tag !== 18) {
            break;
          }

          const entry2 = GroupConversation_MemberIdToReadDateEntry.decode(reader, reader.uint32());
          if (entry2.value !== undefined) {
            message.memberIdToReadDate[entry2.key] = entry2.value;
          }
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

function createBaseGroupConversation_MemberIdToReadDateEntry(): GroupConversation_MemberIdToReadDateEntry {
  return { key: "0", value: "0" };
}

export const GroupConversation_MemberIdToReadDateEntry: MessageFns<GroupConversation_MemberIdToReadDateEntry> = {
  encode(message: GroupConversation_MemberIdToReadDateEntry, writer: BinaryWriter = new BinaryWriter()): BinaryWriter {
    if (message.key !== "0") {
      writer.uint32(8).int64(message.key);
    }
    if (message.value !== "0") {
      writer.uint32(16).int64(message.value);
    }
    return writer;
  },

  decode(input: BinaryReader | Uint8Array, length?: number): GroupConversation_MemberIdToReadDateEntry {
    const reader = input instanceof BinaryReader ? input : new BinaryReader(input);
    let end = length === undefined ? reader.len : reader.pos + length;
    const message = createBaseGroupConversation_MemberIdToReadDateEntry();
    while (reader.pos < end) {
      const tag = reader.uint32();
      switch (tag >>> 3) {
        case 1: {
          if (tag !== 8) {
            break;
          }

          message.key = reader.int64().toString();
          continue;
        }
        case 2: {
          if (tag !== 16) {
            break;
          }

          message.value = reader.int64().toString();
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
