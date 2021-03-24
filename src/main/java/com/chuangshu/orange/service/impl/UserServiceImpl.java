package com.chuangshu.orange.service.impl;

import com.chuangshu.orange.entity.User;
import com.chuangshu.orange.dao.UserDao;
import com.chuangshu.orange.service.UserService;
import com.chuangshu.orange.util.Http;
import com.chuangshu.orange.util.JsonUtils;
import com.chuangshu.orange.wx.WXSessionModel;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * (User)表服务实现类
 *
 * @author makejava
 * @since 2021-03-21 17:00:10
 */
@Service
public class UserServiceImpl implements UserService {
    @Resource
    private UserDao userDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public User queryById(Integer id) {
        return this.userDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<User> queryAllByLimit(int offset, int limit) {
        return this.userDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param user 实例对象
     * @return 实例对象
     */
    @Override
    public User insert(User user) {
        this.userDao.insert(user);
        return user;
    }

    /**
     * 修改数据
     *
     * @param user 实例对象
     * @return 实例对象
     */
    @Override
    public User update(User user) {
        this.userDao.update(user);
        return this.queryById(user.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.userDao.deleteById(id) > 0;
    }
     /**
     * 查询所有数据
     *
     * @return 对象列表
     */
    @Override
    public List<User> queryOnlyAll() {
        return this.userDao.queryOnlyAll();
    }
    
     /**
     * 通过实体作为筛选条件查询
     *
     * @param user 实例对象
     * @return 对象列表
     */
    @Override
    public List<User> queryAll(User user) {
        return this.userDao.queryAll(user);
    }

    @Override
    public String login(String code) {
        //微信获取openid和sessionkey的url
        String url = "https://api.weixin.qq.com/sns/jscode2session";
        //map集合存放信息
        Map<String, String> param = new HashMap<>();
        param.put("appid", "xx");
        param.put("secret", "xx");
        param.put("js_code", code);
        param.put("grant_type", "authorization_code");
        //调用自定义的doget方法，返回一个带有openid和sessionkey的string类型的结果
        String wxResult = Http.doGet(url, param);
        System.out.println(wxResult);
        //将结果转化为model的形式--格式转换
        WXSessionModel model = JsonUtils.jsonToPojo(wxResult, WXSessionModel.class);
        //获取open_id
        String open_id = model.getOpenid();
        return open_id;
    }
}
