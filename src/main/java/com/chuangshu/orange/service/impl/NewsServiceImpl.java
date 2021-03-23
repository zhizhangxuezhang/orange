package com.chuangshu.orange.service.impl;

import com.chuangshu.orange.entity.News;
import com.chuangshu.orange.dao.NewsDao;
import com.chuangshu.orange.service.NewsService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (News)表服务实现类
 *
 * @author makejava
 * @since 2021-03-21 17:30:05
 */
@Service
public class NewsServiceImpl implements NewsService {
    @Resource
    private NewsDao newsDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public News queryById(Integer id) {
        return this.newsDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<News> queryAllByLimit(int offset, int limit) {
        return this.newsDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param news 实例对象
     * @return 实例对象
     */
    @Override
    public News insert(News news) {
        this.newsDao.insert(news);
        return news;
    }

    /**
     * 修改数据
     *
     * @param news 实例对象
     * @return 实例对象
     */
    @Override
    public News update(News news) {
        this.newsDao.update(news);
        return this.queryById(news.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.newsDao.deleteById(id) > 0;
    }
     /**
     * 查询所有数据
     *
     * @return 对象列表
     */
    @Override
    public List<News> queryOnlyAll() {
        return this.newsDao.queryOnlyAll();
    }
    
     /**
     * 通过实体作为筛选条件查询
     *
     * @param news 实例对象
     * @return 对象列表
     */
    @Override
    public List<News> queryAll(News news) {
        return this.newsDao.queryAll(news);
    }
}