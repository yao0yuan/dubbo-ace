package com.youzi.dubbo.service.vo;

import javax.validation.constraints.NotEmpty;
import java.io.Serializable;


public class LoginUserReqVo implements Serializable {

    @NotEmpty(message = "用户名不能为空")
    private String loginName;

    @NotEmpty(message = "密码不能为空")
    private String password;

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
