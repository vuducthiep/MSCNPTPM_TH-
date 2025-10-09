package com.example.soaphelloworld.endpoint;

import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import com.example.soaphelloworld.HelloRequest;
import com.example.soaphelloworld.HelloResponse;

@Endpoint
public class HelloEndpoint {
    private static final String NAMESPACE_URI = "http://example.com/soap";

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "HelloRequest")
    @ResponsePayload
    public HelloResponse getHello(@RequestPayload HelloRequest request) {
        HelloResponse response = new HelloResponse();
        response.setMessage("Hello " + request.getName() + "!");
        return response;
    }
}