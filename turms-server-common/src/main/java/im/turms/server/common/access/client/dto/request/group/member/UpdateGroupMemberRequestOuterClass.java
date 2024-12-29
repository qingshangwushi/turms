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

package im.turms.server.common.access.client.dto.request.group.member;

public final class UpdateGroupMemberRequestOuterClass {
    private UpdateGroupMemberRequestOuterClass() {
    }

    static {
        com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
                com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
                /* major= */ 4,
                /* minor= */ 29,
                /* patch= */ 1,
                /* suffix= */ "",
                UpdateGroupMemberRequestOuterClass.class.getName());
    }

    public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {
    }

    public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
        registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
    }

    static final com.google.protobuf.Descriptors.Descriptor internal_static_im_turms_proto_UpdateGroupMemberRequest_descriptor;
    static final com.google.protobuf.GeneratedMessage.FieldAccessorTable internal_static_im_turms_proto_UpdateGroupMemberRequest_fieldAccessorTable;

    public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
        return descriptor;
    }

    private static final com.google.protobuf.Descriptors.FileDescriptor descriptor;
    static {
        java.lang.String[] descriptorData = {"\n6request/group/member/update_group_memb"
                + "er_request.proto\022\016im.turms.proto\032 consta"
                + "nt/group_member_role.proto\032\030model/common"
                + "/value.proto\"\224\002\n\030UpdateGroupMemberReques"
                + "t\022\020\n\010group_id\030\001 \001(\003\022\021\n\tmember_id\030\002 \001(\003\022\021"
                + "\n\004name\030\003 \001(\tH\000\210\001\001\0222\n\004role\030\004 \001(\0162\037.im.tur"
                + "ms.proto.GroupMemberRoleH\001\210\001\001\022\032\n\rmute_en"
                + "d_date\030\005 \001(\003H\002\210\001\001\022\021\n\004note\030\006 \001(\tH\003\210\001\001\0220\n\021"
                + "custom_attributes\030\017 \003(\0132\025.im.turms.proto"
                + ".ValueB\007\n\005_nameB\007\n\005_roleB\020\n\016_mute_end_da"
                + "teB\007\n\005_noteBD\n=im.turms.server.common.ac"
                + "cess.client.dto.request.group.memberP\001\272\002"
                + "\000b\006proto3"};
        descriptor = com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
                descriptorData,
                new com.google.protobuf.Descriptors.FileDescriptor[]{
                        im.turms.server.common.access.client.dto.constant.GroupMemberRoleOuterClass
                                .getDescriptor(),
                        im.turms.server.common.access.client.dto.model.common.ValueOuterClass
                                .getDescriptor(),});
        internal_static_im_turms_proto_UpdateGroupMemberRequest_descriptor =
                getDescriptor().getMessageTypes()
                        .getFirst();
        internal_static_im_turms_proto_UpdateGroupMemberRequest_fieldAccessorTable =
                new com.google.protobuf.GeneratedMessage.FieldAccessorTable(
                        internal_static_im_turms_proto_UpdateGroupMemberRequest_descriptor,
                        new java.lang.String[]{"GroupId",
                                "MemberId",
                                "Name",
                                "Role",
                                "MuteEndDate",
                                "Note",
                                "CustomAttributes",});
        descriptor.resolveAllFeaturesImmutable();
        im.turms.server.common.access.client.dto.constant.GroupMemberRoleOuterClass.getDescriptor();
        im.turms.server.common.access.client.dto.model.common.ValueOuterClass.getDescriptor();
    }

    // @@protoc_insertion_point(outer_class_scope)
}