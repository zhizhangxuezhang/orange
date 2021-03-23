package com.chuangshu.orange.controller;

import com.chuangshu.orange.entity.User;
import com.chuangshu.orange.result.Result;
import com.chuangshu.orange.result.ResultUtil;
import com.chuangshu.orange.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * (User)表控制层
 *
 * @author makejava
 * @since 2021-03-21 17:00:10
 */
@RestController
@RequestMapping("user")
@Api(tags = {"用户"})
public class UserController {
    /**
     * 服务对象
     */
    @Resource
    private UserService userService;


    //登陆功能
    @PostMapping("userLogin")
    @ApiOperation(value = "用户微信小程序登陆")
    @ApiImplicitParams({
            @ApiImplicitParam(paramType = "query", name = "code", dataType = "String", required = true, value = "code")
    })
    public Result userLogin(String code){
        if(code == null){
            return ResultUtil.Error("500","code为空",null);
        }
        String openId;
        try {
            openId = userService.login(code);
        }catch (Exception e){
            return ResultUtil.Error("500","登陆失败：",e.toString());
        }
        //判断数据库中有无该用户
        User user = new User();
        user.setOpenid(openId);
        List<User> users = userService.queryAll(user);
        //没有就创建
        if(users.get(0)==null){
            User user1 = new User();
            user.setOpenid(openId);
            User insert = userService.insert(user1);
            return ResultUtil.Success(insert);
        }else {
            return ResultUtil.Success(user);
        }

    }
}