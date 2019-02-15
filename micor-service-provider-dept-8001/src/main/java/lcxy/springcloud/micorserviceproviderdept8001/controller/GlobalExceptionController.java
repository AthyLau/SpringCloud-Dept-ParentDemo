package lcxy.springcloud.micorserviceproviderdept8001.controller;


import lcxy.springcloud.micorserviceentity.commonbox.Result;
import lcxy.springcloud.micorserviceentity.commonbox.ResultCode;
import lcxy.springcloud.micorserviceentity.commonbox.ResultGenerator;
import lcxy.springcloud.micorserviceentity.domain.pojo.FailException;
import lcxy.springcloud.micorserviceentity.domain.pojo.SuccessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.servlet.http.HttpServletRequest;
import javax.validation.ConstraintViolation;
import javax.validation.ConstraintViolationException;
import java.net.UnknownHostException;
import java.util.Set;

/**
 * Function: 全局异常处理类  RestControllerAdvice负责及时发送消息
 *
 * @author miluo
 * Date: 2018/9/6 下午4:28
 * @since JDK 1.8
 */
@RestControllerAdvice
public class GlobalExceptionController {


    /**
     * 在controller中，根据controller上的Validated注解，拦截在请求中的参数
     *
     * @param exception 异常信息集合
     * @return 结果集
     */
    @ExceptionHandler
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    public Result handle(ConstraintViolationException exception) {
        Set<ConstraintViolation<?>> violations = exception.getConstraintViolations();
        StringBuilder sb = new StringBuilder();
        for (ConstraintViolation<?> violation : violations) {
            sb.append(violation.getMessage() + "\n");
        }
        return ResultGenerator.genNeutralResult(4004, sb.toString());
    }


//    /**
//     * 捕捉shiro的异常
//     *
//     * @param e 异常类型
//     * @return 结果集
//     */
//    @ResponseStatus(HttpStatus.FORBIDDEN)
//    @ExceptionHandler(ShiroException.class)
//    public Result handle401(ShiroException e) {
//        return ResultGenerator.genNeutralResult(ResultCode.NOT_AUTH, "暂无权限！");
//    }
//
//    /**
//     * 捕捉shiro的异常
//     *
//     * @param e 异常类型
//     * @return 结果集
//     */
//    @ResponseStatus(HttpStatus.UNAUTHORIZED)
//    @ExceptionHandler(UnauthenticatedException.class)
//    public Result unauthenticatedException(UnauthenticatedException e) {
//        if (e.getMessage().contains("Access denied")) {
//            return ResultGenerator.genNeutralResult(ResultCode.NOT_AUTH, "未获得授权！");
//        }
//        return ResultGenerator.genNeutralResult(ResultCode.NOT_AUTH, e.getMessage());
//    }
//
//    /**
//     * 捕捉shiro 用户名密码错误异常
//     *
//     * @param e 异常类型
//     * @return 结果集
//     */
//    @ResponseStatus(HttpStatus.UNAUTHORIZED)
//    @ExceptionHandler(UnauthorizedException.class)
//    public Result UnauthorizedException(UnauthorizedException e) {
//        return ResultGenerator.genNeutralResult(ResultCode.UNAUTHORIZED, e.getMessage());
//    }

    /**
     * 捕捉参数验证异常
     *
     * @param e 异常类型
     * @return 结果集
     */
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public Result validateException(MethodArgumentNotValidException e) {
        return ResultGenerator.genNeutralResult(ResultCode.PARAM_VALID, e.getMessage().substring(e.getMessage().lastIndexOf('['), e.getMessage().length() - 2));
    }


    /**
     * 请求过来没有传参数，或者参数不够数量
     *
     * @return 返回4000 状态码
     */
    @ExceptionHandler(MissingServletRequestParameterException.class)
    @ResponseStatus(HttpStatus.OK)
    public Result parameterException() {
        return ResultGenerator.genFailResult("请求的参数不完整！");
    }

    /**
     * 请求过来没有传参数，或者参数不够数量
     *
     * @return 返回4000 状态码
     */
    @ExceptionHandler(HttpMessageNotReadableException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public Result httpMessageNotReadableException() {
        return ResultGenerator.genSuccessResult(ResultCode.HTTP_MESSAGE_NOT_READABLE);
    }


    /**
     * 自定义异常处理（失败）
     *
     * @return 返回4000 状态码
     */
    @ExceptionHandler(FailException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public Result failException(FailException e) {
        return ResultGenerator.genFailResult(e.getMessage());
    }


    /**
     * 自定义异常处理（成功）
     *
     * @return 返回2000 状态码
     */
    @ExceptionHandler(SuccessException.class)
    @ResponseStatus(HttpStatus.OK)
    public Result SuccessException(SuccessException e) {
        if (e.getResultCode() == null) {
            return ResultGenerator.genSuccessResult(e.getErrMsg());
        }
        return ResultGenerator.genSuccessResult(e.getResultCode());
    }

//
//    /**
//     * 阿里云OSS报错
//     *
//     * @return 返回2000 状态码jfgsd
//     */
//    @ExceptionHandler(InvalidCredentialsException.class)
//    @ResponseStatus(HttpStatus.OK)
//    public Result InvalidCredentialsException(InvalidCredentialsException e) {
//        return ResultGenerator.genFailResult(e.getMessage());
//    }

    /**
     * 未知主机异常
     *
     * @return 返回2000 状态码jfgsd
     */
    @ExceptionHandler(UnknownHostException.class)
    @ResponseStatus(HttpStatus.OK)
    public Result unknownHostException(UnknownHostException e) {
        return ResultGenerator.genFailResult(e.getMessage());
    }


    //=========================================全局异常拦截方法如下======================================================

    /**
     * 捕捉其他所有异常
     *
     * @param request 请求信息
     * @param ex      异常类型
     * @return 结果集
     */
    @ExceptionHandler(Exception.class)
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    public Result globalException(HttpServletRequest request, Throwable ex) {
        ex.printStackTrace();
        return ResultGenerator.genNeutralResult(getStatus(request).value(), "暂时不能为您提供服务，请联系管理员！");
    }

    /**
     * 获取java给我们提供的未被拦截的异常状态码
     *
     * @param request
     * @return
     */
    private HttpStatus getStatus(HttpServletRequest request) {
        Integer statusCode = (Integer) request.getAttribute("javax.servlet.error.status_code");
        if (statusCode == null) {
            return HttpStatus.INTERNAL_SERVER_ERROR;
        }
        return HttpStatus.valueOf(statusCode);
    }
}

