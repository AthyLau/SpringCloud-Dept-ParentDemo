package lcxy.springcloud.micorserviceprovideremployee8004.micorserviceprovideremployee8004.controller;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiOperation;
import lcxy.springcloud.micorserviceentity.commonbox.Result;
import lcxy.springcloud.micorserviceentity.commonbox.ResultCode;
import lcxy.springcloud.micorserviceentity.commonbox.ResultGenerator;
import lcxy.springcloud.micorserviceentity.domain.po.EmployeePO;
import lcxy.springcloud.micorserviceprovideremployee8004.micorserviceprovideremployee8004.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Function:
 *
 * @author liubing
 * Date: 2019/2/20 上午11:36
 * @since JDK 1.8
 */

@RestController
@RequestMapping("/employee")
@ApiModel(description = "员工controller")
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;

    @ApiOperation(value = "查询", httpMethod = "GET")
    @GetMapping("/find/all")
    public Result findAll(){
        List<EmployeePO> list = employeeService.findAll();
        if(list!=null&&list.size()>0){
            return ResultGenerator.genSuccessResult(list);
        }
        return ResultGenerator.genSuccessResult(ResultCode.NONE_DATA);
    }
}
