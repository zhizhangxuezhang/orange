package com.chuangshu.orange.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * (News)实体类
 *
 * @author makejava
 * @since 2021-03-21 17:30:03
 */
public class News implements Serializable {
    private static final long serialVersionUID = -15285829910946419L;
    
    private Integer id;
    
    private String name;
    
    private String context;
    
    private Date createTime;
    
    private Integer lookedNum;
    
    private String pic;
    
    private String thumb;
    
    private String createWriter;
    
    private String createPic;
    
    private String type;


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

    public String getContext() {
        return context;
    }

    public void setContext(String context) {
        this.context = context;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getLookedNum() {
        return lookedNum;
    }

    public void setLookedNum(Integer lookedNum) {
        this.lookedNum = lookedNum;
    }

    public String getPic() {
        return pic;
    }

    public void setPic(String pic) {
        this.pic = pic;
    }

    public String getThumb() {
        return thumb;
    }

    public void setThumb(String thumb) {
        this.thumb = thumb;
    }

    public String getCreateWriter() {
        return createWriter;
    }

    public void setCreateWriter(String createWriter) {
        this.createWriter = createWriter;
    }

    public String getCreatePic() {
        return createPic;
    }

    public void setCreatePic(String createPic) {
        this.createPic = createPic;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

}