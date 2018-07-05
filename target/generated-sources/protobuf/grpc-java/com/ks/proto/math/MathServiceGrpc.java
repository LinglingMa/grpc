package com.ks.proto.math;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.10.0)",
    comments = "Source: math.proto")
public final class MathServiceGrpc {

  private MathServiceGrpc() {}

  public static final String SERVICE_NAME = "MathService";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getAddMethod()} instead. 
  public static final io.grpc.MethodDescriptor<com.ks.proto.math.MathRequest,
      com.ks.proto.math.MathResponse> METHOD_ADD = getAddMethodHelper();

  private static volatile io.grpc.MethodDescriptor<com.ks.proto.math.MathRequest,
      com.ks.proto.math.MathResponse> getAddMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<com.ks.proto.math.MathRequest,
      com.ks.proto.math.MathResponse> getAddMethod() {
    return getAddMethodHelper();
  }

  private static io.grpc.MethodDescriptor<com.ks.proto.math.MathRequest,
      com.ks.proto.math.MathResponse> getAddMethodHelper() {
    io.grpc.MethodDescriptor<com.ks.proto.math.MathRequest, com.ks.proto.math.MathResponse> getAddMethod;
    if ((getAddMethod = MathServiceGrpc.getAddMethod) == null) {
      synchronized (MathServiceGrpc.class) {
        if ((getAddMethod = MathServiceGrpc.getAddMethod) == null) {
          MathServiceGrpc.getAddMethod = getAddMethod = 
              io.grpc.MethodDescriptor.<com.ks.proto.math.MathRequest, com.ks.proto.math.MathResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "MathService", "add"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ks.proto.math.MathRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ks.proto.math.MathResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new MathServiceMethodDescriptorSupplier("add"))
                  .build();
          }
        }
     }
     return getAddMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getMinusMethod()} instead. 
  public static final io.grpc.MethodDescriptor<com.ks.proto.math.MathRequest,
      com.ks.proto.math.MathResponse> METHOD_MINUS = getMinusMethodHelper();

  private static volatile io.grpc.MethodDescriptor<com.ks.proto.math.MathRequest,
      com.ks.proto.math.MathResponse> getMinusMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<com.ks.proto.math.MathRequest,
      com.ks.proto.math.MathResponse> getMinusMethod() {
    return getMinusMethodHelper();
  }

  private static io.grpc.MethodDescriptor<com.ks.proto.math.MathRequest,
      com.ks.proto.math.MathResponse> getMinusMethodHelper() {
    io.grpc.MethodDescriptor<com.ks.proto.math.MathRequest, com.ks.proto.math.MathResponse> getMinusMethod;
    if ((getMinusMethod = MathServiceGrpc.getMinusMethod) == null) {
      synchronized (MathServiceGrpc.class) {
        if ((getMinusMethod = MathServiceGrpc.getMinusMethod) == null) {
          MathServiceGrpc.getMinusMethod = getMinusMethod = 
              io.grpc.MethodDescriptor.<com.ks.proto.math.MathRequest, com.ks.proto.math.MathResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "MathService", "minus"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ks.proto.math.MathRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ks.proto.math.MathResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new MathServiceMethodDescriptorSupplier("minus"))
                  .build();
          }
        }
     }
     return getMinusMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getMultiMethod()} instead. 
  public static final io.grpc.MethodDescriptor<com.ks.proto.math.MathRequest,
      com.ks.proto.math.MathResponse> METHOD_MULTI = getMultiMethodHelper();

  private static volatile io.grpc.MethodDescriptor<com.ks.proto.math.MathRequest,
      com.ks.proto.math.MathResponse> getMultiMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<com.ks.proto.math.MathRequest,
      com.ks.proto.math.MathResponse> getMultiMethod() {
    return getMultiMethodHelper();
  }

  private static io.grpc.MethodDescriptor<com.ks.proto.math.MathRequest,
      com.ks.proto.math.MathResponse> getMultiMethodHelper() {
    io.grpc.MethodDescriptor<com.ks.proto.math.MathRequest, com.ks.proto.math.MathResponse> getMultiMethod;
    if ((getMultiMethod = MathServiceGrpc.getMultiMethod) == null) {
      synchronized (MathServiceGrpc.class) {
        if ((getMultiMethod = MathServiceGrpc.getMultiMethod) == null) {
          MathServiceGrpc.getMultiMethod = getMultiMethod = 
              io.grpc.MethodDescriptor.<com.ks.proto.math.MathRequest, com.ks.proto.math.MathResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "MathService", "multi"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ks.proto.math.MathRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ks.proto.math.MathResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new MathServiceMethodDescriptorSupplier("multi"))
                  .build();
          }
        }
     }
     return getMultiMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getDivideMethod()} instead. 
  public static final io.grpc.MethodDescriptor<com.ks.proto.math.MathRequest,
      com.ks.proto.math.MathResponse> METHOD_DIVIDE = getDivideMethodHelper();

  private static volatile io.grpc.MethodDescriptor<com.ks.proto.math.MathRequest,
      com.ks.proto.math.MathResponse> getDivideMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<com.ks.proto.math.MathRequest,
      com.ks.proto.math.MathResponse> getDivideMethod() {
    return getDivideMethodHelper();
  }

  private static io.grpc.MethodDescriptor<com.ks.proto.math.MathRequest,
      com.ks.proto.math.MathResponse> getDivideMethodHelper() {
    io.grpc.MethodDescriptor<com.ks.proto.math.MathRequest, com.ks.proto.math.MathResponse> getDivideMethod;
    if ((getDivideMethod = MathServiceGrpc.getDivideMethod) == null) {
      synchronized (MathServiceGrpc.class) {
        if ((getDivideMethod = MathServiceGrpc.getDivideMethod) == null) {
          MathServiceGrpc.getDivideMethod = getDivideMethod = 
              io.grpc.MethodDescriptor.<com.ks.proto.math.MathRequest, com.ks.proto.math.MathResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "MathService", "divide"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ks.proto.math.MathRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ks.proto.math.MathResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new MathServiceMethodDescriptorSupplier("divide"))
                  .build();
          }
        }
     }
     return getDivideMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static MathServiceStub newStub(io.grpc.Channel channel) {
    return new MathServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static MathServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new MathServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static MathServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new MathServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class MathServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void add(com.ks.proto.math.MathRequest request,
        io.grpc.stub.StreamObserver<com.ks.proto.math.MathResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getAddMethodHelper(), responseObserver);
    }

    /**
     */
    public void minus(com.ks.proto.math.MathRequest request,
        io.grpc.stub.StreamObserver<com.ks.proto.math.MathResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getMinusMethodHelper(), responseObserver);
    }

    /**
     */
    public void multi(com.ks.proto.math.MathRequest request,
        io.grpc.stub.StreamObserver<com.ks.proto.math.MathResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getMultiMethodHelper(), responseObserver);
    }

    /**
     */
    public void divide(com.ks.proto.math.MathRequest request,
        io.grpc.stub.StreamObserver<com.ks.proto.math.MathResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getDivideMethodHelper(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getAddMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                com.ks.proto.math.MathRequest,
                com.ks.proto.math.MathResponse>(
                  this, METHODID_ADD)))
          .addMethod(
            getMinusMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                com.ks.proto.math.MathRequest,
                com.ks.proto.math.MathResponse>(
                  this, METHODID_MINUS)))
          .addMethod(
            getMultiMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                com.ks.proto.math.MathRequest,
                com.ks.proto.math.MathResponse>(
                  this, METHODID_MULTI)))
          .addMethod(
            getDivideMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                com.ks.proto.math.MathRequest,
                com.ks.proto.math.MathResponse>(
                  this, METHODID_DIVIDE)))
          .build();
    }
  }

  /**
   */
  public static final class MathServiceStub extends io.grpc.stub.AbstractStub<MathServiceStub> {
    private MathServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private MathServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MathServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new MathServiceStub(channel, callOptions);
    }

    /**
     */
    public void add(com.ks.proto.math.MathRequest request,
        io.grpc.stub.StreamObserver<com.ks.proto.math.MathResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getAddMethodHelper(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void minus(com.ks.proto.math.MathRequest request,
        io.grpc.stub.StreamObserver<com.ks.proto.math.MathResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getMinusMethodHelper(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void multi(com.ks.proto.math.MathRequest request,
        io.grpc.stub.StreamObserver<com.ks.proto.math.MathResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getMultiMethodHelper(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void divide(com.ks.proto.math.MathRequest request,
        io.grpc.stub.StreamObserver<com.ks.proto.math.MathResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDivideMethodHelper(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class MathServiceBlockingStub extends io.grpc.stub.AbstractStub<MathServiceBlockingStub> {
    private MathServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private MathServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MathServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new MathServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.ks.proto.math.MathResponse add(com.ks.proto.math.MathRequest request) {
      return blockingUnaryCall(
          getChannel(), getAddMethodHelper(), getCallOptions(), request);
    }

    /**
     */
    public com.ks.proto.math.MathResponse minus(com.ks.proto.math.MathRequest request) {
      return blockingUnaryCall(
          getChannel(), getMinusMethodHelper(), getCallOptions(), request);
    }

    /**
     */
    public com.ks.proto.math.MathResponse multi(com.ks.proto.math.MathRequest request) {
      return blockingUnaryCall(
          getChannel(), getMultiMethodHelper(), getCallOptions(), request);
    }

    /**
     */
    public com.ks.proto.math.MathResponse divide(com.ks.proto.math.MathRequest request) {
      return blockingUnaryCall(
          getChannel(), getDivideMethodHelper(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class MathServiceFutureStub extends io.grpc.stub.AbstractStub<MathServiceFutureStub> {
    private MathServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private MathServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MathServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new MathServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.ks.proto.math.MathResponse> add(
        com.ks.proto.math.MathRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getAddMethodHelper(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.ks.proto.math.MathResponse> minus(
        com.ks.proto.math.MathRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getMinusMethodHelper(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.ks.proto.math.MathResponse> multi(
        com.ks.proto.math.MathRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getMultiMethodHelper(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.ks.proto.math.MathResponse> divide(
        com.ks.proto.math.MathRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDivideMethodHelper(), getCallOptions()), request);
    }
  }

  private static final int METHODID_ADD = 0;
  private static final int METHODID_MINUS = 1;
  private static final int METHODID_MULTI = 2;
  private static final int METHODID_DIVIDE = 3;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final MathServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(MathServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_ADD:
          serviceImpl.add((com.ks.proto.math.MathRequest) request,
              (io.grpc.stub.StreamObserver<com.ks.proto.math.MathResponse>) responseObserver);
          break;
        case METHODID_MINUS:
          serviceImpl.minus((com.ks.proto.math.MathRequest) request,
              (io.grpc.stub.StreamObserver<com.ks.proto.math.MathResponse>) responseObserver);
          break;
        case METHODID_MULTI:
          serviceImpl.multi((com.ks.proto.math.MathRequest) request,
              (io.grpc.stub.StreamObserver<com.ks.proto.math.MathResponse>) responseObserver);
          break;
        case METHODID_DIVIDE:
          serviceImpl.divide((com.ks.proto.math.MathRequest) request,
              (io.grpc.stub.StreamObserver<com.ks.proto.math.MathResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class MathServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    MathServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.ks.proto.math.MathProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("MathService");
    }
  }

  private static final class MathServiceFileDescriptorSupplier
      extends MathServiceBaseDescriptorSupplier {
    MathServiceFileDescriptorSupplier() {}
  }

  private static final class MathServiceMethodDescriptorSupplier
      extends MathServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    MathServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (MathServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new MathServiceFileDescriptorSupplier())
              .addMethod(getAddMethodHelper())
              .addMethod(getMinusMethodHelper())
              .addMethod(getMultiMethodHelper())
              .addMethod(getDivideMethodHelper())
              .build();
        }
      }
    }
    return result;
  }
}
