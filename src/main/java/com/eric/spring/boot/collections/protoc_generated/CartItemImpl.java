// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: CartItem.proto

package com.eric.spring.boot.collections.protoc_generated;

public final class CartItemImpl {
  private CartItemImpl() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_CartItem_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_CartItem_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\016CartItem.proto\032\013Items.proto\">\n\010CartIte" +
      "m\022\n\n\002id\030\001 \001(\t\022\020\n\010quantity\030\025 \001(\005\022\024\n\004item\030" +
      "\003 \003(\0132\006.ItemsBC\n1com.eric.spring.boot.co" +
      "llections.protoc_generatedB\014CartItemImpl" +
      "P\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.eric.spring.boot.collections.protoc_generated.ItemsProtoImpl.getDescriptor(),
        });
    internal_static_CartItem_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_CartItem_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_CartItem_descriptor,
        new java.lang.String[] { "Id", "Quantity", "Item", });
    com.eric.spring.boot.collections.protoc_generated.ItemsProtoImpl.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
