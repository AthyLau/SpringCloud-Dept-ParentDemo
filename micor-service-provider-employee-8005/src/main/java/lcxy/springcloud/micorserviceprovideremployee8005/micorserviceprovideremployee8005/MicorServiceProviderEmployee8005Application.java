package lcxy.springcloud.micorserviceprovideremployee8005.micorserviceprovideremployee8005;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
//本服务启动以后会注册到eureka注册中心
@EnableDiscoveryClient
public class MicorServiceProviderEmployee8005Application {

	public static void main(String[] args) {
		SpringApplication.run(MicorServiceProviderEmployee8005Application.class, args);
	}

}
