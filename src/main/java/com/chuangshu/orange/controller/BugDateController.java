package com.chuangshu.orange.controller;

import com.chuangshu.orange.entity.BugDate;
import com.chuangshu.orange.service.BugDateService;

import javax.annotation.Resource;

/**
 * (BugDate)表控制层
 *
 * @author makejava
 * @since 2021-03-21 16:59:59
 */
public class BugDateController {
    /**
     * 服务对象
     */
    @Resource
    private BugDateService bugDateService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */

    public BugDate selectOne(Integer id) {
        return this.bugDateService.queryById(id);
    }

}