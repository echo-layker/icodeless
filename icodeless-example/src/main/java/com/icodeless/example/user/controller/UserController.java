package com.icodeless.example.user.controller;

import com.icodeless.example.user.entity.UserEntity;
import com.icodeless.example.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 用户信息
 */
@RestController
@RequestMapping
public class UserController {

    @Autowired
    private UserService userService;

    /**
     * 查询用户信息实体列表
     *
     * @return
     */
    @RequestMapping("list")
    public ResponseEntity<List<UserEntity>> list() {
        return ResponseEntity.ok(userService.findAll());
    }
}
