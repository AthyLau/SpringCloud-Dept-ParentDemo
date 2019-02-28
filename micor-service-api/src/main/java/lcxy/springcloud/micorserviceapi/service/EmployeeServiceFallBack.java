package lcxy.springcloud.micorserviceapi.service;

import lcxy.springcloud.micorserviceentity.commonbox.Result;
import lcxy.springcloud.micorserviceentity.commonbox.ResultGenerator;
import org.springframework.stereotype.Component;

/**
 * Function:
 *
 * @author liubing
 * Date: 2019/2/28 下午5:41
 * @since JDK 1.8
 */

@Component
public class EmployeeServiceFallBack implements EmployeeServiceINF{
    @Override
    public Result findAll() {
        return ResultGenerator.genFailResult("消费者提供的服务降级信息，该服务提供者已经下线e1");
    }

    @Override
    public Result discovery() {
        return ResultGenerator.genFailResult("消费者提供的服务降级信息，该服务提供者已经下线e2");
    }
}
