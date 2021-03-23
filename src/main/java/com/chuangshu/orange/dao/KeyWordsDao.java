package com.chuangshu.orange.dao;

import com.chuangshu.orange.entity.KeyWords;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * (KeyWords)表数据库访问层
 *
 * @author makejava
 * @since 2021-03-21 17:00:04
 */
public interface KeyWordsDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    KeyWords queryById(Integer id);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<KeyWords> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param keyWords 实例对象
     * @return 对象列表
     */
    List<KeyWords> queryAll(KeyWords keyWords);

    /**
     * 新增数据
     *
     * @param keyWords 实例对象
     * @return 影响行数
     */
    int insert(KeyWords keyWords);

    /**
     * 修改数据
     *
     * @param keyWords 实例对象
     * @return 影响行数
     */
    int update(KeyWords keyWords);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Integer id);
    
    /**
     * 查询所有数据
     *
     * @return 对象列表
     */
    List<KeyWords> queryOnlyAll();

}