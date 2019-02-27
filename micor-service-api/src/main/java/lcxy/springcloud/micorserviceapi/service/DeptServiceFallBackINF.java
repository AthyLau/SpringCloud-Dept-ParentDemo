package lcxy.springcloud.micorserviceapi.service;

import lcxy.springcloud.micorserviceentity.commonbox.Result;
import lcxy.springcloud.micorserviceentity.domain.dto.DeptDTO;
import lcxy.springcloud.micorserviceentity.domain.dto.IntDTO;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@FeignClient(name = "DEPT-PROVIDER")
public interface DeptServiceFallBackINF {

    @GetMapping("/dept/find/all")
    Result findAll();
    @GetMapping("/discovery")
    Result discovery();
    @PostMapping("/dept/add")
    Result addDept(@RequestBody DeptDTO deptDTO);
    @PostMapping("/dept/del/by_id")
    Result delById(@RequestBody IntDTO intDTO);

}
