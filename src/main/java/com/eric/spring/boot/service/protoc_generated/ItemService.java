// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ItemsResponse.proto

package com.eric.spring.boot.service.protoc_generated;

public final class ItemService {
  private ItemService() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_SingleItemsRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_SingleItemsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_SingleItemResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_SingleItemResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_AllItemseRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_AllItemseRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_AllItemsResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_AllItemsResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\023ItemsResponse.proto\032\013Items.proto\" \n\022Si" +
      "ngleItemsRequest\022\n\n\002id\030\001 \001(\t\"+\n\022SingleIt" +
      "emResponse\022\025\n\005items\030\001 \001(\0132\006.Items\"\036\n\020All" +
      "ItemseRequest\022\n\n\002id\030\001 \001(\t\")\n\020AllItemsRes" +
      "ponse\022\025\n\005items\030\001 \003(\0132\006.Items2x\n\014ItemsSer" +
      "vice\0226\n\nsingleItem\022\023.SingleItemsRequest\032" +
      "\023.SingleItemResponse\0220\n\010allItems\022\021.AllIt" +
      "emseRequest\032\021.AllItemsResponseB>\n-com.er" +
      "ic.spring.boot.service.protoc_generatedB" +
      "\013ItemServiceP\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.eric.spring.boot.collections.protoc_generated.ItemsProtoImpl.getDescriptor(),
        });
    internal_static_SingleItemsRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_SingleItemsRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_SingleItemsRequest_descriptor,
        new java.lang.String[] { "Id", });
    internal_static_SingleItemResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_SingleItemResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_SingleItemResponse_descriptor,
        new java.lang.String[] { "Items", });
    internal_static_AllItemseRequest_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_AllItemseRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_AllItemseRequest_descriptor,
        new java.lang.String[] { "Id", });
    internal_static_AllItemsResponse_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_AllItemsResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_AllItemsResponse_descriptor,
        new java.lang.String[] { "Items", });
    com.eric.spring.boot.collections.protoc_generated.ItemsProtoImpl.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
