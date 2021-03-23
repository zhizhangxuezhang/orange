package com.chuangshu.orange.service;

import com.chuangshu.orange.entity.KeyWords;
import java.util.List;

/**
 * (KeyWords)表服务接口
 *
 * @author makejava
 * @since 2021-03-21 17:00:05
 */
public interface KeyWordsService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    KeyWords queryById(Integer id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<KeyWords> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param keyWords 实例对象
     * @return 实例对象
     */
    KeyWords insert(KeyWords keyWords);

    /**
     * 修改数据
     *
     * @param keyWords 实例对象
     * @return 实例对象
     */
    KeyWords update(KeyWords keyWords);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);
    
     /**
     * 查询所有数据
     *
     * @return 对象列表
     */
    List<KeyWords> queryOnlyAll();
    
    /**
     * 通过实体作为筛选条件查询
     *
     * @param keyWords 实例对象
     * @return 对象列表
     */
    List<KeyWords> queryAll(KeyWords keyWords);


}