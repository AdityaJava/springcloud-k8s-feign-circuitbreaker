package com.example.k8s_service_b;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients(basePackages = "com.example.k8s_service_b.feign")
public class K8sServiceBApplication {

    public static void main(String[] args) {
        SpringApplication.run(K8sServiceBApplication.class, args);
    }

}
