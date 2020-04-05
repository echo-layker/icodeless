package com.icodeless.example.user.service.impl;

import com.icodeless.example.user.entity.UserEntity;
import com.icodeless.example.user.mapper.UserMapper;
import com.icodeless.example.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * UserEntity Service
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    /**
     * 查询所有UserEntity
     *
     * @return UserEntity List
     */
    @Override
    public List<UserEntity> findAll() {
        return userMapper.selectAll();
    }
}
