package com.chuangshu.orange.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * (Comment)实体类
 *
 * @author makejava
 * @since 2021-03-21 17:00:01
 */
public class Comment implements Serializable {
    private static final long serialVersionUID = -74876572233112640L;
    
    private Integer id;
    
    private Integer newsId;
    
    private String context;
    
    private String name;
    
    private String touxiangUrl;
    
    private Date createTime;
    
    private Integer dianzanNum;


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

    public String getContext() {
        return context;
    }

    public void setContext(String context) {
        this.context = context;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTouxiangUrl() {
        return touxiangUrl;
    }

    public void setTouxiangUrl(String touxiangUrl) {
        this.touxiangUrl = touxiangUrl;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getDianzanNum() {
        return dianzanNum;
    }

    public void setDianzanNum(Integer dianzanNum) {
        this.dianzanNum = dianzanNum;
    }

}