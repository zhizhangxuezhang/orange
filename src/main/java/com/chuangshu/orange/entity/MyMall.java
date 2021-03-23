package com.chuangshu.orange.entity;

import java.io.Serializable;

/**
 * (MyMall)实体类
 *
 * @author makejava
 * @since 2021-03-21 17:00:05
 */
public class MyMall implements Serializable {
    private static final long serialVersionUID = 971279249839904555L;
    
    private Integer id;
    
    private String name;
    
    private String pic;
    
    private String introduce;
    
    private Integer hasNums;
    
    private Integer hasBuy;
    
    private Object aPrice;
    
    private Integer userId;


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

    public String getPic() {
        return pic;
    }

    public void setPic(String pic) {
        this.pic = pic;
    }

    public String getIntroduce() {
        return introduce;
    }

    public void setIntroduce(String introduce) {
        this.introduce = introduce;
    }

    public Integer getHasNums() {
        return hasNums;
    }

    public void setHasNums(Integer hasNums) {
        this.hasNums = hasNums;
    }

    public Integer getHasBuy() {
        return hasBuy;
    }

    public void setHasBuy(Integer hasBuy) {
        this.hasBuy = hasBuy;
    }

    public Object getAPrice() {
        return aPrice;
    }

    public void setAPrice(Object aPrice) {
        this.aPrice = aPrice;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

}