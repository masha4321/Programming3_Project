package com.project.Project.service.Iservice;

import com.project.Project.model.Item;
import com.project.Project.model.OrderDelivery;
import com.project.Project.model.OrderDelivery;
import com.project.Project.model.OrderDetails;
import com.project.Project.model.User;

import java.util.List;

public interface OrderDeliveryService {

    //Everything that affects the order details ( or the actual item list in the order)

    List<OrderDetails> findByOrder(OrderDelivery order);

    OrderDetails addItemToOrder (Item item, User user, int amount);

    OrderDetails updateOrderDetails(OrderDetails orderDetails);

    void removeItem(OrderDetails orderDetails);

    OrderDetails save (OrderDetails orderDetails);





    //Everything that affects the order

    OrderDelivery findById(long id);

    OrderDelivery updateOrderDelivery(OrderDelivery orderDelivery);

    void clearOrder(OrderDelivery orderDelivery);

}
