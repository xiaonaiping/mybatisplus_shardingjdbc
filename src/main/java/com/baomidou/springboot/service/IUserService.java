package com.baomidou.springboot.service;

import java.util.List;

import com.baomidou.mybatisplus.service.IService;
import com.baomidou.springboot.entity.User;

/**
 *
 * User 表数据服务层接口
 *
 */
public interface IUserService extends IService<User> {

	boolean deleteAll();

	public List<User> selectListBySQL();
}