package com.baomidou.springboot.controller;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.springboot.entity.Order;
import com.baomidou.springboot.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by wangxc on 2017/11/10 10:19.
 */
@RestController
public class OrderController {
    @Autowired
    private OrderService orderService;
    @RequestMapping("queryOrderByUserId")
    public List<Order> queryOrderByUserId(Long userId){
        Map<String, Object> stringObjectHashMap = new HashMap<>();
        stringObjectHashMap.put("user_id",userId);
        List<Order> orders = orderService.selectByMap(stringObjectHashMap);
        return orders;
    }
}
