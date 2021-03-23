package com.chuangshu.orange.controller;

import com.chuangshu.orange.entity.Equipment;
import com.chuangshu.orange.service.EquipmentService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Equipment)表控制层
 *
 * @author makejava
 * @since 2021-03-21 17:00:03
 */
@RestController
@RequestMapping("equipment")
@Api(tags = {"设备"})
public class EquipmentController {
    /**
     * 服务对象
     */
    @Resource
    private EquipmentService equipmentService;

    //增加设备
    @ApiOperation(value = "添加一台设备")
    @ApiImplicitParams({
            @ApiImplicitParam(paramType = "query", name = "name", dataType = "String", required = true, value = "设备名字"),
            @ApiImplicitParam(paramType = "query", name = "userId", dataType = "int", required = true, value = "用户编号"),
            @ApiImplicitParam(paramType = "query", name = "portNum", dataType = "String", required = true, value = "端口号")
    })
    @PostMapping("insOne")
    public Equipment insOne(String name,Integer userId,String portNum){
        Equipment equipment = new Equipment();
        equipment.setName(name);
        equipment.setPortNum(portNum);
        equipment.setUserId(userId);
        Equipment insert = equipmentService.insert(equipment);
        return insert;
    }
    //根据id查询设备
    @ApiOperation(value = "根据编号查询设备")
    @ApiImplicitParams({
            @ApiImplicitParam(paramType = "query", name = "id", dataType = "int", required = true, value = "设备编号"),
    })
    @GetMapping("selOne")
    public Equipment selOne(Integer id){
        Equipment equipment = this.equipmentService.queryById(id);
        return equipment;
    }
    @ApiOperation(value = "删除设备")
    @ApiImplicitParams({
            @ApiImplicitParam(paramType = "query", name = "id", dataType = "int", required = true, value = "设备编号"),
    })
    @DeleteMapping("delOne")
    //删除设备
    public boolean delOne(Integer id){
        boolean b = this.equipmentService.deleteById(id);
        return b;
    }
    //根据用户id查询设备
    public List<Equipment> selByUserId(Integer userId){
        Equipment equipment = new Equipment();
        equipment.setUserId(userId);
        List<Equipment> equipments = equipmentService.queryAll(equipment);
        return equipments;
    }
}