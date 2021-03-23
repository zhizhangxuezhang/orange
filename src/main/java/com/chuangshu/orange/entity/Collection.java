package com.chuangshu.orange.entity;

import java.io.Serializable;

/**
 * (Collection)实体类
 *
 * @author makejava
 * @since 2021-03-21 17:00:00
 */
public class Collection implements Serializable {
    private static final long serialVersionUID = 568773628581957323L;
    
    private Integer id;
    
    private Integer newsId;
    
    private Integer userId;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getNewsId() {
        return newsId;
    }

    public void setNewsId(Integer newsId) {
        this.newsId = newsId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

}