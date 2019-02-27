package lcxy.springcloud.micorserviceproviderdepthystrix8001.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiOperation;
import lcxy.springcloud.micorserviceentity.commonbox.Result;
import lcxy.springcloud.micorserviceentity.commonbox.ResultCode;
import lcxy.springcloud.micorserviceentity.commonbox.ResultGenerator;
import lcxy.springcloud.micorserviceentity.domain.dto.DeptDTO;
import lcxy.springcloud.micorserviceentity.domain.dto.IntDTO;
import lcxy.springcloud.micorserviceentity.domain.po.DeptPO;
import lcxy.springcloud.micorserviceproviderdepthystrix8001.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
    @HystrixCommand(fallbackMethod = "addDeptFallBack")//跑出异常后回掉addDeptFallBack方法
    public Result addDept(@RequestBody DeptDTO deptDTO){
        if(deptDTO.getDeptName().equals("")||deptDTO.getDataSourceName().equals("")){
            throw new RuntimeException("部门名称或者数据源名称不能为空");
        }
        return ResultGenerator.genSuccessResult(deptService.addDept(deptDTO));
    }
    public Result addDeptFallBack(@RequestBody DeptDTO deptDTO){
        return ResultGenerator.genFailResult("部门名称或者数据源名称不能为空");
    }

    @ApiOperation(value = "查询", httpMethod = "GET")
    @GetMapping("/find/all")
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
