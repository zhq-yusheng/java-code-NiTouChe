package com.yu.feiqian.service;

import com.yu.feiqian.dto.BaseDto;
import com.yu.feiqian.mapper.LoginMapperImpl;
import com.yu.feiqian.view.LoginView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginServiceImpl implements LoginService {
    @Autowired
    private LoginMapperImpl loginMapper;
    @Override
    public LoginView query(LoginView loginView) {
        return loginMapper.query(loginView);
    }

    public BaseDto<LoginView> getBaseDto(LoginView loginView){
        BaseDto<LoginView> dto =  new BaseDto<LoginView>();
        if(loginView==null){
            dto.setCode(-1);
            dto.setMsg("用户密码错误");
            return dto;
        }else {
            dto.setCode(200);
            dto.setMsg("账号验证通过");
            return dto;
        }
    }
}
