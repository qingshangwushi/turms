// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: request/group/enrollment/update_group_join_question_request.proto
// Protobuf C++ Version: 5.29.1

#ifndef request_2fgroup_2fenrollment_2fupdate_5fgroup_5fjoin_5fquestion_5frequest_2eproto_2epb_2eh
#define request_2fgroup_2fenrollment_2fupdate_5fgroup_5fjoin_5fquestion_5frequest_2eproto_2epb_2eh

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

#define PROTOBUF_INTERNAL_EXPORT_request_2fgroup_2fenrollment_2fupdate_5fgroup_5fjoin_5fquestion_5frequest_2eproto

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
    TableStruct_request_2fgroup_2fenrollment_2fupdate_5fgroup_5fjoin_5fquestion_5frequest_2eproto {
    static const ::uint32_t offsets[];
};
namespace turms {
namespace client {
namespace model {
namespace proto {
class UpdateGroupJoinQuestionRequest;
struct UpdateGroupJoinQuestionRequestDefaultTypeInternal;
extern UpdateGroupJoinQuestionRequestDefaultTypeInternal
    _UpdateGroupJoinQuestionRequest_default_instance_;
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

class UpdateGroupJoinQuestionRequest final : public ::google::protobuf::MessageLite
/* @@protoc_insertion_point(class_definition:turms.client.model.proto.UpdateGroupJoinQuestionRequest)
 */
{
   public:
    inline UpdateGroupJoinQuestionRequest()
        : UpdateGroupJoinQuestionRequest(nullptr) {
    }
    ~UpdateGroupJoinQuestionRequest() PROTOBUF_FINAL;

#if defined(PROTOBUF_CUSTOM_VTABLE)
    void operator delete(UpdateGroupJoinQuestionRequest* msg, std::destroying_delete_t) {
        SharedDtor(*msg);
        ::google::protobuf::internal::SizedDelete(msg, sizeof(UpdateGroupJoinQuestionRequest));
    }
#endif

    template <typename = void>
    explicit PROTOBUF_CONSTEXPR UpdateGroupJoinQuestionRequest(
        ::google::protobuf::internal::ConstantInitialized);

    inline UpdateGroupJoinQuestionRequest(const UpdateGroupJoinQuestionRequest& from)
        : UpdateGroupJoinQuestionRequest(nullptr, from) {
    }
    inline UpdateGroupJoinQuestionRequest(UpdateGroupJoinQuestionRequest&& from) noexcept
        : UpdateGroupJoinQuestionRequest(nullptr, std::move(from)) {
    }
    inline UpdateGroupJoinQuestionRequest& operator=(const UpdateGroupJoinQuestionRequest& from) {
        CopyFrom(from);
        return *this;
    }
    inline UpdateGroupJoinQuestionRequest& operator=(
        UpdateGroupJoinQuestionRequest&& from) noexcept {
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

    static const UpdateGroupJoinQuestionRequest& default_instance() {
        return *internal_default_instance();
    }
    static inline const UpdateGroupJoinQuestionRequest* internal_default_instance() {
        return reinterpret_cast<const UpdateGroupJoinQuestionRequest*>(
            &_UpdateGroupJoinQuestionRequest_default_instance_);
    }
    static constexpr int kIndexInFileMessages = 0;
    friend void swap(UpdateGroupJoinQuestionRequest& a, UpdateGroupJoinQuestionRequest& b) {
        a.Swap(&b);
    }
    inline void Swap(UpdateGroupJoinQuestionRequest* other) {
        if (other == this)
            return;
        if (::google::protobuf::internal::CanUseInternalSwap(GetArena(), other->GetArena())) {
            InternalSwap(other);
        } else {
            ::google::protobuf::internal::GenericSwap(this, other);
        }
    }
    void UnsafeArenaSwap(UpdateGroupJoinQuestionRequest* other) {
        if (other == this)
            return;
        ABSL_DCHECK(GetArena() == other->GetArena());
        InternalSwap(other);
    }

    // implements Message ----------------------------------------------

    UpdateGroupJoinQuestionRequest* New(::google::protobuf::Arena* arena = nullptr) const {
        return ::google::protobuf::MessageLite::DefaultConstruct<UpdateGroupJoinQuestionRequest>(
            arena);
    }
    void CopyFrom(const UpdateGroupJoinQuestionRequest& from);
    void MergeFrom(const UpdateGroupJoinQuestionRequest& from) {
        UpdateGroupJoinQuestionRequest::MergeImpl(*this, from);
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
    void InternalSwap(UpdateGroupJoinQuestionRequest* other);

   private:
    template <typename T>
    friend ::absl::string_view(::google::protobuf::internal::GetAnyMessageName)();
    static ::absl::string_view FullMessageName() {
        return "turms.client.model.proto.UpdateGroupJoinQuestionRequest";
    }

   protected:
    explicit UpdateGroupJoinQuestionRequest(::google::protobuf::Arena* arena);
    UpdateGroupJoinQuestionRequest(::google::protobuf::Arena* arena,
                                   const UpdateGroupJoinQuestionRequest& from);
    UpdateGroupJoinQuestionRequest(::google::protobuf::Arena* arena,
                                   UpdateGroupJoinQuestionRequest&& from) noexcept
        : UpdateGroupJoinQuestionRequest(arena) {
        *this = ::std::move(from);
    }
    const ::google::protobuf::internal::ClassData* GetClassData() const PROTOBUF_FINAL;
    static void* PlacementNew_(const void*, void* mem, ::google::protobuf::Arena* arena);
    static constexpr auto InternalNewImpl_();
    static const ::google::protobuf::internal::ClassDataLite<56> _class_data_;

   public:
    // nested types ----------------------------------------------------

    // accessors -------------------------------------------------------
    enum : int {
        kAnswersFieldNumber = 3,
        kCustomAttributesFieldNumber = 15,
        kQuestionFieldNumber = 2,
        kQuestionIdFieldNumber = 1,
        kScoreFieldNumber = 4,
    };
    // repeated string answers = 3;
    int answers_size() const;

   private:
    int _internal_answers_size() const;

   public:
    void clear_answers();
    const std::string& answers(int index) const;
    std::string* mutable_answers(int index);
    template <typename Arg_ = const std::string&, typename... Args_>
    void set_answers(int index, Arg_&& value, Args_... args);
    std::string* add_answers();
    template <typename Arg_ = const std::string&, typename... Args_>
    void add_answers(Arg_&& value, Args_... args);
    const ::google::protobuf::RepeatedPtrField<std::string>& answers() const;
    ::google::protobuf::RepeatedPtrField<std::string>* mutable_answers();

   private:
    const ::google::protobuf::RepeatedPtrField<std::string>& _internal_answers() const;
    ::google::protobuf::RepeatedPtrField<std::string>* _internal_mutable_answers();

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
    // optional string question = 2;
    bool has_question() const;
    void clear_question();
    const std::string& question() const;
    template <typename Arg_ = const std::string&, typename... Args_>
    void set_question(Arg_&& arg, Args_... args);
    std::string* mutable_question();
    PROTOBUF_NODISCARD std::string* release_question();
    void set_allocated_question(std::string* value);

   private:
    const std::string& _internal_question() const;
    inline PROTOBUF_ALWAYS_INLINE void _internal_set_question(const std::string& value);
    std::string* _internal_mutable_question();

   public:
    // int64 question_id = 1;
    void clear_question_id();
    ::int64_t question_id() const;
    void set_question_id(::int64_t value);

   private:
    ::int64_t _internal_question_id() const;
    void _internal_set_question_id(::int64_t value);

   public:
    // optional int32 score = 4;
    bool has_score() const;
    void clear_score();
    ::int32_t score() const;
    void set_score(::int32_t value);

   private:
    ::int32_t _internal_score() const;
    void _internal_set_score(::int32_t value);

   public:
    // @@protoc_insertion_point(class_scope:turms.client.model.proto.UpdateGroupJoinQuestionRequest)
   private:
    class _Internal;
    friend class ::google::protobuf::internal::TcParser;
    static const ::google::protobuf::internal::TcParseTable<3, 5, 1, 79, 2> _table_;

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
                              const UpdateGroupJoinQuestionRequest& from_msg);
        ::google::protobuf::internal::HasBits<1> _has_bits_;
        ::google::protobuf::internal::CachedSize _cached_size_;
        ::google::protobuf::RepeatedPtrField<std::string> answers_;
        ::google::protobuf::RepeatedPtrField<::turms::client::model::proto::Value>
            custom_attributes_;
        ::google::protobuf::internal::ArenaStringPtr question_;
        ::int64_t question_id_;
        ::int32_t score_;
        PROTOBUF_TSAN_DECLARE_MEMBER
    };
    union {
        Impl_ _impl_;
    };
    friend struct ::
        TableStruct_request_2fgroup_2fenrollment_2fupdate_5fgroup_5fjoin_5fquestion_5frequest_2eproto;
};

// ===================================================================

// ===================================================================

#ifdef __GNUC__
#pragma GCC diagnostic push
#pragma GCC diagnostic ignored "-Wstrict-aliasing"
#endif  // __GNUC__
// -------------------------------------------------------------------

// UpdateGroupJoinQuestionRequest

// int64 question_id = 1;
inline void UpdateGroupJoinQuestionRequest::clear_question_id() {
    ::google::protobuf::internal::TSanWrite(&_impl_);
    _impl_.question_id_ = ::int64_t{0};
}
inline ::int64_t UpdateGroupJoinQuestionRequest::question_id() const {
    // @@protoc_insertion_point(field_get:turms.client.model.proto.UpdateGroupJoinQuestionRequest.question_id)
    return _internal_question_id();
}
inline void UpdateGroupJoinQuestionRequest::set_question_id(::int64_t value) {
    _internal_set_question_id(value);
    // @@protoc_insertion_point(field_set:turms.client.model.proto.UpdateGroupJoinQuestionRequest.question_id)
}
inline ::int64_t UpdateGroupJoinQuestionRequest::_internal_question_id() const {
    ::google::protobuf::internal::TSanRead(&_impl_);
    return _impl_.question_id_;
}
inline void UpdateGroupJoinQuestionRequest::_internal_set_question_id(::int64_t value) {
    ::google::protobuf::internal::TSanWrite(&_impl_);
    _impl_.question_id_ = value;
}

// optional string question = 2;
inline bool UpdateGroupJoinQuestionRequest::has_question() const {
    bool value = (_impl_._has_bits_[0] & 0x00000001u) != 0;
    return value;
}
inline void UpdateGroupJoinQuestionRequest::clear_question() {
    ::google::protobuf::internal::TSanWrite(&_impl_);
    _impl_.question_.ClearToEmpty();
    _impl_._has_bits_[0] &= ~0x00000001u;
}
inline const std::string& UpdateGroupJoinQuestionRequest::question() const
    ABSL_ATTRIBUTE_LIFETIME_BOUND {
    // @@protoc_insertion_point(field_get:turms.client.model.proto.UpdateGroupJoinQuestionRequest.question)
    return _internal_question();
}
template <typename Arg_, typename... Args_>
inline PROTOBUF_ALWAYS_INLINE void UpdateGroupJoinQuestionRequest::set_question(Arg_&& arg,
                                                                                Args_... args) {
    ::google::protobuf::internal::TSanWrite(&_impl_);
    _impl_._has_bits_[0] |= 0x00000001u;
    _impl_.question_.Set(static_cast<Arg_&&>(arg), args..., GetArena());
    // @@protoc_insertion_point(field_set:turms.client.model.proto.UpdateGroupJoinQuestionRequest.question)
}
inline std::string* UpdateGroupJoinQuestionRequest::mutable_question()
    ABSL_ATTRIBUTE_LIFETIME_BOUND {
    std::string* _s = _internal_mutable_question();
    // @@protoc_insertion_point(field_mutable:turms.client.model.proto.UpdateGroupJoinQuestionRequest.question)
    return _s;
}
inline const std::string& UpdateGroupJoinQuestionRequest::_internal_question() const {
    ::google::protobuf::internal::TSanRead(&_impl_);
    return _impl_.question_.Get();
}
inline void UpdateGroupJoinQuestionRequest::_internal_set_question(const std::string& value) {
    ::google::protobuf::internal::TSanWrite(&_impl_);
    _impl_._has_bits_[0] |= 0x00000001u;
    _impl_.question_.Set(value, GetArena());
}
inline std::string* UpdateGroupJoinQuestionRequest::_internal_mutable_question() {
    ::google::protobuf::internal::TSanWrite(&_impl_);
    _impl_._has_bits_[0] |= 0x00000001u;
    return _impl_.question_.Mutable(GetArena());
}
inline std::string* UpdateGroupJoinQuestionRequest::release_question() {
    ::google::protobuf::internal::TSanWrite(&_impl_);
    // @@protoc_insertion_point(field_release:turms.client.model.proto.UpdateGroupJoinQuestionRequest.question)
    if ((_impl_._has_bits_[0] & 0x00000001u) == 0) {
        return nullptr;
    }
    _impl_._has_bits_[0] &= ~0x00000001u;
    auto* released = _impl_.question_.Release();
    if (::google::protobuf::internal::DebugHardenForceCopyDefaultString()) {
        _impl_.question_.Set("", GetArena());
    }
    return released;
}
inline void UpdateGroupJoinQuestionRequest::set_allocated_question(std::string* value) {
    ::google::protobuf::internal::TSanWrite(&_impl_);
    if (value != nullptr) {
        _impl_._has_bits_[0] |= 0x00000001u;
    } else {
        _impl_._has_bits_[0] &= ~0x00000001u;
    }
    _impl_.question_.SetAllocated(value, GetArena());
    if (::google::protobuf::internal::DebugHardenForceCopyDefaultString() &&
        _impl_.question_.IsDefault()) {
        _impl_.question_.Set("", GetArena());
    }
    // @@protoc_insertion_point(field_set_allocated:turms.client.model.proto.UpdateGroupJoinQuestionRequest.question)
}

// repeated string answers = 3;
inline int UpdateGroupJoinQuestionRequest::_internal_answers_size() const {
    return _internal_answers().size();
}
inline int UpdateGroupJoinQuestionRequest::answers_size() const {
    return _internal_answers_size();
}
inline void UpdateGroupJoinQuestionRequest::clear_answers() {
    ::google::protobuf::internal::TSanWrite(&_impl_);
    _impl_.answers_.Clear();
}
inline std::string* UpdateGroupJoinQuestionRequest::add_answers() ABSL_ATTRIBUTE_LIFETIME_BOUND {
    ::google::protobuf::internal::TSanWrite(&_impl_);
    std::string* _s = _internal_mutable_answers()->Add();
    // @@protoc_insertion_point(field_add_mutable:turms.client.model.proto.UpdateGroupJoinQuestionRequest.answers)
    return _s;
}
inline const std::string& UpdateGroupJoinQuestionRequest::answers(int index) const
    ABSL_ATTRIBUTE_LIFETIME_BOUND {
    // @@protoc_insertion_point(field_get:turms.client.model.proto.UpdateGroupJoinQuestionRequest.answers)
    return _internal_answers().Get(index);
}
inline std::string* UpdateGroupJoinQuestionRequest::mutable_answers(int index)
    ABSL_ATTRIBUTE_LIFETIME_BOUND {
    // @@protoc_insertion_point(field_mutable:turms.client.model.proto.UpdateGroupJoinQuestionRequest.answers)
    return _internal_mutable_answers()->Mutable(index);
}
template <typename Arg_, typename... Args_>
inline void UpdateGroupJoinQuestionRequest::set_answers(int index, Arg_&& value, Args_... args) {
    ::google::protobuf::internal::AssignToString(
        *_internal_mutable_answers()->Mutable(index), std::forward<Arg_>(value), args...);
    // @@protoc_insertion_point(field_set:turms.client.model.proto.UpdateGroupJoinQuestionRequest.answers)
}
template <typename Arg_, typename... Args_>
inline void UpdateGroupJoinQuestionRequest::add_answers(Arg_&& value, Args_... args) {
    ::google::protobuf::internal::TSanWrite(&_impl_);
    ::google::protobuf::internal::AddToRepeatedPtrField(
        *_internal_mutable_answers(), std::forward<Arg_>(value), args...);
    // @@protoc_insertion_point(field_add:turms.client.model.proto.UpdateGroupJoinQuestionRequest.answers)
}
inline const ::google::protobuf::RepeatedPtrField<std::string>&
UpdateGroupJoinQuestionRequest::answers() const ABSL_ATTRIBUTE_LIFETIME_BOUND {
    // @@protoc_insertion_point(field_list:turms.client.model.proto.UpdateGroupJoinQuestionRequest.answers)
    return _internal_answers();
}
inline ::google::protobuf::RepeatedPtrField<std::string>*
UpdateGroupJoinQuestionRequest::mutable_answers() ABSL_ATTRIBUTE_LIFETIME_BOUND {
    // @@protoc_insertion_point(field_mutable_list:turms.client.model.proto.UpdateGroupJoinQuestionRequest.answers)
    ::google::protobuf::internal::TSanWrite(&_impl_);
    return _internal_mutable_answers();
}
inline const ::google::protobuf::RepeatedPtrField<std::string>&
UpdateGroupJoinQuestionRequest::_internal_answers() const {
    ::google::protobuf::internal::TSanRead(&_impl_);
    return _impl_.answers_;
}
inline ::google::protobuf::RepeatedPtrField<std::string>*
UpdateGroupJoinQuestionRequest::_internal_mutable_answers() {
    ::google::protobuf::internal::TSanRead(&_impl_);
    return &_impl_.answers_;
}

// optional int32 score = 4;
inline bool UpdateGroupJoinQuestionRequest::has_score() const {
    bool value = (_impl_._has_bits_[0] & 0x00000002u) != 0;
    return value;
}
inline void UpdateGroupJoinQuestionRequest::clear_score() {
    ::google::protobuf::internal::TSanWrite(&_impl_);
    _impl_.score_ = 0;
    _impl_._has_bits_[0] &= ~0x00000002u;
}
inline ::int32_t UpdateGroupJoinQuestionRequest::score() const {
    // @@protoc_insertion_point(field_get:turms.client.model.proto.UpdateGroupJoinQuestionRequest.score)
    return _internal_score();
}
inline void UpdateGroupJoinQuestionRequest::set_score(::int32_t value) {
    _internal_set_score(value);
    _impl_._has_bits_[0] |= 0x00000002u;
    // @@protoc_insertion_point(field_set:turms.client.model.proto.UpdateGroupJoinQuestionRequest.score)
}
inline ::int32_t UpdateGroupJoinQuestionRequest::_internal_score() const {
    ::google::protobuf::internal::TSanRead(&_impl_);
    return _impl_.score_;
}
inline void UpdateGroupJoinQuestionRequest::_internal_set_score(::int32_t value) {
    ::google::protobuf::internal::TSanWrite(&_impl_);
    _impl_.score_ = value;
}

// repeated .turms.client.model.proto.Value custom_attributes = 15;
inline int UpdateGroupJoinQuestionRequest::_internal_custom_attributes_size() const {
    return _internal_custom_attributes().size();
}
inline int UpdateGroupJoinQuestionRequest::custom_attributes_size() const {
    return _internal_custom_attributes_size();
}
inline ::turms::client::model::proto::Value*
UpdateGroupJoinQuestionRequest::mutable_custom_attributes(int index) ABSL_ATTRIBUTE_LIFETIME_BOUND {
    // @@protoc_insertion_point(field_mutable:turms.client.model.proto.UpdateGroupJoinQuestionRequest.custom_attributes)
    return _internal_mutable_custom_attributes()->Mutable(index);
}
inline ::google::protobuf::RepeatedPtrField<::turms::client::model::proto::Value>*
UpdateGroupJoinQuestionRequest::mutable_custom_attributes() ABSL_ATTRIBUTE_LIFETIME_BOUND {
    // @@protoc_insertion_point(field_mutable_list:turms.client.model.proto.UpdateGroupJoinQuestionRequest.custom_attributes)
    ::google::protobuf::internal::TSanWrite(&_impl_);
    return _internal_mutable_custom_attributes();
}
inline const ::turms::client::model::proto::Value&
UpdateGroupJoinQuestionRequest::custom_attributes(int index) const ABSL_ATTRIBUTE_LIFETIME_BOUND {
    // @@protoc_insertion_point(field_get:turms.client.model.proto.UpdateGroupJoinQuestionRequest.custom_attributes)
    return _internal_custom_attributes().Get(index);
}
inline ::turms::client::model::proto::Value* UpdateGroupJoinQuestionRequest::add_custom_attributes()
    ABSL_ATTRIBUTE_LIFETIME_BOUND {
    ::google::protobuf::internal::TSanWrite(&_impl_);
    ::turms::client::model::proto::Value* _add = _internal_mutable_custom_attributes()->Add();
    // @@protoc_insertion_point(field_add:turms.client.model.proto.UpdateGroupJoinQuestionRequest.custom_attributes)
    return _add;
}
inline const ::google::protobuf::RepeatedPtrField<::turms::client::model::proto::Value>&
UpdateGroupJoinQuestionRequest::custom_attributes() const ABSL_ATTRIBUTE_LIFETIME_BOUND {
    // @@protoc_insertion_point(field_list:turms.client.model.proto.UpdateGroupJoinQuestionRequest.custom_attributes)
    return _internal_custom_attributes();
}
inline const ::google::protobuf::RepeatedPtrField<::turms::client::model::proto::Value>&
UpdateGroupJoinQuestionRequest::_internal_custom_attributes() const {
    ::google::protobuf::internal::TSanRead(&_impl_);
    return _impl_.custom_attributes_;
}
inline ::google::protobuf::RepeatedPtrField<::turms::client::model::proto::Value>*
UpdateGroupJoinQuestionRequest::_internal_mutable_custom_attributes() {
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

#endif  // request_2fgroup_2fenrollment_2fupdate_5fgroup_5fjoin_5fquestion_5frequest_2eproto_2epb_2eh