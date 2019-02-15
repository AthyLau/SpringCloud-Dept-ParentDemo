package lcxy.springcloud.micorserviceconsumerdeptfeign9002.controller;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiOperation;
import lcxy.springcloud.micorserviceentity.commonbox.Result;
import lcxy.springcloud.micorserviceentity.domain.dto.DeptDTO;
import lcxy.springcloud.micorserviceentity.domain.dto.IntDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

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
    /**
     * 	RestTemplate 提供了多种便捷访问远程Http服务的方法
     * 是一种简单便捷的访问restful服务模版类，是Spring提供 的用于访问Rest服务的 客 户 端 模版工具集
     *
     * 使用resttemplate访问restful接口非常的简答粗暴
     * url：rest请求地址
     * requestMap:请求参数
     * responseBean.class:HTTP响应转为的返回的对象类型
     *
     */
    @Autowired
    private RestTemplate restTemplate;

    /**
     * rest调用提供者接口的前缀 非微服务版
     */
//    private static final String REST_URL_PREFIX = "http://127.0.0.1:8001";
    /**
     * rest调用提供者接口的前缀 微服务版
     */
    private static final String REST_URL_PREFIX = "http://DEPT-PROVIDER";

    @ApiOperation(value = "添加", httpMethod = "POST")
    @PostMapping(value = "/add")
    public Result addDept(@RequestBody DeptDTO deptDTO){
        return restTemplate.postForObject(REST_URL_PREFIX+"/dept/add",deptDTO,Result.class);
    }
    @ApiOperation(value = "查询", httpMethod = "GET")
    @GetMapping(value = "/find/all")
    public Result findAll(){
        return restTemplate.getForObject(REST_URL_PREFIX+"/dept/find/all",Result.class);
    }
    @ApiOperation(value = "删除", httpMethod = "POST")
    @PostMapping(value = "/del/by_id")
    public Result delById(@RequestBody IntDTO intDTO){
        return restTemplate.postForObject(REST_URL_PREFIX+"/dept/del/by_id",intDTO,Result.class);
    }
    @ApiOperation(value = "调用服务发现", httpMethod = "GET")
    @GetMapping(value = "/discovery")
    public Result discovery(){
        return restTemplate.getForObject(REST_URL_PREFIX+"/discovery",Result.class);
    }
}
