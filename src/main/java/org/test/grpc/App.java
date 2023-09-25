package org.test.grpc;

import io.grpc.BindableService;
import org.test.grpc.greet.service.GreetSumServiceGrpc;

import java.io.IOException;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        System.out.println( "Starting Server" );
        GRPCServer server=new GRPCServer(9999);
        GRPCclient client=new GRPCclient("localhost", 9999);

        // setting runtime hook
        Runtime.getRuntime().addShutdownHook(new Thread(){
            @Override
            public void run(){
                try{
                    client.stopClient();
                    server.stopServer();
                }catch (InterruptedException ex){
                    ex.printStackTrace();
                }
            }
        });

        try{
            server.startServer();
            client.startClient();
            for(int i=0;i<100; i++){
                for(int j=0;j<100;j++){
                    Thread.sleep(1000l);
                    client.getSum(i,j);
                }
            }
            client.stopClient();
            server.stopServer();
        }catch (IOException ex){
            ex.printStackTrace();
        }catch (InterruptedException ex){
            ex.printStackTrace();
        }


    }
}
