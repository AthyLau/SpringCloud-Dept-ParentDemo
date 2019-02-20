package lcxy.springcloud.micorserviceconsumerdept9001;

import lcxy.springcloud.micorserviceconsumerdept9001.config.DeptLoadBalancedConfig;
import lcxy.springcloud.micorserviceconsumerdept9001.config.EmployeeLoadBalanceConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.netflix.ribbon.RibbonClients;

//此ribbon客户端访问DEPT-PROVIDER服务时调用LoadBalancedConfig配置类中配置的负载均衡策略
//@RibbonClient(name = "DEPT-PROVIDER",configuration = DeptLoadBalancedConfig.class)
@RibbonClients(value = {
        @RibbonClient(name = "DEPT-PROVIDER",configuration = DeptLoadBalancedConfig.class),
        @RibbonClient(name = "EMPLOYEE-PROVIDER",configuration = EmployeeLoadBalanceConfig.class)
})
@EnableEurekaClient
@SpringBootApplication
public class MicorServiceConsumerDept9001Application {

	public static void main(String[] args) {
		SpringApplication.run(MicorServiceConsumerDept9001Application.class, args);
	}

}

