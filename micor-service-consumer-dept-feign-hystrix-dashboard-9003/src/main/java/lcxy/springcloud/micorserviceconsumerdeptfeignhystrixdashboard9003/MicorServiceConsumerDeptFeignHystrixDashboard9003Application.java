package lcxy.springcloud.micorserviceconsumerdeptfeignhystrixdashboard9003;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

@SpringBootApplication
//开启仪表盘的监控
@EnableHystrixDashboard
public class MicorServiceConsumerDeptFeignHystrixDashboard9003Application {

	public static void main(String[] args) {
		SpringApplication.run(MicorServiceConsumerDeptFeignHystrixDashboard9003Application.class, args);
	}

}
