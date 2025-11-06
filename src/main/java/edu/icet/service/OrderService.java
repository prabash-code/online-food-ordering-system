package edu.icet.service;

import edu.icet.model.dto.Order;
import edu.icet.model.entity.OrderEntity;
import edu.icet.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class OrderService {
    @Autowired
    OrderRepository orderRepository;
    public void orderSave(Order order) {
        OrderEntity orderEntity=new OrderEntity();
        orderEntity.setCustomerId(order.getCustomerId());

    }


    public Order viewOrders(Long id) {
        Optional<OrderEntity> byId = orderRepository.findById(id);
        if(byId.isEmpty()){
            return null;
        }
            OrderEntity orderEntity=byId.get();
            return new Order(orderEntity.getOrderId(),
                    orderEntity.getCustomerId(),
                    orderEntity.getCreateTime()

                    );

    }
}
