package com.youzi.dubbo.provider.service.impl;


import com.youzi.dubbo.common.enmus.enums.JsonResultEnum;
import com.youzi.dubbo.common.enmus.result.JsonResult;
import com.youzi.dubbo.common.enmus.util.JsonResultUtil;
import com.youzi.dubbo.service.api.LoginServiceApi;
import com.youzi.dubbo.service.vo.RegistUserReqVo;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.stereotype.Component;

import static com.youzi.dubbo.common.enmus.result.JsonResult.SUCCESS;


@Component
@Service(version = "1.0.0",interfaceClass = LoginServiceApi.class)
public class LoginServiceImpl implements LoginServiceApi {


    @Override
    public JsonResult<String> regist(RegistUserReqVo registUserReqVo) {
        JsonResult<String> jsonResult = new JsonResult<>();
        try {
            //registUserReqVo.setPassword(new BCryptPasswordEncoder(10).encode(registUserReqVo.getPassword()));
            //loginMapper.saveUser(registUserReqVo);
            JsonResultUtil.setJsonResult(jsonResult, SUCCESS, JsonResultEnum.SUCCESS);
        }catch (Exception e){
            JsonResultUtil.setJsonResult(jsonResult, JsonResult.FAIL, JsonResultEnum.SAVE_ERROR);
        }
        return jsonResult;
    }


}
