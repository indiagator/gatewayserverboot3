package com.cbt.gatewayserverboot3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;


@SpringBootApplication
@EnableDiscoveryClient
public class Gatewayserverboot3Application
{

    public static void main(String[] args)
    {
        SpringApplication.run(Gatewayserverboot3Application.class);
    }

}
