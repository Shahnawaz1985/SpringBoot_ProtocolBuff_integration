// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Items.proto

package com.eric.spring.boot.collections.protoc_generated;

public final class ItemsProtoImpl {
  private ItemsProtoImpl() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Items_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Items_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\013Items.proto\"1\n\005Items\022\n\n\002id\030\001 \001(\t\022\r\n\005ti" +
      "tle\030\002 \001(\t\022\r\n\005price\030\003 \001(\001BE\n1com.eric.spr" +
      "ing.boot.collections.protoc_generatedB\016I" +
      "temsProtoImplP\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_Items_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_Items_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Items_descriptor,
        new java.lang.String[] { "Id", "Title", "Price", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
