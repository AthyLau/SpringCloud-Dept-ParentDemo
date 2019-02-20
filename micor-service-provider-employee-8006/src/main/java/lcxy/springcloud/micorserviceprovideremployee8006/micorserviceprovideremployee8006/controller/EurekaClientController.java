package lcxy.springcloud.micorserviceprovideremployee8006.micorserviceprovideremployee8006.controller;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiOperation;
import lcxy.springcloud.micorserviceentity.commonbox.Result;
import lcxy.springcloud.micorserviceentity.commonbox.ResultGenerator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Function:
 *
 * @author liubing
 * Date: 2019/1/7 下午6:14
 * @since JDK 1.8
 */
@ApiModel(description = "Eureka Controller")
@RestController
public class EurekaClientController {
    @Autowired
    private DiscoveryClient discoveryClient;


    @GetMapping("info")
    @ApiOperation(value = "查看服务信息", httpMethod = "GET")
    public Result getInfo(){
        return ResultGenerator.genSuccessResult("这是8013员工模块的服务");
    }

    @ApiOperation(value = "服务发现", httpMethod = "GET")
    @GetMapping("/discovery")
    public Result dsicovery(){
        //获取该注册中心所有的微服务
        List<String> list = discoveryClient.getServices();
        System.out.println(list);
        //找出dept-provider微服务的信息
        List<ServiceInstance> serviceInstances = discoveryClient.getInstances("EMPLOYEE-PROVIDER");
        for(ServiceInstance instance :serviceInstances){
            System.out.println(instance.getServiceId()+"  "+instance.getHost()+"  "+instance.getPort()+"  "+instance.getUri() );
        }
        return ResultGenerator.genSuccessResult(serviceInstances);
    }

}
