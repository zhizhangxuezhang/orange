package com.chuangshu.orange.service.impl;

import com.chuangshu.orange.entity.MyMall;
import com.chuangshu.orange.dao.MyMallDao;
import com.chuangshu.orange.service.MyMallService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (MyMall)表服务实现类
 *
 * @author makejava
 * @since 2021-03-21 17:00:06
 */
@Service
public class MyMallServiceImpl implements MyMallService {
    @Resource
    private MyMallDao myMallDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public MyMall queryById(Integer id) {
        return this.myMallDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<MyMall> queryAllByLimit(int offset, int limit) {
        return this.myMallDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param myMall 实例对象
     * @return 实例对象
     */
    @Override
    public MyMall insert(MyMall myMall) {
        this.myMallDao.insert(myMall);
        return myMall;
    }

    /**
     * 修改数据
     *
     * @param myMall 实例对象
     * @return 实例对象
     */
    @Override
    public MyMall update(MyMall myMall) {
        this.myMallDao.update(myMall);
        return this.queryById(myMall.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.myMallDao.deleteById(id) > 0;
    }
     /**
     * 查询所有数据
     *
     * @return 对象列表
     */
    @Override
    public List<MyMall> queryOnlyAll() {
        return this.myMallDao.queryOnlyAll();
    }
    
     /**
     * 通过实体作为筛选条件查询
     *
     * @param myMall 实例对象
     * @return 对象列表
     */
    @Override
    public List<MyMall> queryAll(MyMall myMall) {
        return this.myMallDao.queryAll(myMall);
    }
}