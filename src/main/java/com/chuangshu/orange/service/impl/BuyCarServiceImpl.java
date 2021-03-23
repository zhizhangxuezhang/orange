package com.chuangshu.orange.service.impl;

import com.chuangshu.orange.entity.BuyCar;
import com.chuangshu.orange.dao.BuyCarDao;
import com.chuangshu.orange.service.BuyCarService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (BuyCar)表服务实现类
 *
 * @author makejava
 * @since 2021-03-21 17:00:00
 */
@Service
public class BuyCarServiceImpl implements BuyCarService {
    @Resource
    private BuyCarDao buyCarDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public BuyCar queryById(Integer id) {
        return this.buyCarDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<BuyCar> queryAllByLimit(int offset, int limit) {
        return this.buyCarDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param buyCar 实例对象
     * @return 实例对象
     */
    @Override
    public BuyCar insert(BuyCar buyCar) {
        this.buyCarDao.insert(buyCar);
        return buyCar;
    }

    /**
     * 修改数据
     *
     * @param buyCar 实例对象
     * @return 实例对象
     */
    @Override
    public BuyCar update(BuyCar buyCar) {
        this.buyCarDao.update(buyCar);
        return this.queryById(buyCar.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.buyCarDao.deleteById(id) > 0;
    }
     /**
     * 查询所有数据
     *
     * @return 对象列表
     */
    @Override
    public List<BuyCar> queryOnlyAll() {
        return this.buyCarDao.queryOnlyAll();
    }
    
     /**
     * 通过实体作为筛选条件查询
     *
     * @param buyCar 实例对象
     * @return 对象列表
     */
    @Override
    public List<BuyCar> queryAll(BuyCar buyCar) {
        return this.buyCarDao.queryAll(buyCar);
    }
}