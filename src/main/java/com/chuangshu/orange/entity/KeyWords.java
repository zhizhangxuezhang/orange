package com.chuangshu.orange.entity;

import java.io.Serializable;

/**
 * (KeyWords)实体类
 *
 * @author makejava
 * @since 2021-03-21 17:00:04
 */
public class KeyWords implements Serializable {
    private static final long serialVersionUID = -17281656018342015L;
    
    private Integer id;
    
    private Integer newsId;
    
    private String text;


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

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

}