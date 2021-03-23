package com.chuangshu.orange.service.impl;

import com.chuangshu.orange.entity.Equipment;
import com.chuangshu.orange.dao.EquipmentDao;
import com.chuangshu.orange.service.EquipmentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Equipment)表服务实现类
 *
 * @author makejava
 * @since 2021-03-21 17:00:03
 */
@Service
public class EquipmentServiceImpl implements EquipmentService {
    @Resource
    private EquipmentDao equipmentDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public Equipment queryById(Integer id) {
        return this.equipmentDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<Equipment> queryAllByLimit(int offset, int limit) {
        return this.equipmentDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param equipment 实例对象
     * @return 实例对象
     */
    @Override
    public Equipment insert(Equipment equipment) {
        this.equipmentDao.insert(equipment);
        return equipment;
    }

    /**
     * 修改数据
     *
     * @param equipment 实例对象
     * @return 实例对象
     */
    @Override
    public Equipment update(Equipment equipment) {
        this.equipmentDao.update(equipment);
        return this.queryById(equipment.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.equipmentDao.deleteById(id) > 0;
    }
     /**
     * 查询所有数据
     *
     * @return 对象列表
     */
    @Override
    public List<Equipment> queryOnlyAll() {
        return this.equipmentDao.queryOnlyAll();
    }
    
     /**
     * 通过实体作为筛选条件查询
     *
     * @param equipment 实例对象
     * @return 对象列表
     */
    @Override
    public List<Equipment> queryAll(Equipment equipment) {
        return this.equipmentDao.queryAll(equipment);
    }
}