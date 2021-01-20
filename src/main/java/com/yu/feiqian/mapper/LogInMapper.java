package com.yu.feiqian.mapper;

import com.yu.feiqian.view.LoginView;
import org.apache.ibatis.annotations.Select;

public interface LogInMapper {

    @Select("select uName,PWD from tbluser where uName=#{uName} and PWD=#{PWD}")
    LoginView query(LoginView loginView);
}
