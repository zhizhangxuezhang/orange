package com.chuangshu.orange.controller;

import com.chuangshu.orange.entity.MyMall;
import com.chuangshu.orange.oss.service.AliOssService;
import com.chuangshu.orange.service.MyMallService;
import io.swagger.annotations.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import java.util.List;

/**
 * (MyMall)表控制层
 *
 * @author makejava
 * @since 2021-03-21 17:00:06
 */
@RestController
@RequestMapping("myMall")
@Api(tags = {"我的商城"})
public class MyMallController {
    /**
     * 服务对象
     */
    @Resource
    private MyMallService myMallService;
    @Resource
    private AliOssService aliOssService;


    //显示我的商城
    @ApiOperation(value = "显示我的商城")
    @ApiImplicitParams({
            @ApiImplicitParam(paramType = "query", name = "userId", dataType = "int", required = true, value = "用户编号"),
    })
    @GetMapping("selSome")
    public List<MyMall> selSome(Integer userId){
        MyMall myMall = new MyMall();
        myMall.setUserId(userId);
        List<MyMall> myMalls = this.myMallService.queryAll(myMall);
        return myMalls;
    }
    //增加一个我的商城
    @ApiOperation(value = "添加一个我的商城")
    @ApiImplicitParams({
            @ApiImplicitParam(paramType = "query", name = "name", dataType = "String", required = true, value = "商品名称"),
            @ApiImplicitParam(paramType = "query", name = "introduce", dataType = "String", required = true, value = "介绍"),
            @ApiImplicitParam(paramType = "query", name = "hasNums", dataType = "int", required = true, value = "剩余数量"),
            @ApiImplicitParam(paramType = "query", name = "hasBuy", dataType = "int", required = true, value = "已卖数量"),
            @ApiImplicitParam(paramType = "query", name = "aPrice", dataType = "double", required = true, value = "单价"),
            @ApiImplicitParam(paramType = "query", name = "userId", dataType = "int", required = true, value = "用户编号")
    })
    @PostMapping("insOne")
    public MyMall insOne(String name, @ApiParam(value = "商品图片")MultipartFile pic, String introduce, Integer hasNums, Integer hasBuy, Double aPrice, Integer userId){
        //上传图片并返回文件路径
        String upload = aliOssService.upload(pic);
        MyMall myMall = new MyMall();
        myMall.setName(name);
        myMall.setPic(upload);
        myMall.setIntroduce(introduce);
        myMall.setHasBuy(hasBuy);
        myMall.setHasNums(hasNums);
        myMall.setAPrice(aPrice);
        myMall.setUserId(userId);
        MyMall insert = this.myMallService.insert(myMall);
        return insert;
    }
}