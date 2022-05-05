package cn.bdqn.springbootdemo.dao;

import cn.bdqn.springbootdemo.bean.Role;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface RoleDao {
    public List<Role> querAll();
}
