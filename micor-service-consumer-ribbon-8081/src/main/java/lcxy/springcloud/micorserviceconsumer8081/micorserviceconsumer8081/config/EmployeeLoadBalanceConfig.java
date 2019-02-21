package lcxy.springcloud.micorserviceconsumer8081.micorserviceconsumer8081.config;

import com.netflix.client.config.IClientConfig;
import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RoundRobinRule;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;

/**
 * Function:
 *
 * @author liubing
 * Date: 2019/2/20 上午11:27
 * @since JDK 1.8
 */


public class EmployeeLoadBalanceConfig {
    @Autowired
    IClientConfig clientConfig;
    /**
     * 配置生成IRule对象所采用的选择微服务的方式为 轮 询
     *
     * 切换负载均衡的算法
     * @return
     */
    @Bean
    public IRule getIRule(IClientConfig clientConfig){
        return new RoundRobinRule();//轮询
//        return new RandomRule();//随机
    }
}
