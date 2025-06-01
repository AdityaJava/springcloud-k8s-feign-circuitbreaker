package com.example.k8s_service_b.controller;

import com.example.k8s_service_b.feign.K8sServiceAClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class MyController {
    private final K8sServiceAClient k8sServiceAClient;

    @Autowired
    public MyController(K8sServiceAClient k8sServiceAClient) {
        this.k8sServiceAClient = k8sServiceAClient;
    }

    @GetMapping("/getHello")
    public String getHelloFromServiceA() {
        return k8sServiceAClient.sayHello();
    }
}
