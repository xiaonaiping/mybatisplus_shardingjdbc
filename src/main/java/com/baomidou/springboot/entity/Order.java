package com.baomidou.springboot.entity;

import com.baomidou.mybatisplus.annotations.TableName;

/**
 * Created by wangxc on 2017/11/10 10:14.
 */
@TableName("t_order")
public class Order {
    private Long orderId;
    private int userId;
    private String status;

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderId=" + orderId +
                ", userId=" + userId +
                ", status='" + status + '\'' +
                '}';
    }
}
