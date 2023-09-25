package org.test.grpc;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import org.test.grpc.greet.model.GreetRequest;
import org.test.grpc.greet.model.GreetResponse;
import org.test.grpc.greet.service.GreetSumServiceGrpc;

import java.util.concurrent.TimeUnit;

public class GRPCclient {

    private ManagedChannel managedChannel;
    private GreetSumServiceGrpc.GreetSumServiceBlockingStub greetSumServiceBlockingStub;
    public GRPCclient(String name, int port){
        this.managedChannel= ManagedChannelBuilder.forAddress(name, port).usePlaintext().build();
        this.greetSumServiceBlockingStub= GreetSumServiceGrpc.newBlockingStub(this.managedChannel);
    }

    public void stopClient() {
        this.managedChannel.shutdown();
    }

    public void startClient() throws InterruptedException{
       // this.managedChannel.awaitTermination(1000l, TimeUnit.MINUTES);
    }

    public void getSum(int a, int b){
        GreetRequest greetRequest= GreetRequest.newBuilder().setFirstV(a).setSecondV(b).build();
        GreetResponse greetResponse =this.greetSumServiceBlockingStub.greetSum(greetRequest);
        System.out.println(greetResponse.getSum());

    }
}
