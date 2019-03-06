package lcxy.springcloud.micorservicezuulgateway9527;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
//开启Zuul代理
@EnableZuulProxy
@SpringBootApplication
public class MicorServiceZuulGateway9527Application {

	public static void main(String[] args) {
		SpringApplication.run(MicorServiceZuulGateway9527Application.class, args);
	}

}
