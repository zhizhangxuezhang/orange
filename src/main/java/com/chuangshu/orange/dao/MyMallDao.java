package com.chuangshu.orange.dao;

import com.chuangshu.orange.entity.MyMall;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * (MyMall)表数据库访问层
 *
 * @author makejava
 * @since 2021-03-21 17:00:05
 */
public interface MyMallDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    MyMall queryById(Integer id);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<MyMall> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param myMall 实例对象
     * @return 对象列表
     */
    List<MyMall> queryAll(MyMall myMall);

    /**
     * 新增数据
     *
     * @param myMall 实例对象
     * @return 影响行数
     */
    int insert(MyMall myMall);

    /**
     * 修改数据
     *
     * @param myMall 实例对象
     * @return 影响行数
     */
    int update(MyMall myMall);

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
    List<MyMall> queryOnlyAll();

}