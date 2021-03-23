package com.chuangshu.orange.controller;

import com.chuangshu.orange.entity.Goos;
import com.chuangshu.orange.service.GoosService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Goos)表控制层
 *
 * @author makejava
 * @since 2021-03-21 17:00:04
 */
@RestController
@RequestMapping("goos")
@Api(tags = {"商城"})
public class GoosController {
    /**
     * 服务对象
     */
    @Resource
    private GoosService goosService;



    //查询全部
    @ApiOperation(value = "查询所有商品")
    @GetMapping("selOnlyAll")
    public List<Goos> selOnlyAll(){
        return this.goosService.queryOnlyAll();
    }
}