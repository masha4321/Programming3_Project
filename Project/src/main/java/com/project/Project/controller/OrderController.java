package com.project.Project.controller;


import com.project.Project.model.OrderDelivery;
import com.project.Project.service.Iservice.OrderDeliveryService;
import com.project.Project.service.Iservice.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class OrderController {

    @Autowired
    private UserService userService;

    @Autowired
    private OrderDeliveryService orderDeliveryServiceService;
}
