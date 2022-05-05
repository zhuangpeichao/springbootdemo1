package cn.bdqn.springbootdemo.dao;

import cn.bdqn.springbootdemo.bean.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserDao {
    public User querByName(String userName);
}
