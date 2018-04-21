package com.dzy.mall.service;


import com.dzy.mall.mapper.UserMapper;
import com.dzy.mall.model.Person;
import com.dzy.mall.service.impl.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
class UserServiceImpl implements UserService {
    @Autowired
    UserMapper userMapper;

    @Override
    public Person selectUser(int id) {
        return userMapper.selectByPrimaryKey(id);
    }

}