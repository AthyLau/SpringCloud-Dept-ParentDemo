package lcxy.springcloud.micorserviceconsumer8082.micorserviceconsumerfeign8082.micorserviceconsumer8081.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * Function:
 *
 * @author liubing
 * Date: 2019/1/4 下午2:21
 * @since JDK 1.8
 */

@Configuration
public class ConfigBean {

    @LoadBalanced
    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }

}
