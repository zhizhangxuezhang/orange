package com.chuangshu.orange.controller;

import com.chuangshu.orange.entity.BuyCar;
import com.chuangshu.orange.result.Result;
import com.chuangshu.orange.result.ResultUtil;
import com.chuangshu.orange.service.BuyCarService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * (BuyCar)表控制层
 *
 * @author makejava
 * @since 2021-03-21 17:00:00
 */
@RestController
@RequestMapping("buyCar")
@Api(tags = {"购物车"})
public class BuyCarController {
    /**
     * 服务对象
     */
    @Resource
    private BuyCarService buyCarService;

    //添加一个购物车
    @ApiOperation(value = "添加一个购物车")
    @ApiImplicitParams({
            @ApiImplicitParam(paramType = "query", name = "goosId", dataType = "int", required = true, value = "购物车编号"),
            @ApiImplicitParam(paramType = "query", name = "userId", dataType = "int", required = true, value = "用户编号")
    })
    @PostMapping("insOne")
    public Result<Object> insOne(Integer goosId, Integer userId){
        if(goosId==null||userId==null){
            return ResultUtil.Error("404","参数不能为空",null);
        }
        BuyCar buyCar = new BuyCar();
        buyCar.setGoosId(goosId);
        buyCar.setUserId(userId);
        BuyCar insert = buyCarService.insert(buyCar);
        return ResultUtil.Success(insert);
    }
    @ApiOperation("删除一个购物车")
    @ApiImplicitParams({
            @ApiImplicitParam(paramType = "query", name = "id", dataType = "int", required = true, value = "购物车编号"),
    })
    @DeleteMapping(value = "delOne")
    //减少购物车
    public Result<Object> delOne(Integer id){
        if(id==null){
            return ResultUtil.Error("404","参数不能为空",null);
        }
        boolean b = this.buyCarService.deleteById(id);
        return ResultUtil.Success(b);
    }
    //查询我的所有购物车
    @GetMapping("selOnlyCar")
    @ApiOperation(value = "查询我的所有购物车")
    public Result<Object> selOnlyCar(){
        List<BuyCar> buyCars = this.buyCarService.queryOnlyAll();
        return ResultUtil.Success(buyCars);
    }
}