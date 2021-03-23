package com.chuangshu.orange.service.impl;

import com.chuangshu.orange.entity.BugDate;
import com.chuangshu.orange.dao.BugDateDao;
import com.chuangshu.orange.service.BugDateService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (BugDate)表服务实现类
 *
 * @author makejava
 * @since 2021-03-21 16:59:59
 */
@Service
public class BugDateServiceImpl implements BugDateService {
    @Resource
    private BugDateDao bugDateDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public BugDate queryById(Integer id) {
        return this.bugDateDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<BugDate> queryAllByLimit(int offset, int limit) {
        return this.bugDateDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param bugDate 实例对象
     * @return 实例对象
     */
    @Override
    public BugDate insert(BugDate bugDate) {
        this.bugDateDao.insert(bugDate);
        return bugDate;
    }

    /**
     * 修改数据
     *
     * @param bugDate 实例对象
     * @return 实例对象
     */
    @Override
    public BugDate update(BugDate bugDate) {
        this.bugDateDao.update(bugDate);
        return this.queryById(bugDate.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.bugDateDao.deleteById(id) > 0;
    }
     /**
     * 查询所有数据
     *
     * @return 对象列表
     */
    @Override
    public List<BugDate> queryOnlyAll() {
        return this.bugDateDao.queryOnlyAll();
    }
    
     /**
     * 通过实体作为筛选条件查询
     *
     * @param bugDate 实例对象
     * @return 对象列表
     */
    @Override
    public List<BugDate> queryAll(BugDate bugDate) {
        return this.bugDateDao.queryAll(bugDate);
    }
}