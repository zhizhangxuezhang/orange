package com.chuangshu.orange.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * (BugDate)实体类
 *
 * @author makejava
 * @since 2021-03-21 16:59:57
 */
public class BugDate implements Serializable {
    private static final long serialVersionUID = 882912261154956840L;
    
    private Integer id;
    
    private Integer bugNum;
    
    private Integer upNum;
    
    private String pic;
    
    private Date aTime;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getBugNum() {
        return bugNum;
    }

    public void setBugNum(Integer bugNum) {
        this.bugNum = bugNum;
    }

    public Integer getUpNum() {
        return upNum;
    }

    public void setUpNum(Integer upNum) {
        this.upNum = upNum;
    }

    public String getPic() {
        return pic;
    }

    public void setPic(String pic) {
        this.pic = pic;
    }

    public Date getATime() {
        return aTime;
    }

    public void setATime(Date aTime) {
        this.aTime = aTime;
    }

}