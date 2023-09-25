package org.test.grpc.greet.service;


import io.grpc.stub.StreamObserver;
import org.test.grpc.greet.model.GreetRequest;
import org.test.grpc.greet.model.GreetResponse;

public class GreetSumServiceGrpcIMPL extends GreetSumServiceGrpc.GreetSumServiceImplBase {

    @Override
    public void greetSum(GreetRequest request, StreamObserver<GreetResponse> responseObserver) {
        int a=request.getFirstV();
        int b=request.getSecondV();
        GreetResponse response= GreetResponse.newBuilder().setSum((a+b)).build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }
}
