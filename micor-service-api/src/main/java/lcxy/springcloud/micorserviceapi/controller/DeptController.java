package lcxy.springcloud.micorserviceapi.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiOperation;
import lcxy.springcloud.micorserviceapi.service.DeptService;
import lcxy.springcloud.micorserviceentity.commonbox.Result;
import lcxy.springcloud.micorserviceentity.commonbox.ResultCode;
import lcxy.springcloud.micorserviceentity.commonbox.ResultGenerator;
import lcxy.springcloud.micorserviceentity.domain.dto.DeptDTO;
import lcxy.springcloud.micorserviceentity.domain.dto.IntDTO;
import lcxy.springcloud.micorserviceentity.domain.po.DeptPO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Function:
 *
 * @author liubing
 * Date: 2019/1/2 下午6:13
 * @since JDK 1.8
 */

@RestController
@RequestMapping("/dept")
@ApiModel(description = "部门controller")
public class DeptController {

    @Autowired
    private DeptService deptService;

    @ApiOperation(value = "添加", httpMethod = "POST")
    @PostMapping("/add")
    public Result addDept(@RequestBody DeptDTO deptDTO){
        return ResultGenerator.genSuccessResult(deptService.addDept(deptDTO));
    }
    @ApiOperation(value = "查询", httpMethod = "POST")
    @PostMapping("/find/all")
    public Result findAll(){
        List<DeptPO> list = deptService.findAll();
        if(list!=null&&list.size()>0){
            return ResultGenerator.genSuccessResult(list);
        }
        return ResultGenerator.genSuccessResult(ResultCode.NONE_DATA);
    }
    @ApiOperation(value = "删除", httpMethod = "POST")
    @PostMapping("/del/by_id")
    public Result delById(@RequestBody IntDTO intDTO){
        return ResultGenerator.genSuccessResult(deptService.delById(intDTO.getId()));
    }



}
