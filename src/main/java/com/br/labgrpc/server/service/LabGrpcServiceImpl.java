package com.br.labgrpc.server.service;

import com.br.labgrpc.stubs.LabGrpcRequest;
import com.br.labgrpc.stubs.LabGrpcResponse;
import com.br.labgrpc.stubs.LabGrpcServiceGrpc;

import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;


@GrpcService
public class LabGrpcServiceImpl extends LabGrpcServiceGrpc.LabGrpcServiceImplBase {
	
	
	@Override
	public void sayHello(LabGrpcRequest request, StreamObserver<LabGrpcResponse> responseObserver) {
		LabGrpcResponse reply = LabGrpcResponse.newBuilder().setMessage("Hello ==> " + request.getName()).build();
		responseObserver.onNext(reply);
		responseObserver.onCompleted();

	}

}
