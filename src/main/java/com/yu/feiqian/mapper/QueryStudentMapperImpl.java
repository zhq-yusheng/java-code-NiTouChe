package com.yu.feiqian.mapper;

import com.yu.feiqian.view.Jview;
import org.mybatis.spring.SqlSessionTemplate;

public class QueryStudentMapperImpl implements QueryStudentMapper {

    private SqlSessionTemplate sqlSessionTemplate;

    public void setSqlSessionTemplate(SqlSessionTemplate sqlSessionTemplate) {
        this.sqlSessionTemplate = sqlSessionTemplate;
    }

    @Override
    public Jview queryJZT(String format) {

        return sqlSessionTemplate.getMapper(QueryStudentMapper.class).queryJZT(format);
    }

    @Override
    public Jview queryJCD(String format) {
        return sqlSessionTemplate.getMapper(QueryStudentMapper.class).queryJCD(format);
    }

    @Override
    public Jview queryJZC(String format) {
        return sqlSessionTemplate.getMapper(QueryStudentMapper.class).queryJZC(format);
    }
}
