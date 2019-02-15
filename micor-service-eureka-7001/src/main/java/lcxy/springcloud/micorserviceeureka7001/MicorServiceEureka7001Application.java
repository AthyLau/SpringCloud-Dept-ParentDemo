package lcxy.springcloud.micorserviceeureka7001;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
//Eureka服务端启动类接受其他服务的注册
public class MicorServiceEureka7001Application {

	public static void main(String[] args) {
		SpringApplication.run(MicorServiceEureka7001Application.class, args);
	}

}

