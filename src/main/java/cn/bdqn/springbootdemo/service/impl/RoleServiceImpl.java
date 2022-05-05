package cn.bdqn.springbootdemo.service.impl;

import cn.bdqn.springbootdemo.dao.RoleDao;
import cn.bdqn.springbootdemo.bean.Role;
import cn.bdqn.springbootdemo.service.RoleService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;
@Service
@Transactional
public class RoleServiceImpl implements RoleService {
    @Resource
    public RoleDao roleDao;
    @Override
    public List<Role> querAll() {
        return this.querAll();
    }
}
