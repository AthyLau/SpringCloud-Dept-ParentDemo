package lcxy.springcloud.micorserviceconsumer8082.micorserviceconsumerfeign8082.micorserviceconsumer8081.controller;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiOperation;
import lcxy.springcloud.micorserviceapi.service.DeptServiceINF;
import lcxy.springcloud.micorserviceentity.commonbox.Result;
import lcxy.springcloud.micorserviceentity.commonbox.ResultCode;
import lcxy.springcloud.micorserviceentity.commonbox.ResultGenerator;
import lcxy.springcloud.micorserviceentity.domain.po.DeptPO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.*;
/**
 * Function:部门服务消费者
 *
 * @author liubing
 * Date: 2019/1/4 下午2:27
 * @since JDK 1.8
 */
@ApiModel(description = "部门消费者controller")
@RequestMapping(value = "/consumer/dept")
@RestController
public class DeptConsumerController {
    @Autowired
    private DeptServiceINF deptServiceINF;

    @ApiOperation(value = "查询", httpMethod = "GET")
    @GetMapping(value = "/find/all")
    public Result findAll(){
        return this.deptServiceINF.findAll();
    }

    @ApiOperation(value = "查询", httpMethod = "GET")
    @GetMapping(value = "/discovery")
    public Result discovery(){
        return this.deptServiceINF.discovery();
    }
}
