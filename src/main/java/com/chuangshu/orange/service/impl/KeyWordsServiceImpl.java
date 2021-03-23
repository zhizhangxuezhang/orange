package com.chuangshu.orange.service.impl;

import com.chuangshu.orange.entity.KeyWords;
import com.chuangshu.orange.dao.KeyWordsDao;
import com.chuangshu.orange.service.KeyWordsService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (KeyWords)表服务实现类
 *
 * @author makejava
 * @since 2021-03-21 17:00:05
 */
@Service
public class KeyWordsServiceImpl implements KeyWordsService {
    @Resource
    private KeyWordsDao keyWordsDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public KeyWords queryById(Integer id) {
        return this.keyWordsDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<KeyWords> queryAllByLimit(int offset, int limit) {
        return this.keyWordsDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param keyWords 实例对象
     * @return 实例对象
     */
    @Override
    public KeyWords insert(KeyWords keyWords) {
        this.keyWordsDao.insert(keyWords);
        return keyWords;
    }

    /**
     * 修改数据
     *
     * @param keyWords 实例对象
     * @return 实例对象
     */
    @Override
    public KeyWords update(KeyWords keyWords) {
        this.keyWordsDao.update(keyWords);
        return this.queryById(keyWords.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.keyWordsDao.deleteById(id) > 0;
    }
     /**
     * 查询所有数据
     *
     * @return 对象列表
     */
    @Override
    public List<KeyWords> queryOnlyAll() {
        return this.keyWordsDao.queryOnlyAll();
    }
    
     /**
     * 通过实体作为筛选条件查询
     *
     * @param keyWords 实例对象
     * @return 对象列表
     */
    @Override
    public List<KeyWords> queryAll(KeyWords keyWords) {
        return this.keyWordsDao.queryAll(keyWords);
    }
}