package lcxy.springcloud.micorserviceprovideremployeehystrix8004;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
//本服务启动以后会注册到eureka注册中心
@EnableDiscoveryClient
//支持熔断机制
@EnableCircuitBreaker
public class MicorServiceProviderEmployeeHystrix8004Application {

	public static void main(String[] args) {
		SpringApplication.run(MicorServiceProviderEmployeeHystrix8004Application.class, args);
	}

}
