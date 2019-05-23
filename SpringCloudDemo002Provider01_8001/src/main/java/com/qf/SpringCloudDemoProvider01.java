package com.qf;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class SpringCloudDemoProvider01 {

    public static void main(String[] args){
        SpringApplication.run(SpringCloudDemoProvider01.class,args);
    }
}
