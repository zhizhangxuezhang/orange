package com.chuangshu.orange.entity;

import java.io.Serializable;

/**
 * (Equipment)实体类
 *
 * @author makejava
 * @since 2021-03-21 17:00:02
 */
public class Equipment implements Serializable {
    private static final long serialVersionUID = -70097019653698926L;
    
    private Integer id;
    
    private String name;
    
    private Integer userId;
    
    private String portNum;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getPortNum() {
        return portNum;
    }

    public void setPortNum(String portNum) {
        this.portNum = portNum;
    }

}