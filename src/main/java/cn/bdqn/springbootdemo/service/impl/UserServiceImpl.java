package cn.bdqn.springbootdemo.service.impl;

import cn.bdqn.springbootdemo.dao.UserDao;
import cn.bdqn.springbootdemo.bean.User;
import cn.bdqn.springbootdemo.service.UserService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

@Service
@Transactional
public class UserServiceImpl implements UserService{
    @Resource
    public UserDao userDao;
    @Override
    public User querByName(String userName) {
        return userDao.querByName(userName);
    }
}
