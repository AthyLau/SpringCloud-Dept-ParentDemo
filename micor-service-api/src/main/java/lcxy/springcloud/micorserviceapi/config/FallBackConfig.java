package lcxy.springcloud.micorserviceapi.config;

import lcxy.springcloud.micorserviceapi.service.DeptServiceFallBack;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Function:
 *
 * @author liubing
 * Date: 2019/2/27 下午5:27
 * @since JDK 1.8
 */

//@Configuration
public class FallBackConfig {
//    @Bean
    public DeptServiceFallBack deptServiceFallBack(){
        return new DeptServiceFallBack();
    }
}
