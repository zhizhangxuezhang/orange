package com.chuangshu.orange.entity;

import java.io.Serializable;

/**
 * (Goos)实体类
 *
 * @author makejava
 * @since 2021-03-21 17:00:03
 */
public class Goos implements Serializable {
    private static final long serialVersionUID = 999971509858717429L;
    
    private Integer id;
    
    private String name;
    
    private Object aPrice;
    
    private Integer buyNum;
    
    private String pic;
    
    private String kind;


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

    public Object getAPrice() {
        return aPrice;
    }

    public void setAPrice(Object aPrice) {
        this.aPrice = aPrice;
    }

    public Integer getBuyNum() {
        return buyNum;
    }

    public void setBuyNum(Integer buyNum) {
        this.buyNum = buyNum;
    }

    public String getPic() {
        return pic;
    }

    public void setPic(String pic) {
        this.pic = pic;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

}