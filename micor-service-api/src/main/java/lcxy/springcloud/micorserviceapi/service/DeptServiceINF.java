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
import lcxy.springcloud.micorserviceentity.domain.dto.DeptDTO;
import lcxy.springcloud.micorserviceentity.domain.dto.IntDTO;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

//@FeignClient(name = "DEPT-PROVIDER",url = "http://127.0.0.1:8081")
@FeignClient(value = "DEPT-PROVIDER",fallback = DeptServiceFallBack.class)//这个接口出现了问题都去找DeptServiceFallBack这个类
public interface DeptServiceINF {

    @GetMapping("/dept/find/all")
    Result findAll();
    @GetMapping("/discovery")
    Result discovery();
    @PostMapping("/dept/add")
    Result addDept(@RequestBody DeptDTO deptDTO);
    @PostMapping("/dept/del/by_id")
    Result delById(@RequestBody IntDTO intDTO);
}

