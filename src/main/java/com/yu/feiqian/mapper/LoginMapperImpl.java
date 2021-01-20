package com.yu.feiqian.mapper;

import com.yu.feiqian.view.LoginView;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class LoginMapperImpl implements LogInMapper {

    @Autowired
    private SqlSessionTemplate sqlSessionTemplate;

    public void setSqlSessionTemplate(SqlSessionTemplate sqlSessionTemplate) {
        this.sqlSessionTemplate = sqlSessionTemplate;
    }

    @Override
    public LoginView query(LoginView loginView) {
        return sqlSessionTemplate.getMapper(LogInMapper.class).query(loginView);
    }
}
