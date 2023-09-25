package org.test.grpc;

import io.grpc.BindableService;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import org.test.grpc.greet.service.GreetSumServiceGrpcIMPL;

import java.io.IOException;
import java.net.InetAddress;

public class GRPCServer {

    private Server server;
    private GreetSumServiceGrpcIMPL greetSumServiceGrpcIMPL;
    public GRPCServer(int port){
        this.greetSumServiceGrpcIMPL = new GreetSumServiceGrpcIMPL();
        this.server= ServerBuilder.forPort(port).addService(this.greetSumServiceGrpcIMPL).build();
    }

    public void startServer() throws IOException {
        this.server.start();
    }

    public void stopServer() throws InterruptedException {
        this.server.shutdownNow();
        this.server.awaitTermination();
    }
}
