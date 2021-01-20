package com.yu.feiqian.service;

import com.yu.feiqian.pojo.query;
import com.yu.feiqian.view.Jview;

import java.util.ArrayList;

public interface QueryStudentSevenService {
    ArrayList<Jview> queryJZT(query query);
    ArrayList<Jview> queryJCD(query query);
    ArrayList<Jview> queryJZC(query query);
}
