package lcxy.springcloud.micorserviceapi.service;

import lcxy.springcloud.micorserviceentity.commonbox.Result;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value = "EMPLOYEE-PROVIDER",fallback = EmployeeServiceFallBack.class)
public interface EmployeeServiceINF {

    @GetMapping("employee/find/all")
    Result findAll();

    @GetMapping("/discovery")
    Result discovery();

}
