package com.chuangshu.orange.entity;

import java.io.Serializable;

/**
 * (Order)实体类
 *
 * @author makejava
 * @since 2021-03-21 20:32:49
 */
public class Order implements Serializable {
    private static final long serialVersionUID = 708404717757537549L;
    
    private Integer id;
    
    private String ddNum;
    
    private Integer goosId;
    
    private Integer num;
    
    private Integer status;
    
    private Integer userId;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDdNum() {
        return ddNum;
    }

    public void setDdNum(String ddNum) {
        this.ddNum = ddNum;
    }

    public Integer getGoosId() {
        return goosId;
    }

    public void setGoosId(Integer goosId) {
        this.goosId = goosId;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

}