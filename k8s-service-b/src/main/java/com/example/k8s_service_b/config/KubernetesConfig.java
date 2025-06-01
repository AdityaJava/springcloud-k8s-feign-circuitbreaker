package com.example.k8s_service_b.config;

import io.kubernetes.client.openapi.ApiClient;
import io.kubernetes.client.util.Config;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.io.IOException;

@Configuration
public class KubernetesConfig {

    @Bean
    public ApiClient configAPIClient() throws IOException {
        // Load the kubeconfig from default location (~/.kube/config)
        ApiClient client = Config.defaultClient();

        // Set the client as the default for the current thread
        io.kubernetes.client.openapi.Configuration.setDefaultApiClient(client);
        return client;
    }

}
