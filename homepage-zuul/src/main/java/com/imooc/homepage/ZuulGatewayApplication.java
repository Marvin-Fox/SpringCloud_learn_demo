package com.imooc.homepage;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * <h1>网关应用程序</h1>
 * EnableZuulProxy:标识当前应用是Zuul Server
 * SpringCloudApplication: 用于简化配置的组合注解(里面已经包含了@SpringBootApplication、@EnableDiscoveryClient)
 */
@EnableZuulProxy
@SpringCloudApplication
public class ZuulGatewayApplication {
    public static void main(String[] args) {
        SpringApplication.run(ZuulGatewayApplication.class,args);
    }
}
