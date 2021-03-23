package com.chuangshu.orange.service;

import com.chuangshu.orange.entity.MyMall;
import java.util.List;

/**
 * (MyMall)表服务接口
 *
 * @author makejava
 * @since 2021-03-21 17:00:06
 */
public interface MyMallService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    MyMall queryById(Integer id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<MyMall> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param myMall 实例对象
     * @return 实例对象
     */
    MyMall insert(MyMall myMall);

    /**
     * 修改数据
     *
     * @param myMall 实例对象
     * @return 实例对象
     */
    MyMall update(MyMall myMall);

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
    List<MyMall> queryOnlyAll();
    
    /**
     * 通过实体作为筛选条件查询
     *
     * @param myMall 实例对象
     * @return 对象列表
     */
    List<MyMall> queryAll(MyMall myMall);


}