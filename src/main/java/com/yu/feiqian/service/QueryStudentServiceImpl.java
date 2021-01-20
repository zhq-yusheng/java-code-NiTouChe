package com.yu.feiqian.service;

import com.yu.feiqian.mapper.QueryStudentMapperImpl;
import com.yu.feiqian.view.Jview;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class QueryStudentServiceImpl implements QueryStudentService {

    @Autowired
    private QueryStudentMapperImpl queryStudentMapper;
    @Override
    public Jview queryJZT(String format) {

        return queryStudentMapper.queryJZT(format);
    }

    @Override
    public Jview queryJCD(String format) {
        return queryStudentMapper.queryJCD(format);
    }

    @Override
    public Jview queryJZC(String format) {
        return queryStudentMapper.queryJZC(format);
    }
}
