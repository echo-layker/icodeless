package com.icodeless.example.user.service;

import com.icodeless.example.user.entity.UserEntity;

import java.util.List;

/**
 * 用户信息service
 */
public interface UserService {
    /**
     * 查询所有UserEntity
     *
     * @return UserEntity List
     */
    List<UserEntity> findAll();
}
