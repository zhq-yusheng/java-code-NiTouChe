package com.yu.feiqian.utils;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;



public class JsonUtil {
    public static String getJson(Object obj){
        ObjectMapper objectMapper= new ObjectMapper();
        String Json ="";
        try {
             Json = objectMapper.writeValueAsString(obj);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return Json;

    }
}
