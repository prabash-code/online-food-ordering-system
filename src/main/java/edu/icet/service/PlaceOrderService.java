package edu.icet.service;

import edu.icet.controller.PlaceOrder;
import edu.icet.model.dto.Customer;
import edu.icet.model.entity.CustomerEntity;
import edu.icet.model.entity.PlaceOrderEntity;
import edu.icet.repository.PlaceOrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PlaceOrderService {
    @Autowired
    PlaceOrderRepository placeOrderRepository;

    public PlaceOrder placeNewOrder(PlaceOrder placeOrder) {
        PlaceOrderEntity placeOrderEntity=new PlaceOrderEntity();

        placeOrderEntity.setName(placeOrder.);
        placeOrderRepository.save(placeOrderEntity);

        return new PlaceOrder(placeOrderEntity.getId(),
                placeOrderEntity.getName(),
                placeOrderEntity.getCreateTime()
        );
    }
}
