package com.project.Project.service.impl;

import com.project.Project.model.Item;
import com.project.Project.model.OrderDelivery;
import com.project.Project.model.OrderDetails;
import com.project.Project.model.User;
import com.project.Project.repository.OrderDeliveryRepository;
import com.project.Project.repository.OrderDetailsRepository;
import com.project.Project.service.Iservice.OrderDeliveryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

@Service
public class OrderDeliveryImpl implements OrderDeliveryService {

    @Autowired
    private OrderDeliveryRepository orderDeliveryRepository;

    @Autowired
    private OrderDeliveryService orderDeliveryService;

    @Autowired
    private OrderDetailsRepository orderDetailsRepository;

    public List<OrderDetails> findByOrder(OrderDelivery orderDelivery){
        return orderDeliveryRepository.findByOrderDelivery(orderDelivery);
    }

    //Not 100% sure if it's actually pulling order's or order list. Need to test
    //If it works, then it's done
    public OrderDelivery findById(long id){
        return orderDeliveryRepository.findById(id).orElse(null);
    }


    public OrderDetails addItemToOrder(Item item, User user, int amount){
        List<OrderDetails> orderDetailsList = findByOrder(user.getOrderDelivery());

        for (OrderDetails orderDetails : orderDetailsList){
            if(item.getItemId() == orderDetails.getItem().getItemId()){
                orderDetails.setItemQuantity(orderDetails.getItemQuantity()+amount);
                orderDetails.setSubtotal(new BigDecimal(item.getItemPrice()).multiply(new BigDecimal(amount)));
                orderDetailsRepository.save(orderDetails);
                return orderDetails;
            }
        }

        OrderDetails orderDetails = new OrderDetails();
        orderDetails.setOrderDelivery(user.getOrderDelivery());
        orderDetails.setItem(item);

        orderDetails.setItemQuantity(amount);
        orderDetails.setSubtotal(new BigDecimal(item.getItemPrice()).multiply(new BigDecimal(amount)));
        orderDetails = orderDetailsRepository.save(orderDetails);



        //Something maybe missing right here??? Not sure

        return orderDetails;

    }

    public OrderDetails updateOrderDetails (OrderDetails orderDetails){
        BigDecimal bigDecimal = new BigDecimal(orderDetails.getItem().getItemPrice())
                        .multiply(new BigDecimal(orderDetails.getItemQuantity()));

        orderDetails.setSubtotal(bigDecimal);
        orderDetailsRepository.save(orderDetails);

        return orderDetails;

    }

    public void removeItem(OrderDetails orderDetails){
        orderDeliveryRepository.deleteByItem(orderDetails);
    }


    //Can't get this one to work. Need help ( I don't know if I SHOULD be using orderDetailsRepository
    //and not jsut orderDetails
    public OrderDetails save(OrderDetails orderDetails){
        return orderDetailsRepository.save(orderDetails);
    }

    public OrderDelivery updateOrderDelivery(OrderDelivery orderDelivery){
        BigDecimal orderTotal = new BigDecimal(0);

        List<OrderDetails> itemList = orderDeliveryService.findByOrder(orderDelivery);

        for(OrderDetails orderDetails : itemList){
            orderDeliveryService.updateOrderDetails(orderDetails);
            orderTotal = orderTotal.add(orderDetails.getSubtotal());
        }

        orderDelivery.setOrderTotal(orderTotal);

        orderDeliveryRepository.save(orderDelivery);

        return orderDelivery;
    }

    public void clearOrder(OrderDelivery orderDelivery){

        List<OrderDetails> itemList = orderDeliveryService.findByOrder(orderDelivery);

        for(OrderDetails orderDetails : itemList){
            orderDetails.setOrderDelivery(null);
            orderDeliveryService.save(orderDetails);
        }

        orderDelivery.setOrderTotal(new BigDecimal(0));

        orderDeliveryRepository.save(orderDelivery);

    }










}
