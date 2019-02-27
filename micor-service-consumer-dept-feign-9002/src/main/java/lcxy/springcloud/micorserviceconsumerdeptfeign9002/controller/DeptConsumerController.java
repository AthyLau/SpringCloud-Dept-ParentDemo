package lcxy.springcloud.micorserviceconsumerdeptfeign9002.controller;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiOperation;
import lcxy.springcloud.micorserviceapi.service.DeptServiceINF;
import lcxy.springcloud.micorserviceentity.commonbox.Result;
import lcxy.springcloud.micorserviceentity.domain.dto.DeptDTO;
import lcxy.springcloud.micorserviceentity.domain.dto.IntDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
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
    @ApiOperation(value = "添加", httpMethod = "POST")
    @PostMapping("/add")
    public Result addDept(@RequestBody DeptDTO deptDTO){
        return this.deptServiceINF.addDept(deptDTO);
    }
    @ApiOperation(value = "删除", httpMethod = "POST")
    @PostMapping("/del/by_id")
    public Result delById(@RequestBody IntDTO intDTO){
        return this.deptServiceINF.delById(intDTO);
    }
}
