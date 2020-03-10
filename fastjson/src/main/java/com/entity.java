package com;

import com.alibaba.fastjson.annotation.JSONField;
import sun.util.resources.en.CurrencyNames_en_MT;

import javax.naming.NamingEnumeration;
import java.io.Serializable;
import java.util.Date;

/**
 * @author Josh
 * @version 1.0.0
 * @ClassName entity.java
 * @Description TODO
 * @createTime 2020-01-15 09:42:00
 */
public class entity implements Serializable {

    @JSONField(name = "序号",ordinal = 1,serialize = false)
    private String id;

    @JSONField(name = "名字",ordinal = 2)
    private String name;

    @JSONField(name = "年龄",format = "yyyy-MM-dd HH:mm:ss",ordinal = 3)
    private Date age;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getAge() {
        return age;
    }

    public void setAge(Date age) {
        this.age = age;
    }

    public entity(String id, String name, Date age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public entity() {
    }
}
