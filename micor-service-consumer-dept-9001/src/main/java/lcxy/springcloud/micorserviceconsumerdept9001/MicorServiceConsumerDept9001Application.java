package lcxy.springcloud.micorserviceconsumerdept9001;

import lcxy.springcloud.micorserviceconsumerdept9001.config.LoadBalancedConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.FilterType;

@RibbonClient(name = "RibbonConsumer9001",configuration = LoadBalancedConfig.class)
@EnableEurekaClient
@SpringBootApplication
public class MicorServiceConsumerDept9001Application {

	public static void main(String[] args) {
		SpringApplication.run(MicorServiceConsumerDept9001Application.class, args);
	}

}

