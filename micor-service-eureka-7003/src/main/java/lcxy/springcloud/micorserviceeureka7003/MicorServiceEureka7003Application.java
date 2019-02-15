package lcxy.springcloud.micorserviceeureka7003;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class MicorServiceEureka7003Application {

	public static void main(String[] args) {
		SpringApplication.run(MicorServiceEureka7003Application.class, args);
	}

}

