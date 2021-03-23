package com.chuangshu.orange.entity;

import java.io.Serializable;

/**
 * (BuyCar)实体类
 *
 * @author makejava
 * @since 2021-03-21 16:59:59
 */
public class BuyCar implements Serializable {
    private static final long serialVersionUID = 814236919520267895L;
    
    private Integer id;
    
    private Integer goosId;
    
    private Integer userId;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getGoosId() {
        return goosId;
    }

    public void setGoosId(Integer goosId) {
        this.goosId = goosId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

}