package lcxy.springcloud.micorserviceconsumerdeptfeign9002.config;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import com.netflix.loadbalancer.RoundRobinRule;
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

    /**
     * 配置生成IRule对象所采用的选择微服务的方式为 轮 询
     *
     * 切换负载均衡的算法
     * @return
     */
    @Bean
    public IRule getIRule(){
//        return new RoundRobinRule();//轮询
        return new RandomRule();//随机
    }
}
