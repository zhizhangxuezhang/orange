package com.chuangshu.orange.service;

import com.chuangshu.orange.entity.Goos;
import java.util.List;

/**
 * (Goos)表服务接口
 *
 * @author makejava
 * @since 2021-03-21 17:00:04
 */
public interface GoosService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    Goos queryById(Integer id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<Goos> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param goos 实例对象
     * @return 实例对象
     */
    Goos insert(Goos goos);

    /**
     * 修改数据
     *
     * @param goos 实例对象
     * @return 实例对象
     */
    Goos update(Goos goos);

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
    List<Goos> queryOnlyAll();
    
    /**
     * 通过实体作为筛选条件查询
     *
     * @param goos 实例对象
     * @return 对象列表
     */
    List<Goos> queryAll(Goos goos);


}