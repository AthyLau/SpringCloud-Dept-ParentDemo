package lcxy.springcloud.micorserviceapi.service;

/**
 * Function:
 *
 * @author liubing
 * Date: 2019/2/25 上午11:47
 * @since JDK 1.8
 */
import java.util.*;

import lcxy.springcloud.micorserviceentity.commonbox.Result;
import lcxy.springcloud.micorserviceentity.domain.po.DeptPO;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

//@FeignClient(name = "DEPT-PROVIDER",url = "http://127.0.0.1:8081")
@FeignClient(name = "DEPT-PROVIDER")
public interface DeptServiceINF {

    @GetMapping("/dept/find/all")
    Result findAll();
    @GetMapping("/discovery")
    Result discovery();
}

