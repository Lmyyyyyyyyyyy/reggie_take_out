package com.yang.reggie.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yang.reggie.entity.Orders;
import com.yang.reggie.mapper.OrderMapper;
import com.yang.reggie.service.AddressBookService;
import com.yang.reggie.service.OrderService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class OrderServiceImp extends ServiceImpl<OrderMapper, Orders> implements OrderService {


//    @Autowired
//    private ShoppingCartService shoppingCartService;
//
//    @Autowired
//    private UserService userService;
//
//    @Autowired
//    private AddressBookService addressBookService;
//
//    @Autowired
//    private OrderDetailService orderDetailService;

    @Override
    public void submit(Orders orders) {

    }
}
