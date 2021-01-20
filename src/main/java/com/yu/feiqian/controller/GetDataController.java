package com.yu.feiqian.controller;

import com.yu.feiqian.service.QueryStudentServiceImpl;
import com.yu.feiqian.service.QueryStudentSevenServiceImpl;
import com.yu.feiqian.utils.DateUtil;
import com.yu.feiqian.view.Jview;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;

@Controller
public class GetDataController {
    @Autowired
    private QueryStudentServiceImpl queryStudentService;

    @Autowired
    private QueryStudentSevenServiceImpl queryStudentSevenService;


    @GetMapping("/getJzt") // 获取今天早退的人
    @ResponseBody
    @CrossOrigin
    public Jview getJZT(){
        System.out.println("被人访问！！");
        return queryStudentService.queryJZT(DateUtil.getDate());
    }

    @GetMapping("/getJcd") // 获取今天迟到的人
    @ResponseBody
    @CrossOrigin
    public Jview getJCD(){
        return queryStudentService.queryJCD(DateUtil.getDate());
    }

    @GetMapping("/getJzc") // 获取今天正常签到的人
    @ResponseBody
    @CrossOrigin
    public Jview getJZC(){
        return queryStudentService.queryJZC(DateUtil.getDate());
    }

    @GetMapping("/getJkd") // 获取今天狂到的人
    @ResponseBody
    @CrossOrigin
    public Jview getJKD(){
        return new Jview(0);
    }

    //-----------------------------------

    @GetMapping("/getJScd") // 获取今天狂到的人
    @ResponseBody
    @CrossOrigin
    public String getJScd(){
        ArrayList<String> d = DateUtil.getDates();
        ArrayList<Jview> jviews = queryStudentSevenService.queryJCD(DateUtil.getQuery(d));
        String json = queryStudentSevenService.getJson(jviews, d);
        return json;
    }
    @GetMapping("/getJSzt") // 获取今天狂到的人
    @ResponseBody
    @CrossOrigin
    public String getJSzt(){
        ArrayList<String> d = DateUtil.getDates();
        ArrayList<Jview> jviews = queryStudentSevenService.queryJZT(DateUtil.getQuery(d));
        String json = queryStudentSevenService.getJson(jviews, d);
        return json;
    }

    @GetMapping("/getJSzc") // 获取7天正常上课
    @ResponseBody
    @CrossOrigin
    public String getJSzc(){
        System.out.println("被请求了");
        ArrayList<String> d = DateUtil.getDates();
        ArrayList<Jview> jviews = queryStudentSevenService.queryJZC(DateUtil.getQuery(d));
        String json = queryStudentSevenService.getJson(jviews, d);
        return json;
    }
}
