package lcxy.springcloud.micorserviceproviderdepthystrix8001.controller;


import lcxy.springcloud.micorserviceentity.commonbox.Result;
import lcxy.springcloud.micorserviceentity.commonbox.ResultCode;
import lcxy.springcloud.micorserviceentity.commonbox.ResultGenerator;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import springfox.documentation.annotations.ApiIgnore;

/**
 * Function: 错误信息
 *
 * @author miluo
 * Date: 2018/10/31 8:48 PM
 * @since JDK 1.8
 */
@ApiIgnore
@RestController
public class ErrorController {
    @GetMapping(path = "/401")
    @ResponseStatus(HttpStatus.UNAUTHORIZED)
    public Result unauthorized() {
        return ResultGenerator.genNeutralResult(ResultCode.NOT_AUTH, "未获得许可，拒绝提供服务");
    }


    @GetMapping(path = "/404")
    @ResponseStatus(HttpStatus.UNAUTHORIZED)
    public Result notFound() {
        return ResultGenerator.genNeutralResult(ResultCode.NOT_AUTH, "未发现资源地址");
    }
}
