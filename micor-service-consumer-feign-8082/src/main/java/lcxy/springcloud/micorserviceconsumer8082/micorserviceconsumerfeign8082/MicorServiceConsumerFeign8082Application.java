package lcxy.springcloud.micorserviceconsumer8082.micorserviceconsumerfeign8082;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class MicorServiceConsumerFeign8082Application {

	public static void main(String[] args) {
		SpringApplication.run(MicorServiceConsumerFeign8082Application.class, args);
	}

}
