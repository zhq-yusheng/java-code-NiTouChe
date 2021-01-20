package com.yu.feiqian.service;

import com.yu.feiqian.view.Jview;
import org.apache.ibatis.annotations.Param;

public interface QueryStudentService {
    Jview queryJZT(String format);
    Jview queryJCD(String format);
    Jview queryJZC(String format);

}
