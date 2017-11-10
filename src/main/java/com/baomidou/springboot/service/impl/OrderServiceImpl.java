package com.baomidou.springboot.service.impl;

import com.baomidou.mybatisplus.service.IService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.baomidou.springboot.entity.Order;
import com.baomidou.springboot.mapper.OrderMapper;
import com.baomidou.springboot.service.OrderService;
import org.springframework.stereotype.Service;

/**
 * Created by wangxc on 2017/11/10 10:17.
 */
@Service
public class OrderServiceImpl extends ServiceImpl<OrderMapper,Order> implements OrderService{
}
