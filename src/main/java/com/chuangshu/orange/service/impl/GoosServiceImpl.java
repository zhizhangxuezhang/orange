package com.chuangshu.orange.service.impl;

import com.chuangshu.orange.entity.Goos;
import com.chuangshu.orange.dao.GoosDao;
import com.chuangshu.orange.service.GoosService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Goos)表服务实现类
 *
 * @author makejava
 * @since 2021-03-21 17:00:04
 */
@Service
public class GoosServiceImpl implements GoosService {
    @Resource
    private GoosDao goosDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public Goos queryById(Integer id) {
        return this.goosDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<Goos> queryAllByLimit(int offset, int limit) {
        return this.goosDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param goos 实例对象
     * @return 实例对象
     */
    @Override
    public Goos insert(Goos goos) {
        this.goosDao.insert(goos);
        return goos;
    }

    /**
     * 修改数据
     *
     * @param goos 实例对象
     * @return 实例对象
     */
    @Override
    public Goos update(Goos goos) {
        this.goosDao.update(goos);
        return this.queryById(goos.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.goosDao.deleteById(id) > 0;
    }
     /**
     * 查询所有数据
     *
     * @return 对象列表
     */
    @Override
    public List<Goos> queryOnlyAll() {
        return this.goosDao.queryOnlyAll();
    }
    
     /**
     * 通过实体作为筛选条件查询
     *
     * @param goos 实例对象
     * @return 对象列表
     */
    @Override
    public List<Goos> queryAll(Goos goos) {
        return this.goosDao.queryAll(goos);
    }
}