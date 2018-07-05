package com.ks.grpc.client;

/**
 * @author malingling <malingling@kuaishou.com>
 * Created on 2018-07-01
 */

import com.ks.proto.math.MathRequest;
import com.ks.proto.math.MathResponse;
import com.ks.proto.math.MathServiceGrpc;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.StatusRuntimeException;

import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MathClient {
    private static final Logger logger = Logger.getLogger(MathClient.class.getName());

    private final ManagedChannel channel;

    private final MathServiceGrpc.MathServiceBlockingStub blockingStub;

    /** Construct client connecting to HelloWorld server at {@code host:port}. */
    public MathClient(String host, int port) {
        this(ManagedChannelBuilder.forAddress(host, port)
                .usePlaintext(true)
                .build());
    }

    /** Construct client for accessing HelloWorld server using the existing channel. */
    MathClient(ManagedChannel channel) {
        this.channel = channel;
        blockingStub = MathServiceGrpc.newBlockingStub(channel);
    }

    public void shutdown() throws InterruptedException {
        channel.shutdown().awaitTermination(5, TimeUnit.SECONDS);
    }

    public void add(Integer num1, Integer num2) {
        MathRequest request = MathRequest.newBuilder()
                .setNum1(num1)
                .setNum2(num2)
                .build();
        MathResponse response;
        try {
            response = blockingStub.add(request);
        } catch (StatusRuntimeException e) {
            logger.log(Level.WARNING, "RPC failed: {0}", e.getStatus());
            return;
        }
        logger.info("add: " + response.getRes());
    }

    public static void main(String[] args) throws Exception {
        MathClient client = new MathClient("localhost", 50051);
        try {
            //add
            client.add(1, 2);

            //minus

            //multi

            //devide

        } finally {
            client.shutdown();
        }
    }
}
