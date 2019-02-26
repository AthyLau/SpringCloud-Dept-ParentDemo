package lcxy.springcloud.micorserviceconsumer8082.micorserviceconsumerfeign8082.micorserviceconsumer8081.controller;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiOperation;
import lcxy.springcloud.micorserviceapi.service.EmployeeServiceINF;
import lcxy.springcloud.micorserviceentity.commonbox.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * Function:部门服务消费者
 *
 * @author liubing
 * Date: 2019/1/4 下午2:27
 * @since JDK 1.8
 */
@ApiModel(description = "员工消费者controller")
@RequestMapping(value = "/consumer/employee")
@RestController
public class EmployeeConsumerController {

    @Autowired
    private EmployeeServiceINF employeeServiceINF;

    @ApiOperation(value = "查询", httpMethod = "GET")
    @GetMapping("/find/all")
    public Result findAll(){
        return employeeServiceINF.findAll();
    }

    @ApiOperation(value = "查询", httpMethod = "GET")
    @GetMapping("/discovery")
    public Result discovery(){
        return employeeServiceINF.discovery();
    }
}
