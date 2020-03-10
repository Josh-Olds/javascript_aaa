package com.json;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.entity;

import javax.print.attribute.standard.JobSheets;
import java.util.Date;

/**
 * @author Josh
 * @version 1.0.0
 * @ClassName Demo.java
 * @Description TODO
 * @createTime 2020-01-15 09:41:00
 */
public class Demo {

    public static void main(String[] args) {

        entity entity = new entity("1","2",new Date());

        String json = JSON.toJSONString(entity);
        System.out.println(json);

        JSONArray jsonArray= new JSONArray();
        JSONObject jsonObject  =  new JSONObject();
        jsonObject.put("名字","对象");
        jsonObject.put("年龄",new Date());

        System.out.println(jsonObject.get("名字"));
        String ss = jsonObject.toJSONString();
        System.out.println(ss);

        entity fianl_entity = JSON.parseObject(ss,entity.class);

        System.out.println(JSON.toJSONString(fianl_entity));





    }



}
