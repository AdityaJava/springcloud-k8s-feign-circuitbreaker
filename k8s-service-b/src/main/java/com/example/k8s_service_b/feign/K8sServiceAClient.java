package com.example.k8s_service_b.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "k8s-service-a")
public interface K8sServiceAClient {
    @GetMapping("/api/v1/hello")
    public String sayHello();
}
