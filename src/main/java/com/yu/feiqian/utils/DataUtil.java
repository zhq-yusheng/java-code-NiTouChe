package com.yu.feiqian.utils;

import com.yu.feiqian.view.Json;
import com.yu.feiqian.view.Jview;
import java.util.ArrayList;

public class DataUtil {
    public static ArrayList<Json> getArray( ArrayList<Jview> jviews,ArrayList<String> d){
        ArrayList<Json> data=new ArrayList<>();
        for (int i = 0; i < jviews.size(); i++) {
            String key = d.get(i);
            String s = key.split(" ")[0];
            data.add(new Json(s,jviews.get(i).getRs()+""));
        }
        return data;
    }
}
