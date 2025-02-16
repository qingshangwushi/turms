// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: request/group/enrollment/query_group_join_requests_request.proto
// Protobuf C++ Version: 5.29.1

#ifndef request_2fgroup_2fenrollment_2fquery_5fgroup_5fjoin_5frequests_5frequest_2eproto_2epb_2eh
#define request_2fgroup_2fenrollment_2fquery_5fgroup_5fjoin_5frequests_5frequest_2eproto_2epb_2eh

#include <limits>
#include <string>
#include <type_traits>
#include <utility>

#include "google/protobuf/runtime_version.h"
#if PROTOBUF_VERSION != 5029001
#error "Protobuf C++ gencode is built with an incompatible version of"
#error "Protobuf C++ headers/runtime. See"
#error "https://protobuf.dev/support/cross-version-runtime-guarantee/#cpp"
#endif
#include "google/protobuf/arena.h"
#include "google/protobuf/arenastring.h"
#include "google/protobuf/extension_set.h"  // IWYU pragma: export
#include "google/protobuf/generated_message_tctable_decl.h"
#include "google/protobuf/generated_message_util.h"
#include "google/protobuf/io/coded_stream.h"
#include "google/protobuf/message_lite.h"
#include "google/protobuf/metadata_lite.h"
#include "google/protobuf/repeated_field.h"  // IWYU pragma: export
#include "turms/client/model/proto/model/common/value.pb.h"
// @@protoc_insertion_point(includes)

// Must be included last.
#include "google/protobuf/port_def.inc"

#define PROTOBUF_INTERNAL_EXPORT_request_2fgroup_2fenrollment_2fquery_5fgroup_5fjoin_5frequests_5frequest_2eproto

namespace google {
namespace protobuf {
namespace internal {
template <typename T>
::absl::string_view GetAnyMessageName();
}  // namespace internal
}  // namespace protobuf
}  // namespace google

// Internal implementation detail -- do not use these members.
struct
    TableStruct_request_2fgroup_2fenrollment_2fquery_5fgroup_5fjoin_5frequests_5frequest_2eproto {
    static const ::uint32_t offsets[];
};
namespace turms {
namespace client {
namespace model {
namespace proto {
class QueryGroupJoinRequestsRequest;
struct QueryGroupJoinRequestsRequestDefaultTypeInternal;
extern QueryGroupJoinRequestsRequestDefaultTypeInternal
    _QueryGroupJoinRequestsRequest_default_instance_;
}  // namespace proto
}  // namespace model
}  // namespace client
}  // namespace turms
namespace google {
namespace protobuf {}  // namespace protobuf
}  // namespace google

