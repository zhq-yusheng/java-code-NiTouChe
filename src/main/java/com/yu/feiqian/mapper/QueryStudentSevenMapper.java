package com.yu.feiqian.mapper;

import com.yu.feiqian.pojo.query;
import com.yu.feiqian.view.Jview;

import java.util.ArrayList;

public interface QueryStudentSevenMapper {

 ArrayList<Jview> queryJZT(query query);
    ArrayList<Jview> queryJCD(query query);
    ArrayList<Jview> queryJZC(query query);

}
