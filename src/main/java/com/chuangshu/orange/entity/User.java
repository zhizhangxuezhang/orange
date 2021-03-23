package com.chuangshu.orange.entity;

import java.io.Serializable;

/**
 * (User)实体类
 *
 * @author makejava
 * @since 2021-03-21 17:00:10
 */
public class User implements Serializable {
    private static final long serialVersionUID = 602209051582469513L;
    
    private Integer id;
    
    private String openid;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getOpenid() {
        return openid;
    }

    public void setOpenid(String openid) {
        this.openid = openid;
    }

}