namespace turms {
namespace client {
namespace model {
namespace proto {

// ===================================================================

// -------------------------------------------------------------------

class QueryGroupJoinRequestsRequest final : public ::google::protobuf::MessageLite
/* @@protoc_insertion_point(class_definition:turms.client.model.proto.QueryGroupJoinRequestsRequest)
 */
{
   public:
    inline QueryGroupJoinRequestsRequest()
        : QueryGroupJoinRequestsRequest(nullptr) {
    }
    ~QueryGroupJoinRequestsRequest() PROTOBUF_FINAL;

#if defined(PROTOBUF_CUSTOM_VTABLE)
    void operator delete(QueryGroupJoinRequestsRequest* msg, std::destroying_delete_t) {
        SharedDtor(*msg);
        ::google::protobuf::internal::SizedDelete(msg, sizeof(QueryGroupJoinRequestsRequest));
    }
#endif

    template <typename = void>
    explicit PROTOBUF_CONSTEXPR QueryGroupJoinRequestsRequest(
        ::google::protobuf::internal::ConstantInitialized);

    inline QueryGroupJoinRequestsRequest(const QueryGroupJoinRequestsRequest& from)
        : QueryGroupJoinRequestsRequest(nullptr, from) {
    }
    inline QueryGroupJoinRequestsRequest(QueryGroupJoinRequestsRequest&& from) noexcept
        : QueryGroupJoinRequestsRequest(nullptr, std::move(from)) {
    }
    inline QueryGroupJoinRequestsRequest& operator=(const QueryGroupJoinRequestsRequest& from) {
        CopyFrom(from);
        return *this;
    }
    inline QueryGroupJoinRequestsRequest& operator=(QueryGroupJoinRequestsRequest&& from) noexcept {
        if (this == &from)
            return *this;
        if (::google::protobuf::internal::CanMoveWithInternalSwap(GetArena(), from.GetArena())) {
            InternalSwap(&from);
        } else {
            CopyFrom(from);
        }
        return *this;
    }

    inline const std::string& unknown_fields() const ABSL_ATTRIBUTE_LIFETIME_BOUND {
        return _internal_metadata_.unknown_fields<std::string>(
            ::google::protobuf::internal::GetEmptyString);
    }
    inline std::string* mutable_unknown_fields() ABSL_ATTRIBUTE_LIFETIME_BOUND {
        return _internal_metadata_.mutable_unknown_fields<std::string>();
    }

    static const QueryGroupJoinRequestsRequest& default_instance() {
        return *internal_default_instance();
    }
    static inline const QueryGroupJoinRequestsRequest* internal_default_instance() {
        return reinterpret_cast<const QueryGroupJoinRequestsRequest*>(
            &_QueryGroupJoinRequestsRequest_default_instance_);
    }
    static constexpr int kIndexInFileMessages = 0;
    friend void swap(QueryGroupJoinRequestsRequest& a, QueryGroupJoinRequestsRequest& b) {
        a.Swap(&b);
    }
    inline void Swap(QueryGroupJoinRequestsRequest* other) {
        if (other == this)
            return;
        if (::google::protobuf::internal::CanUseInternalSwap(GetArena(), other->GetArena())) {
            InternalSwap(other);
        } else {
            ::google::protobuf::internal::GenericSwap(this, other);
        }
    }
    void UnsafeArenaSwap(QueryGroupJoinRequestsRequest* other) {
        if (other == this)
            return;
        ABSL_DCHECK(GetArena() == other->GetArena());
        InternalSwap(other);
    }

    // implements Message ----------------------------------------------

    QueryGroupJoinRequestsRequest* New(::google::protobuf::Arena* arena = nullptr) const {
        return ::google::protobuf::MessageLite::DefaultConstruct<QueryGroupJoinRequestsRequest>(
            arena);
    }
    void CopyFrom(const QueryGroupJoinRequestsRequest& from);
    void MergeFrom(const QueryGroupJoinRequestsRequest& from) {
        QueryGroupJoinRequestsRequest::MergeImpl(*this, from);
    }

   private:
    static void MergeImpl(::google::protobuf::MessageLite& to_msg,
                          const ::google::protobuf::MessageLite& from_msg);

   public:
    bool IsInitialized() const {
        return true;
    }
    ABSL_ATTRIBUTE_REINITIALIZES void Clear() PROTOBUF_FINAL;
#if defined(PROTOBUF_CUSTOM_VTABLE)
   private:
    static ::size_t ByteSizeLong(const ::google::protobuf::MessageLite& msg);
    static ::uint8_t* _InternalSerialize(const MessageLite& msg,
                                         ::uint8_t* target,
                                         ::google::protobuf::io::EpsCopyOutputStream* stream);

   public:
    ::size_t ByteSizeLong() const {
        return ByteSizeLong(*this);
    }
    ::uint8_t* _InternalSerialize(::uint8_t* target,
                                  ::google::protobuf::io::EpsCopyOutputStream* stream) const {
        return _InternalSerialize(*this, target, stream);
    }
#else   // PROTOBUF_CUSTOM_VTABLE
    ::size_t ByteSizeLong() const final;
    ::uint8_t* _InternalSerialize(::uint8_t* target,
                                  ::google::protobuf::io::EpsCopyOutputStream* stream) const final;
#endif  // PROTOBUF_CUSTOM_VTABLE
    int GetCachedSize() const {
        return _impl_._cached_size_.Get();
    }

   private:
    void SharedCtor(::google::protobuf::Arena* arena);
    static void SharedDtor(MessageLite& self);
    void InternalSwap(QueryGroupJoinRequestsRequest* other);

   private:
    template <typename T>
    friend ::absl::string_view(::google::protobuf::internal::GetAnyMessageName)();
    static ::absl::string_view FullMessageName() {
        return "turms.client.model.proto.QueryGroupJoinRequestsRequest";
    }

   protected:
    explicit QueryGroupJoinRequestsRequest(::google::protobuf::Arena* arena);
    QueryGroupJoinRequestsRequest(::google::protobuf::Arena* arena,
                                  const QueryGroupJoinRequestsRequest& from);
    QueryGroupJoinRequestsRequest(::google::protobuf::Arena* arena,
                                  QueryGroupJoinRequestsRequest&& from) noexcept
        : QueryGroupJoinRequestsRequest(arena) {
        *this = ::std::move(from);
    }
    const ::google::protobuf::internal::ClassData* GetClassData() const PROTOBUF_FINAL;
    static void* PlacementNew_(const void*, void* mem, ::google::protobuf::Arena* arena);
    static constexpr auto InternalNewImpl_();
    static const ::google::protobuf::internal::ClassDataLite<55> _class_data_;

   public:
    // nested types ----------------------------------------------------

    // accessors -------------------------------------------------------
    enum : int {
        kCustomAttributesFieldNumber = 15,
        kGroupIdFieldNumber = 1,
        kLastUpdatedDateFieldNumber = 2,
    };
    // repeated .turms.client.model.proto.Value custom_attributes = 15;
    int custom_attributes_size() const;

   private:
    int _internal_custom_attributes_size() const;

   public:
    void clear_custom_attributes();
    ::turms::client::model::proto::Value* mutable_custom_attributes(int index);
    ::google::protobuf::RepeatedPtrField<::turms::client::model::proto::Value>*
    mutable_custom_attributes();

   private:
    const ::google::protobuf::RepeatedPtrField<::turms::client::model::proto::Value>&
    _internal_custom_attributes() const;
    ::google::protobuf::RepeatedPtrField<::turms::client::model::proto::Value>*
    _internal_mutable_custom_attributes();

   public:
    const ::turms::client::model::proto::Value& custom_attributes(int index) const;
    ::turms::client::model::proto::Value* add_custom_attributes();
    const ::google::protobuf::RepeatedPtrField<::turms::client::model::proto::Value>&
    custom_attributes() const;
    // optional int64 group_id = 1;
    bool has_group_id() const;
    void clear_group_id();
    ::int64_t group_id() const;
    void set_group_id(::int64_t value);

   private:
    ::int64_t _internal_group_id() const;
    void _internal_set_group_id(::int64_t value);

   public:
    // optional int64 last_updated_date = 2;
    bool has_last_updated_date() const;
    void clear_last_updated_date();
    ::int64_t last_updated_date() const;
    void set_last_updated_date(::int64_t value);

   private:
    ::int64_t _internal_last_updated_date() const;
    void _internal_set_last_updated_date(::int64_t value);

   public:
    // @@protoc_insertion_point(class_scope:turms.client.model.proto.QueryGroupJoinRequestsRequest)
   private:
    class _Internal;
    friend class ::google::protobuf::internal::TcParser;
    static const ::google::protobuf::internal::TcParseTable<2, 3, 1, 0, 2> _table_;

    friend class ::google::protobuf::MessageLite;
    friend class ::google::protobuf::Arena;
    template <typename T>
    friend class ::google::protobuf::Arena::InternalHelper;
    using InternalArenaConstructable_ = void;
    using DestructorSkippable_ = void;
    struct Impl_ {
        inline explicit constexpr Impl_(::google::protobuf::internal::ConstantInitialized) noexcept;
        inline explicit Impl_(::google::protobuf::internal::InternalVisibility visibility,
                              ::google::protobuf::Arena* arena);
        inline explicit Impl_(::google::protobuf::internal::InternalVisibility visibility,
                              ::google::protobuf::Arena* arena,
                              const Impl_& from,
                              const QueryGroupJoinRequestsRequest& from_msg);
        ::google::protobuf::internal::HasBits<1> _has_bits_;
        ::google::protobuf::internal::CachedSize _cached_size_;
        ::google::protobuf::RepeatedPtrField<::turms::client::model::proto::Value>
            custom_attributes_;
        ::int64_t group_id_;
        ::int64_t last_updated_date_;
        PROTOBUF_TSAN_DECLARE_MEMBER
    };
    union {
        Impl_ _impl_;
    };
    friend struct ::
        TableStruct_request_2fgroup_2fenrollment_2fquery_5fgroup_5fjoin_5frequests_5frequest_2eproto;
};

// ===================================================================

// ===================================================================

#ifdef __GNUC__
#pragma GCC diagnostic push
#pragma GCC diagnostic ignored "-Wstrict-aliasing"
#endif  // __GNUC__
// -------------------------------------------------------------------

// QueryGroupJoinRequestsRequest

// optional int64 group_id = 1;
inline bool QueryGroupJoinRequestsRequest::has_group_id() const {
    bool value = (_impl_._has_bits_[0] & 0x00000001u) != 0;
    return value;
}
inline void QueryGroupJoinRequestsRequest::clear_group_id() {
    ::google::protobuf::internal::TSanWrite(&_impl_);
    _impl_.group_id_ = ::int64_t{0};
    _impl_._has_bits_[0] &= ~0x00000001u;
}
inline ::int64_t QueryGroupJoinRequestsRequest::group_id() const {
    // @@protoc_insertion_point(field_get:turms.client.model.proto.QueryGroupJoinRequestsRequest.group_id)
    return _internal_group_id();
}
inline void QueryGroupJoinRequestsRequest::set_group_id(::int64_t value) {
    _internal_set_group_id(value);
    _impl_._has_bits_[0] |= 0x00000001u;
    // @@protoc_insertion_point(field_set:turms.client.model.proto.QueryGroupJoinRequestsRequest.group_id)
}
inline ::int64_t QueryGroupJoinRequestsRequest::_internal_group_id() const {
    ::google::protobuf::internal::TSanRead(&_impl_);
    return _impl_.group_id_;
}
inline void QueryGroupJoinRequestsRequest::_internal_set_group_id(::int64_t value) {
    ::google::protobuf::internal::TSanWrite(&_impl_);
    _impl_.group_id_ = value;
}

// optional int64 last_updated_date = 2;
inline bool QueryGroupJoinRequestsRequest::has_last_updated_date() const {
    bool value = (_impl_._has_bits_[0] & 0x00000002u) != 0;
    return value;
}
inline void QueryGroupJoinRequestsRequest::clear_last_updated_date() {
    ::google::protobuf::internal::TSanWrite(&_impl_);
    _impl_.last_updated_date_ = ::int64_t{0};
    _impl_._has_bits_[0] &= ~0x00000002u;
}
inline ::int64_t QueryGroupJoinRequestsRequest::last_updated_date() const {
    // @@protoc_insertion_point(field_get:turms.client.model.proto.QueryGroupJoinRequestsRequest.last_updated_date)
    return _internal_last_updated_date();
}
inline void QueryGroupJoinRequestsRequest::set_last_updated_date(::int64_t value) {
    _internal_set_last_updated_date(value);
    _impl_._has_bits_[0] |= 0x00000002u;
    // @@protoc_insertion_point(field_set:turms.client.model.proto.QueryGroupJoinRequestsRequest.last_updated_date)
}
inline ::int64_t QueryGroupJoinRequestsRequest::_internal_last_updated_date() const {
    ::google::protobuf::internal::TSanRead(&_impl_);
    return _impl_.last_updated_date_;
}
inline void QueryGroupJoinRequestsRequest::_internal_set_last_updated_date(::int64_t value) {
    ::google::protobuf::internal::TSanWrite(&_impl_);
    _impl_.last_updated_date_ = value;
}

// repeated .turms.client.model.proto.Value custom_attributes = 15;
inline int QueryGroupJoinRequestsRequest::_internal_custom_attributes_size() const {
    return _internal_custom_attributes().size();
}
inline int QueryGroupJoinRequestsRequest::custom_attributes_size() const {
    return _internal_custom_attributes_size();
}
inline ::turms::client::model::proto::Value*
QueryGroupJoinRequestsRequest::mutable_custom_attributes(int index) ABSL_ATTRIBUTE_LIFETIME_BOUND {
    // @@protoc_insertion_point(field_mutable:turms.client.model.proto.QueryGroupJoinRequestsRequest.custom_attributes)
    return _internal_mutable_custom_attributes()->Mutable(index);
}
inline ::google::protobuf::RepeatedPtrField<::turms::client::model::proto::Value>*
QueryGroupJoinRequestsRequest::mutable_custom_attributes() ABSL_ATTRIBUTE_LIFETIME_BOUND {
    // @@protoc_insertion_point(field_mutable_list:turms.client.model.proto.QueryGroupJoinRequestsRequest.custom_attributes)
    ::google::protobuf::internal::TSanWrite(&_impl_);
    return _internal_mutable_custom_attributes();
}
inline const ::turms::client::model::proto::Value& QueryGroupJoinRequestsRequest::custom_attributes(
    int index) const ABSL_ATTRIBUTE_LIFETIME_BOUND {
    // @@protoc_insertion_point(field_get:turms.client.model.proto.QueryGroupJoinRequestsRequest.custom_attributes)
    return _internal_custom_attributes().Get(index);
}
inline ::turms::client::model::proto::Value* QueryGroupJoinRequestsRequest::add_custom_attributes()
    ABSL_ATTRIBUTE_LIFETIME_BOUND {
    ::google::protobuf::internal::TSanWrite(&_impl_);
    ::turms::client::model::proto::Value* _add = _internal_mutable_custom_attributes()->Add();
    // @@protoc_insertion_point(field_add:turms.client.model.proto.QueryGroupJoinRequestsRequest.custom_attributes)
    return _add;
}
inline const ::google::protobuf::RepeatedPtrField<::turms::client::model::proto::Value>&
QueryGroupJoinRequestsRequest::custom_attributes() const ABSL_ATTRIBUTE_LIFETIME_BOUND {
    // @@protoc_insertion_point(field_list:turms.client.model.proto.QueryGroupJoinRequestsRequest.custom_attributes)
    return _internal_custom_attributes();
}
inline const ::google::protobuf::RepeatedPtrField<::turms::client::model::proto::Value>&
QueryGroupJoinRequestsRequest::_internal_custom_attributes() const {
    ::google::protobuf::internal::TSanRead(&_impl_);
    return _impl_.custom_attributes_;
}
inline ::google::protobuf::RepeatedPtrField<::turms::client::model::proto::Value>*
QueryGroupJoinRequestsRequest::_internal_mutable_custom_attributes() {
    ::google::protobuf::internal::TSanRead(&_impl_);
    return &_impl_.custom_attributes_;
}

#ifdef __GNUC__
#pragma GCC diagnostic pop
#endif  // __GNUC__

// @@protoc_insertion_point(namespace_scope)
}  // namespace proto
}  // namespace model
}  // namespace client
}  // namespace turms

// @@protoc_insertion_point(global_scope)

#include "google/protobuf/port_undef.inc"

#endif  // request_2fgroup_2fenrollment_2fquery_5fgroup_5fjoin_5frequests_5frequest_2eproto_2epb_2eh