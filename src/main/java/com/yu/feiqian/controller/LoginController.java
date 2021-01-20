package com.yu.feiqian.controller;


import com.yu.feiqian.dto.BaseDto;
import com.yu.feiqian.service.LoginServiceImpl;
import com.yu.feiqian.view.LoginView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class LoginController {
    @Autowired
    private LoginServiceImpl loginService;

    @PostMapping("/login")
    @ResponseBody
    public BaseDto<LoginView> loginVar(LoginView login){
        System.out.println(login);

        BaseDto<LoginView> baseDto = loginService.getBaseDto(loginService.query(login));

        return baseDto;
    }

}
