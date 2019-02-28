package lcxy.springcloud.micorserviceapi.service;

import feign.hystrix.FallbackFactory;
import lcxy.springcloud.micorserviceentity.commonbox.Result;
import lcxy.springcloud.micorserviceentity.commonbox.ResultGenerator;
import lcxy.springcloud.micorserviceentity.domain.dto.DeptDTO;
import lcxy.springcloud.micorserviceentity.domain.dto.IntDTO;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

/**
 * Function:
 *
 * @author liubing
 * Date: 2019/2/27 下午4:35
 * @since JDK 1.8
 */
//把所有provider的熔断回调方法单独拿出来扔在这
@Component
public class DeptServiceFallBack implements DeptServiceINF{
    @Override
    public Result findAll() {
        return ResultGenerator.genFailResult("消费者提供的服务降级信息，该服务提供者已经下线d1");
    }

    @Override
    public Result discovery() {
        return ResultGenerator.genFailResult("消费者提供的服务降级信息，该服务提供者已经下线d2");
    }

    @Override
    public Result addDept(DeptDTO deptDTO) {
        return ResultGenerator.genFailResult("消费者提供的服务降级信息，该服务提供者已经下线d3");
    }

    @Override
    public Result delById(IntDTO intDTO) {
        return ResultGenerator.genFailResult("消费者提供的服务降级信息，该服务提供者已经下线d4");
    }
}
