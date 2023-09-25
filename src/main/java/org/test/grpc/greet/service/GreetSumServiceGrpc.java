package org.test.grpc.greet.service;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.56.0)",
    comments = "Source: test/HelloGreetService.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class GreetSumServiceGrpc {

  private GreetSumServiceGrpc() {}

  public static final String SERVICE_NAME = "test.greet.service.GreetSumService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<org.test.grpc.greet.model.GreetRequest,
      org.test.grpc.greet.model.GreetResponse> getGreetSumMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "greetSum",
      requestType = org.test.grpc.greet.model.GreetRequest.class,
      responseType = org.test.grpc.greet.model.GreetResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.test.grpc.greet.model.GreetRequest,
      org.test.grpc.greet.model.GreetResponse> getGreetSumMethod() {
    io.grpc.MethodDescriptor<org.test.grpc.greet.model.GreetRequest, org.test.grpc.greet.model.GreetResponse> getGreetSumMethod;
    if ((getGreetSumMethod = GreetSumServiceGrpc.getGreetSumMethod) == null) {
      synchronized (GreetSumServiceGrpc.class) {
        if ((getGreetSumMethod = GreetSumServiceGrpc.getGreetSumMethod) == null) {
          GreetSumServiceGrpc.getGreetSumMethod = getGreetSumMethod =
              io.grpc.MethodDescriptor.<org.test.grpc.greet.model.GreetRequest, org.test.grpc.greet.model.GreetResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "greetSum"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.test.grpc.greet.model.GreetRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.test.grpc.greet.model.GreetResponse.getDefaultInstance()))
              .setSchemaDescriptor(new GreetSumServiceMethodDescriptorSupplier("greetSum"))
              .build();
        }
      }
    }
    return getGreetSumMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static GreetSumServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<GreetSumServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<GreetSumServiceStub>() {
        @Override
        public GreetSumServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new GreetSumServiceStub(channel, callOptions);
        }
      };
    return GreetSumServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static GreetSumServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<GreetSumServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<GreetSumServiceBlockingStub>() {
        @Override
        public GreetSumServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new GreetSumServiceBlockingStub(channel, callOptions);
        }
      };
    return GreetSumServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static GreetSumServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<GreetSumServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<GreetSumServiceFutureStub>() {
        @Override
        public GreetSumServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new GreetSumServiceFutureStub(channel, callOptions);
        }
      };
    return GreetSumServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void greetSum(org.test.grpc.greet.model.GreetRequest request,
        io.grpc.stub.StreamObserver<org.test.grpc.greet.model.GreetResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGreetSumMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service GreetSumService.
   */
  public static abstract class GreetSumServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @Override public final io.grpc.ServerServiceDefinition bindService() {
      return GreetSumServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service GreetSumService.
   */
  public static final class GreetSumServiceStub
      extends io.grpc.stub.AbstractAsyncStub<GreetSumServiceStub> {
    private GreetSumServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected GreetSumServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new GreetSumServiceStub(channel, callOptions);
    }

    /**
     */
    public void greetSum(org.test.grpc.greet.model.GreetRequest request,
        io.grpc.stub.StreamObserver<org.test.grpc.greet.model.GreetResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGreetSumMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service GreetSumService.
   */
  public static final class GreetSumServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<GreetSumServiceBlockingStub> {
    private GreetSumServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected GreetSumServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new GreetSumServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public org.test.grpc.greet.model.GreetResponse greetSum(org.test.grpc.greet.model.GreetRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGreetSumMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service GreetSumService.
   */
  public static final class GreetSumServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<GreetSumServiceFutureStub> {
    private GreetSumServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected GreetSumServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new GreetSumServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.test.grpc.greet.model.GreetResponse> greetSum(
        org.test.grpc.greet.model.GreetRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGreetSumMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GREET_SUM = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AsyncService serviceImpl;
    private final int methodId;

    MethodHandlers(AsyncService serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @Override
    @SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GREET_SUM:
          serviceImpl.greetSum((org.test.grpc.greet.model.GreetRequest) request,
              (io.grpc.stub.StreamObserver<org.test.grpc.greet.model.GreetResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @Override
    @SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  public static final io.grpc.ServerServiceDefinition bindService(AsyncService service) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          getGreetSumMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              org.test.grpc.greet.model.GreetRequest,
              org.test.grpc.greet.model.GreetResponse>(
                service, METHODID_GREET_SUM)))
        .build();
  }

  private static abstract class GreetSumServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    GreetSumServiceBaseDescriptorSupplier() {}

    @Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return org.test.grpc.greet.model.HelloGreet.getDescriptor();
    }

    @Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("GreetSumService");
    }
  }

  private static final class GreetSumServiceFileDescriptorSupplier
      extends GreetSumServiceBaseDescriptorSupplier {
    GreetSumServiceFileDescriptorSupplier() {}
  }

  private static final class GreetSumServiceMethodDescriptorSupplier
      extends GreetSumServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    GreetSumServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (GreetSumServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new GreetSumServiceFileDescriptorSupplier())
              .addMethod(getGreetSumMethod())
              .build();
        }
      }
    }
    return result;
  }
}
