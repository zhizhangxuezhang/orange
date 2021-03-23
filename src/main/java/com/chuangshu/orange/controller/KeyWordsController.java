package com.chuangshu.orange.controller;

import com.chuangshu.orange.entity.KeyWords;
import com.chuangshu.orange.service.KeyWordsService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * (KeyWords)表控制层
 *
 * @author makejava
 * @since 2021-03-21 17:00:05
 */
@RestController
@RequestMapping("keyWords")
@Api(tags = {"新闻标签"})
public class KeyWordsController {
    /**
     * 服务对象
     */
    @Resource
    private KeyWordsService keyWordsService;


    //显示指定新闻的关键字
    @ApiOperation(value = "显示指定新闻的关键字")
    @ApiImplicitParams({
            @ApiImplicitParam(paramType = "query", name = "newsId", dataType = "int", required = true, value = "新闻编号"),
    })
    @GetMapping("selAll")
    public List<KeyWords> selAll(Integer newsId){
        KeyWords keyWords = new KeyWords();
        keyWords.setNewsId(newsId);
        List<KeyWords> keyWords1 = this.keyWordsService.queryAll(keyWords);
        return keyWords1;
    }
}