package com.ks.grpc.server;

/**
 * @author malingling <malingling@kuaishou.com>
 * Created on 2018-07-01
 */

import com.ks.proto.math.MathRequest;
import com.ks.proto.math.MathResponse;
import com.ks.proto.math.MathServiceGrpc.MathServiceImplBase;
import io.grpc.stub.StreamObserver;

public class MathServiceImpl extends MathServiceImplBase{
    @Override
    public void add(MathRequest request, StreamObserver<MathResponse> responseObserver) {
        MathResponse mathResponse = MathResponse.newBuilder()
                .setRes(request.getNum1() + request.getNum2())
                .build();
        responseObserver.onNext(mathResponse);
        responseObserver.onCompleted();
    }

    @Override
    public void minus(MathRequest request, StreamObserver<MathResponse> responseObserver) {
        MathResponse mathResponse = MathResponse.newBuilder()
                .setRes(request.getNum1() - request.getNum2())
                .build();
        responseObserver.onNext(mathResponse);
        responseObserver.onCompleted();
    }

    @Override
    public void multi(MathRequest request, StreamObserver<MathResponse> responseObserver) {
        MathResponse mathResponse = MathResponse.newBuilder()
                .setRes(request.getNum1() * request.getNum2())
                .build();
        responseObserver.onNext(mathResponse);
        responseObserver.onCompleted();
    }

    @Override
    public void divide(MathRequest request, StreamObserver<MathResponse> responseObserver) {
        MathResponse mathResponse = MathResponse.newBuilder()
                .setRes(request.getNum1() / request.getNum2())
                .build();
        responseObserver.onNext(mathResponse);
        responseObserver.onCompleted();
    }
}
