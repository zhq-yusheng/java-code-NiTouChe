package com.yu.feiqian.mapper;

import com.yu.feiqian.pojo.query;
import com.yu.feiqian.view.Jview;
import org.mybatis.spring.SqlSessionTemplate;

import java.util.ArrayList;

public class QueryStudentSevenMapperImpl implements QueryStudentSevenMapper {
    private SqlSessionTemplate sqlSessionTemplate;

    public void setSqlSessionTemplate(SqlSessionTemplate sqlSessionTemplate) {
        this.sqlSessionTemplate = sqlSessionTemplate;
    }

    @Override
    public ArrayList<Jview> queryJZT(query query) {
        return sqlSessionTemplate.getMapper(QueryStudentSevenMapper.class).queryJZT(query);
    }

    @Override
    public ArrayList<Jview> queryJCD(query query) {
        return sqlSessionTemplate.getMapper(QueryStudentSevenMapper.class).queryJCD(query);
    }

    @Override
    public ArrayList<Jview> queryJZC(query query) {
        return sqlSessionTemplate.getMapper(QueryStudentSevenMapper.class).queryJZC(query);
    }
}
