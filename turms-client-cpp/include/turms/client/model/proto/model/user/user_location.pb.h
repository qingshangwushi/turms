// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: model/user/user_location.proto
// Protobuf C++ Version: 5.29.1

#ifndef model_2fuser_2fuser_5flocation_2eproto_2epb_2eh
#define model_2fuser_2fuser_5flocation_2eproto_2epb_2eh

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
#include "google/protobuf/map.h"  // IWYU pragma: export
#include "google/protobuf/map_field_lite.h"
#include "google/protobuf/message_lite.h"
#include "google/protobuf/metadata_lite.h"
#include "google/protobuf/repeated_field.h"  // IWYU pragma: export
#include "turms/client/model/proto/model/common/value.pb.h"
// @@protoc_insertion_point(includes)

// Must be included last.
#include "google/protobuf/port_def.inc"

#define PROTOBUF_INTERNAL_EXPORT_model_2fuser_2fuser_5flocation_2eproto

namespace google {
namespace protobuf {
namespace internal {
template <typename T>
::absl::string_view GetAnyMessageName();
}  // namespace internal
}  // namespace protobuf
}  // namespace google

// Internal implementation detail -- do not use these members.
struct TableStruct_model_2fuser_2fuser_5flocation_2eproto {
    static const ::uint32_t offsets[];
};
namespace turms {
namespace client {
namespace model {
namespace proto {
class UserLocation;
struct UserLocationDefaultTypeInternal;
extern UserLocationDefaultTypeInternal _UserLocation_default_instance_;
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

// -------------------------------------------------------------------

class UserLocation final : public ::google::protobuf::MessageLite
/* @@protoc_insertion_point(class_definition:turms.client.model.proto.UserLocation) */ {
   public:
    inline UserLocation()
        : UserLocation(nullptr) {
    }
    ~UserLocation() PROTOBUF_FINAL;

#if defined(PROTOBUF_CUSTOM_VTABLE)
    void operator delete(UserLocation* msg, std::destroying_delete_t) {
        SharedDtor(*msg);
        ::google::protobuf::internal::SizedDelete(msg, sizeof(UserLocation));
    }
#endif

    template <typename = void>
    explicit PROTOBUF_CONSTEXPR UserLocation(::google::protobuf::internal::ConstantInitialized);

    inline UserLocation(const UserLocation& from)
        : UserLocation(nullptr, from) {
    }
    inline UserLocation(UserLocation&& from) noexcept
        : UserLocation(nullptr, std::move(from)) {
    }
    inline UserLocation& operator=(const UserLocation& from) {
        CopyFrom(from);
        return *this;
    }
    inline UserLocation& operator=(UserLocation&& from) noexcept {
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

    static const UserLocation& default_instance() {
        return *internal_default_instance();
    }
    static inline const UserLocation* internal_default_instance() {
        return reinterpret_cast<const UserLocation*>(&_UserLocation_default_instance_);
    }
    static constexpr int kIndexInFileMessages = 1;
    friend void swap(UserLocation& a, UserLocation& b) {
        a.Swap(&b);
    }
    inline void Swap(UserLocation* other) {
        if (other == this)
            return;
        if (::google::protobuf::internal::CanUseInternalSwap(GetArena(), other->GetArena())) {
            InternalSwap(other);
        } else {
            ::google::protobuf::internal::GenericSwap(this, other);
        }
    }
    void UnsafeArenaSwap(UserLocation* other) {
        if (other == this)
            return;
        ABSL_DCHECK(GetArena() == other->GetArena());
        InternalSwap(other);
    }

    // implements Message ----------------------------------------------

    UserLocation* New(::google::protobuf::Arena* arena = nullptr) const {
        return ::google::protobuf::MessageLite::DefaultConstruct<UserLocation>(arena);
    }
    void CopyFrom(const UserLocation& from);
    void MergeFrom(const UserLocation& from) {
        UserLocation::MergeImpl(*this, from);
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
    void InternalSwap(UserLocation* other);

   private:
    template <typename T>
    friend ::absl::string_view(::google::protobuf::internal::GetAnyMessageName)();
    static ::absl::string_view FullMessageName() {
        return "turms.client.model.proto.UserLocation";
    }

   protected:
    explicit UserLocation(::google::protobuf::Arena* arena);
    UserLocation(::google::protobuf::Arena* arena, const UserLocation& from);
    UserLocation(::google::protobuf::Arena* arena, UserLocation&& from) noexcept
        : UserLocation(arena) {
        *this = ::std::move(from);
    }
    const ::google::protobuf::internal::ClassData* GetClassData() const PROTOBUF_FINAL;
    static void* PlacementNew_(const void*, void* mem, ::google::protobuf::Arena* arena);
    static constexpr auto InternalNewImpl_();
    static const ::google::protobuf::internal::ClassDataLite<38> _class_data_;

   public:
    // nested types ----------------------------------------------------

    // accessors -------------------------------------------------------
    enum : int {
        kDetailsFieldNumber = 4,
        kCustomAttributesFieldNumber = 15,
        kLatitudeFieldNumber = 1,
        kLongitudeFieldNumber = 2,
        kTimestampFieldNumber = 3,
    };
    // map<string, string> details = 4;
    int details_size() const;

   private:
    int _internal_details_size() const;

   public:
    void clear_details();
    const ::google::protobuf::Map<std::string, std::string>& details() const;
    ::google::protobuf::Map<std::string, std::string>* mutable_details();

   private:
    const ::google::protobuf::Map<std::string, std::string>& _internal_details() const;
    ::google::protobuf::Map<std::string, std::string>* _internal_mutable_details();

   public:
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
    // float latitude = 1;
    void clear_latitude();
    float latitude() const;
    void set_latitude(float value);

   private:
    float _internal_latitude() const;
    void _internal_set_latitude(float value);

   public:
    // float longitude = 2;
    void clear_longitude();
    float longitude() const;
    void set_longitude(float value);

   private:
    float _internal_longitude() const;
    void _internal_set_longitude(float value);

   public:
    // optional int64 timestamp = 3;
    bool has_timestamp() const;
    void clear_timestamp();
    ::int64_t timestamp() const;
    void set_timestamp(::int64_t value);

   private:
    ::int64_t _internal_timestamp() const;
    void _internal_set_timestamp(::int64_t value);

   public:
    // @@protoc_insertion_point(class_scope:turms.client.model.proto.UserLocation)
   private:
    class _Internal;
    friend class ::google::protobuf::internal::TcParser;
    static const ::google::protobuf::internal::TcParseTable<3, 5, 2, 53, 2> _table_;

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
                              const UserLocation& from_msg);
        ::google::protobuf::internal::HasBits<1> _has_bits_;
        ::google::protobuf::internal::CachedSize _cached_size_;
        ::google::protobuf::internal::MapFieldLite<std::string, std::string> details_;
        ::google::protobuf::RepeatedPtrField<::turms::client::model::proto::Value>
            custom_attributes_;
        float latitude_;
        float longitude_;
        ::int64_t timestamp_;
        PROTOBUF_TSAN_DECLARE_MEMBER
    };
    union {
        Impl_ _impl_;
    };
    friend struct ::TableStruct_model_2fuser_2fuser_5flocation_2eproto;
};

// ===================================================================

// ===================================================================

#ifdef __GNUC__
#pragma GCC diagnostic push
#pragma GCC diagnostic ignored "-Wstrict-aliasing"
#endif  // __GNUC__
// -------------------------------------------------------------------

// -------------------------------------------------------------------

// UserLocation

// float latitude = 1;
inline void UserLocation::clear_latitude() {
    ::google::protobuf::internal::TSanWrite(&_impl_);
    _impl_.latitude_ = 0;
}
inline float UserLocation::latitude() const {
    // @@protoc_insertion_point(field_get:turms.client.model.proto.UserLocation.latitude)
    return _internal_latitude();
}
inline void UserLocation::set_latitude(float value) {
    _internal_set_latitude(value);
    // @@protoc_insertion_point(field_set:turms.client.model.proto.UserLocation.latitude)
}
inline float UserLocation::_internal_latitude() const {
    ::google::protobuf::internal::TSanRead(&_impl_);
    return _impl_.latitude_;
}
inline void UserLocation::_internal_set_latitude(float value) {
    ::google::protobuf::internal::TSanWrite(&_impl_);
    _impl_.latitude_ = value;
}

// float longitude = 2;
inline void UserLocation::clear_longitude() {
    ::google::protobuf::internal::TSanWrite(&_impl_);
    _impl_.longitude_ = 0;
}
inline float UserLocation::longitude() const {
    // @@protoc_insertion_point(field_get:turms.client.model.proto.UserLocation.longitude)
    return _internal_longitude();
}
inline void UserLocation::set_longitude(float value) {
    _internal_set_longitude(value);
    // @@protoc_insertion_point(field_set:turms.client.model.proto.UserLocation.longitude)
}
inline float UserLocation::_internal_longitude() const {
    ::google::protobuf::internal::TSanRead(&_impl_);
    return _impl_.longitude_;
}
inline void UserLocation::_internal_set_longitude(float value) {
    ::google::protobuf::internal::TSanWrite(&_impl_);
    _impl_.longitude_ = value;
}

// optional int64 timestamp = 3;
inline bool UserLocation::has_timestamp() const {
    bool value = (_impl_._has_bits_[0] & 0x00000001u) != 0;
    return value;
}
inline void UserLocation::clear_timestamp() {
    ::google::protobuf::internal::TSanWrite(&_impl_);
    _impl_.timestamp_ = ::int64_t{0};
    _impl_._has_bits_[0] &= ~0x00000001u;
}
inline ::int64_t UserLocation::timestamp() const {
    // @@protoc_insertion_point(field_get:turms.client.model.proto.UserLocation.timestamp)
    return _internal_timestamp();
}
inline void UserLocation::set_timestamp(::int64_t value) {
    _internal_set_timestamp(value);
    _impl_._has_bits_[0] |= 0x00000001u;
    // @@protoc_insertion_point(field_set:turms.client.model.proto.UserLocation.timestamp)
}
inline ::int64_t UserLocation::_internal_timestamp() const {
    ::google::protobuf::internal::TSanRead(&_impl_);
    return _impl_.timestamp_;
}
inline void UserLocation::_internal_set_timestamp(::int64_t value) {
    ::google::protobuf::internal::TSanWrite(&_impl_);
    _impl_.timestamp_ = value;
}

// map<string, string> details = 4;
inline int UserLocation::_internal_details_size() const {
    return _internal_details().size();
}
inline int UserLocation::details_size() const {
    return _internal_details_size();
}
inline void UserLocation::clear_details() {
    ::google::protobuf::internal::TSanWrite(&_impl_);
    _impl_.details_.Clear();
}
inline const ::google::protobuf::Map<std::string, std::string>& UserLocation::_internal_details()
    const {
    ::google::protobuf::internal::TSanRead(&_impl_);
    return _impl_.details_.GetMap();
}
inline const ::google::protobuf::Map<std::string, std::string>& UserLocation::details() const
    ABSL_ATTRIBUTE_LIFETIME_BOUND {
    // @@protoc_insertion_point(field_map:turms.client.model.proto.UserLocation.details)
    return _internal_details();
}
inline ::google::protobuf::Map<std::string, std::string>*
UserLocation::_internal_mutable_details() {
    ::google::protobuf::internal::TSanWrite(&_impl_);
    return _impl_.details_.MutableMap();
}
inline ::google::protobuf::Map<std::string, std::string>* UserLocation::mutable_details()
    ABSL_ATTRIBUTE_LIFETIME_BOUND {
    // @@protoc_insertion_point(field_mutable_map:turms.client.model.proto.UserLocation.details)
    return _internal_mutable_details();
}

// repeated .turms.client.model.proto.Value custom_attributes = 15;
inline int UserLocation::_internal_custom_attributes_size() const {
    return _internal_custom_attributes().size();
}
inline int UserLocation::custom_attributes_size() const {
    return _internal_custom_attributes_size();
}
inline ::turms::client::model::proto::Value* UserLocation::mutable_custom_attributes(int index)
    ABSL_ATTRIBUTE_LIFETIME_BOUND {
    // @@protoc_insertion_point(field_mutable:turms.client.model.proto.UserLocation.custom_attributes)
    return _internal_mutable_custom_attributes()->Mutable(index);
}
inline ::google::protobuf::RepeatedPtrField<::turms::client::model::proto::Value>*
UserLocation::mutable_custom_attributes() ABSL_ATTRIBUTE_LIFETIME_BOUND {
    // @@protoc_insertion_point(field_mutable_list:turms.client.model.proto.UserLocation.custom_attributes)
    ::google::protobuf::internal::TSanWrite(&_impl_);
    return _internal_mutable_custom_attributes();
}
inline const ::turms::client::model::proto::Value& UserLocation::custom_attributes(int index) const
    ABSL_ATTRIBUTE_LIFETIME_BOUND {
    // @@protoc_insertion_point(field_get:turms.client.model.proto.UserLocation.custom_attributes)
    return _internal_custom_attributes().Get(index);
}
inline ::turms::client::model::proto::Value* UserLocation::add_custom_attributes()
    ABSL_ATTRIBUTE_LIFETIME_BOUND {
    ::google::protobuf::internal::TSanWrite(&_impl_);
    ::turms::client::model::proto::Value* _add = _internal_mutable_custom_attributes()->Add();
    // @@protoc_insertion_point(field_add:turms.client.model.proto.UserLocation.custom_attributes)
    return _add;
}
inline const ::google::protobuf::RepeatedPtrField<::turms::client::model::proto::Value>&
UserLocation::custom_attributes() const ABSL_ATTRIBUTE_LIFETIME_BOUND {
    // @@protoc_insertion_point(field_list:turms.client.model.proto.UserLocation.custom_attributes)
    return _internal_custom_attributes();
}
inline const ::google::protobuf::RepeatedPtrField<::turms::client::model::proto::Value>&
UserLocation::_internal_custom_attributes() const {
    ::google::protobuf::internal::TSanRead(&_impl_);
    return _impl_.custom_attributes_;
}
inline ::google::protobuf::RepeatedPtrField<::turms::client::model::proto::Value>*
UserLocation::_internal_mutable_custom_attributes() {
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

#endif  // model_2fuser_2fuser_5flocation_2eproto_2epb_2eh