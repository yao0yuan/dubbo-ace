package com.youzi.dubbo.consum.controller;


import com.youzi.dubbo.common.enmus.result.JsonResult;
import com.youzi.dubbo.service.api.LoginServiceApi;
import com.youzi.dubbo.service.vo.RegistUserReqVo;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/LoginController")
public class LoginController {

    @Reference(version = "1.0.0")
    private LoginServiceApi loginServiceApi;

    @PostMapping("/regist")
    public JsonResult<String> regist(@RequestBody RegistUserReqVo registUserReqVo){
        JsonResult<String> jsonResult = loginServiceApi.regist(registUserReqVo);
        return jsonResult;
    }
}
