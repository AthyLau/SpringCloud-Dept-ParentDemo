package lcxy.springcloud.micorserviceconsumerdeptfeign9002;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

@EnableEurekaClient
@SpringBootApplication
@EnableFeignClients(basePackages = {"lcxy.springcloud.micorserviceapi.service","lcxy.springcloud.micorserviceconsumerdeptfeign9002"})
public class MicorServiceConsumerDeptFeign9002Application {

	public static void main(String[] args) {
		SpringApplication.run(MicorServiceConsumerDeptFeign9002Application.class, args);
	}

}

