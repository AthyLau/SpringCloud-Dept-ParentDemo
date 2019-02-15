package lcxy.springcloud.micorserviceconsumerdept9001;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class MicorServiceConsumerDept9001Application {

	public static void main(String[] args) {
		SpringApplication.run(MicorServiceConsumerDept9001Application.class, args);
	}

}

