// Code generated by protoc-gen-ts_proto. DO NOT EDIT.
// versions:
//   protoc-gen-ts_proto  v2.6.1
//   protoc               v5.29.1
// source: constant/request_status.proto

/* eslint-disable */

export const protobufPackage = "im.turms.proto";

export enum RequestStatus {
  PENDING = 0,
  ACCEPTED = 1,
  ACCEPTED_WITHOUT_CONFIRM = 2,
  DECLINED = 3,
  IGNORED = 4,
  EXPIRED = 5,
  CANCELED = 6,
  UNRECOGNIZED = -1,
}