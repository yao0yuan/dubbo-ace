package com.youzi.dubbo.common.enmus.util;


import com.youzi.dubbo.common.enmus.enums.JsonResultEnum;
import com.youzi.dubbo.common.enmus.result.JsonResult;

import java.io.Serializable;

public class JsonResultUtil implements Serializable {

    public static void setJsonResult(JsonResult<? extends Object> jsonResult, Integer result, JsonResultEnum resultEnum) {
        jsonResult.setResult(result);
        jsonResult.setMsg(resultEnum.getErrMsg());
        jsonResult.setResCode(resultEnum.getErrCode());
    }

    public static <T> void setJsonResult(JsonResult<T> jsonResult, Integer result, JsonResultEnum resultEnum, T info) {
        jsonResult.setResult(result);
        jsonResult.setMsg(resultEnum.getErrMsg());
        jsonResult.setResCode(resultEnum.getErrCode());
        jsonResult.setInfo(info);
    }

    public static <T> void setJsonResultERROR(JsonResult<T> jsonResult) {
        jsonResult.setResult(JsonResult.FAIL);
        jsonResult.setMsg(JsonResultEnum.INTERNAL_SERVER_ERROR.getErrMsg());
        jsonResult.setResCode(JsonResultEnum.INTERNAL_SERVER_ERROR.getErrCode());
    }

}
