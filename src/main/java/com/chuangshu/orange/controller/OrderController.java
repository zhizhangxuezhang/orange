package com.chuangshu.orange.controller;

import com.chuangshu.orange.entity.Order;
import com.chuangshu.orange.service.OrderService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Order)表控制层
 *
 * @author makejava
 * @since 2021-03-21 20:32:51
 */
@RestController
@RequestMapping("order")
@Api(tags = {"订单"})
public class OrderController {
    /**
     * 服务对象
     */
    @Resource
    private OrderService orderService;

    //查看我的所有订单
    @ApiOperation(value = "查看我的所有订单")
    @ApiImplicitParams({
            @ApiImplicitParam(paramType = "query", name = "userId", dataType = "int", required = true, value = "用户编号"),
    })
    @GetMapping("selByUserId")
    public List<Order> selByUserId(Integer userId){
        Order order = new Order();
        order.setUserId(userId);
        List<Order> orders = this.orderService.queryAll(order);
        return orders;
    }
    //删除一个订单
    @ApiOperation(value = "删除一个订单")
    @ApiImplicitParams({
            @ApiImplicitParam(paramType = "query", name = "id", dataType = "int", required = true, value = "订单编号"),
    })
    @DeleteMapping("delOne")
    public Boolean delOne(Integer id){
        boolean b = this.orderService.deleteById(id);
        return b;
    }
    //增加一个订单
    @ApiOperation(value = "增加一个订单")
    @ApiImplicitParams({
            @ApiImplicitParam(paramType = "query", name = "ddNum", dataType = "String", required = true, value = "订单号"),
            @ApiImplicitParam(paramType = "query", name = "goosId", dataType = "int", required = true, value = "商品编号"),
            @ApiImplicitParam(paramType = "query", name = "num", dataType = "int", required = true, value = "数量"),
            @ApiImplicitParam(paramType = "query", name = "status", dataType = "int", required = true, value = "状态(1:代签收，2：已签收)"),
            @ApiImplicitParam(paramType = "query", name = "userId", dataType = "int", required = true, value = "用户编号"),
    })
    @PostMapping("insOne")
    public Order insOne(String ddNum,Integer goosId,Integer num,Integer status,Integer userId){
        Order order = new Order();
        order.setDdNum(ddNum);
        order.setGoosId(goosId);
        order.setNum(num);
        order.setStatus(status);
        order.setUserId(userId);
        Order insert = this.orderService.insert(order);
        return insert;
    }
}