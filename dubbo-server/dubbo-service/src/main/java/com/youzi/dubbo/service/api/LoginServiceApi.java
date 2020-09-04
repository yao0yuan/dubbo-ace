package com.youzi.dubbo.service.api;


import com.youzi.dubbo.common.enmus.result.JsonResult;
import com.youzi.dubbo.service.vo.RegistUserReqVo;

public interface LoginServiceApi {


    JsonResult<String> regist(RegistUserReqVo registUserReqVo);

}
