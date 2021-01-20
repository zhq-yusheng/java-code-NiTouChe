package com.yu.feiqian.service;

import com.yu.feiqian.mapper.QueryStudentSevenMapperImpl;
import com.yu.feiqian.pojo.query;
import com.yu.feiqian.utils.DataUtil;
import com.yu.feiqian.utils.JsonUtil;
import com.yu.feiqian.view.Json;
import com.yu.feiqian.view.Jview;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;


@Service
public class QueryStudentSevenServiceImpl implements QueryStudentSevenService {
    @Autowired
    private QueryStudentSevenMapperImpl queryStudentSevenMapper;
    @Override
    public ArrayList<Jview> queryJZT(query query) {
        return queryStudentSevenMapper.queryJZT(query);
    }

    @Override
    public ArrayList<Jview> queryJCD(query query) {
        return queryStudentSevenMapper.queryJCD(query);
    }

    @Override
    public ArrayList<Jview> queryJZC(query query) {
        return queryStudentSevenMapper.queryJZC(query);
    }
    public String getJson(ArrayList<Jview> query,ArrayList<String> d){

        ArrayList<Json> array = DataUtil.getArray(query, d);

        String json = JsonUtil.getJson(array);

        return json;
    }
}
