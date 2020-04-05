package com.icodeless.example.user.mapper;

import com.icodeless.example.user.entity.UserEntity;

import java.util.List;

/**
 * @description 用户信息实体Mapper
 */
public interface UserMapper {

    /**
     * 查询所有用户信息实体
     *
     * @return 用户信息实体列表
     */
    List<UserEntity> selectAll();

    /**
     * 通过primaryKey@com.icodeless.example.user.entity.UserEntity#id查询用户信息实体
     *
     * @return 用户信息实体
     */
    UserEntity selectOneById();

    /**
     * @param userEntity
     * @return
     */
    UserEntity insert(UserEntity userEntity);

    /**
     * 通过primaryKey@com.icodeless.example.user.entity.UserEntity#id更新非空字段
     *
     * @param userEntity
     * @return
     */
    int update(UserEntity userEntity);


    /**
     * 通过primaryKey@com.icodeless.example.user.entity.UserEntity#id删除用户信息实体
     *
     * @param id
     * @return 影响行数
     */
    int delete(Long id);
}
