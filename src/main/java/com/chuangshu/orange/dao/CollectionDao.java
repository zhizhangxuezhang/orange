package com.chuangshu.orange.dao;

import com.chuangshu.orange.entity.Collection;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * (Collection)表数据库访问层
 *
 * @author makejava
 * @since 2021-03-21 17:00:00
 */
public interface CollectionDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    Collection queryById(Integer id);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<Collection> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param collection 实例对象
     * @return 对象列表
     */
    List<Collection> queryAll(Collection collection);

    /**
     * 新增数据
     *
     * @param collection 实例对象
     * @return 影响行数
     */
    int insert(Collection collection);

    /**
     * 修改数据
     *
     * @param collection 实例对象
     * @return 影响行数
     */
    int update(Collection collection);

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
    List<Collection> queryOnlyAll();

}