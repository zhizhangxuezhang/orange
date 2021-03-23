package com.chuangshu.orange.controller;

import com.chuangshu.orange.entity.Collection;
import com.chuangshu.orange.result.Result;
import com.chuangshu.orange.result.ResultUtil;
import com.chuangshu.orange.service.CollectionService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Collection)表控制层
 *
 * @author makejava
 * @since 2021-03-21 17:00:01
 */
@RestController
@RequestMapping("collection")
@Api(tags = {"收藏"})
public class CollectionController {
    /**
     * 服务对象
     */
    @Resource
    private CollectionService collectionService;


    //显示我的收藏
    @ApiOperation(value = "显示我的收藏")
    @ApiImplicitParams({
            @ApiImplicitParam(paramType = "query", name = "userId", dataType = "int", required = true, value = "用户编号"),
    })
    @GetMapping("selSome")
    public Result<Object> selSome(Integer userId){
        if(userId == null){
            return ResultUtil.Error("404","参数不能为空",null);
        }
        Collection collection = new Collection();
        collection.setUserId(userId);
        List<Collection> collections = this.collectionService.queryAll(collection);
        return ResultUtil.Success(collections);
    }
    //增加我的收藏
    @ApiOperation(value = "增加我的收藏")
    @ApiImplicitParams({
            @ApiImplicitParam(paramType = "query", name = "newsId", dataType = "int", required = true, value = "新闻编号"),
            @ApiImplicitParam(paramType = "query", name = "userId", dataType = "int", required = true, value = "用户编号")
    })
    @PostMapping("insOne")
    public Result<Object> insOne(Integer newsId,Integer userId){
        if(newsId==null ||userId ==null){
            return ResultUtil.Error("404","参数不能为空",null);
        }
        Collection collection = new Collection();
        collection.setNewsId(newsId);
        collection.setUserId(userId);
        Collection insert = this.collectionService.insert(collection);
        return ResultUtil.Success(insert);
    }
}