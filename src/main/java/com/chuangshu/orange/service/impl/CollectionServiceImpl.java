package com.chuangshu.orange.service.impl;

import com.chuangshu.orange.entity.Collection;
import com.chuangshu.orange.dao.CollectionDao;
import com.chuangshu.orange.service.CollectionService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Collection)表服务实现类
 *
 * @author makejava
 * @since 2021-03-21 17:00:01
 */
@Service
public class CollectionServiceImpl implements CollectionService {
    @Resource
    private CollectionDao collectionDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public Collection queryById(Integer id) {
        return this.collectionDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<Collection> queryAllByLimit(int offset, int limit) {
        return this.collectionDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param collection 实例对象
     * @return 实例对象
     */
    @Override
    public Collection insert(Collection collection) {
        this.collectionDao.insert(collection);
        return collection;
    }

    /**
     * 修改数据
     *
     * @param collection 实例对象
     * @return 实例对象
     */
    @Override
    public Collection update(Collection collection) {
        this.collectionDao.update(collection);
        return this.queryById(collection.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.collectionDao.deleteById(id) > 0;
    }
     /**
     * 查询所有数据
     *
     * @return 对象列表
     */
    @Override
    public List<Collection> queryOnlyAll() {
        return this.collectionDao.queryOnlyAll();
    }
    
     /**
     * 通过实体作为筛选条件查询
     *
     * @param collection 实例对象
     * @return 对象列表
     */
    @Override
    public List<Collection> queryAll(Collection collection) {
        return this.collectionDao.queryAll(collection);
    }
}