package com.yu.feiqian.utils;

import com.yu.feiqian.pojo.query;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class DateUtil {
    public static String getDate(){
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String format = sdf.format(date);
        return format+" %";
    }
    public static ArrayList<String> getDates(){
        Date date = new Date();
        ArrayList<String> formats=new ArrayList<>();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        long dayHm=86400*1000;
        for (int i = 0; i < 7; i++) {
            if(i==0){
                String format = sdf.format(date);
                formats.add(format+" %");
            }else {
                long number = date.getTime() - i * dayHm;
                Date date1 = new Date(number);
                String format = sdf.format(date1);
                formats.add(format + " %");
            }
        }
        return formats;
    }

    public static query getQuery(ArrayList<String> d){

        return new query(d.get(0), d.get(1), d.get(2), d.get(3), d.get(4), d.get(5), d.get(6));
    }
}
