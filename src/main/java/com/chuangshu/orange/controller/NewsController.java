package com.chuangshu.orange.controller;

import com.chuangshu.orange.entity.News;
import com.chuangshu.orange.service.NewsService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * (News)表控制层
 *
 * @author makejava
 * @since 2021-03-21 17:30:05
 */
@RestController
@RequestMapping("news")
@Api(tags = {"新闻"})
public class NewsController {
    /**
     * 服务对象
     */
    @Resource
    private NewsService newsService;


    //查询所有新闻
    @ApiOperation(value = "查询所有的新闻")
    @GetMapping("selOnlyAll")
    public List<News> selOnlyAll(){
        return this.newsService.queryOnlyAll();
    }
    //查询一个新闻
    @ApiOperation(value = "查询一个新闻")
    @ApiImplicitParams({
            @ApiImplicitParam(paramType = "query", name = "id", dataType = "int", required = true, value = "新闻编号"),
    })
    @GetMapping("selOne")
    public News selOne(Integer id){
        News news = this.newsService.queryById(id);
        news.setLookedNum(news.getLookedNum()+1);
        News update = this.newsService.update(news);
        return update;
    }
}