package edu.icet.service;

import edu.icet.model.dto.Customer;
import edu.icet.model.dto.FoodItem;
import edu.icet.model.entity.CustomerEntity;
import edu.icet.model.entity.FoodItemEntity;
import edu.icet.repository.FoodItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class FoodItemService {
    @Autowired
    FoodItemRepository foodItemRepository;

    public FoodItem addFoodItem(FoodItem foodItem) {
            FoodItemEntity foodEntity=new FoodItemEntity();

        foodEntity.setName(foodItem.getName());
        foodEntity.setUnitPrice(foodItem.getUnitPrice());
        foodEntity.setDescription(foodItem.getDescription());

        foodItemRepository.save(foodEntity);

        return new FoodItem(foodEntity.getId(),
                foodEntity.getName(),
                foodEntity.getUnitPrice(),
                foodEntity.getDescription()
        );
    }

    public List<FoodItem> getAll() {
        List<FoodItemEntity> all=foodItemRepository.findAll();
        List<FoodItem> list=new ArrayList<>();
        for(FoodItemEntity foodItemEntity:all){
            list.add(new FoodItem(foodItemEntity.getId(),
                    foodItemEntity.getName(),
                    foodItemEntity.getUnitPrice(),
                    foodItemEntity.getDescription()
            ));

        }
        return list;
    }

    public FoodItem updateFoodItem(Long id, FoodItem foodItem) {
        Optional<FoodItemEntity> byId = foodItemRepository.findById(id);
        if(byId.isEmpty()) {
            return null;
        }
        FoodItemEntity foodItemEntity=byId.get();

        foodItemEntity.setName(foodItem.getName());
        foodItemEntity.setUnitPrice(foodItem.getUnitPrice());
        foodItemEntity.setDescription(foodItem.getDescription());

        foodItemRepository.save(foodItemEntity);

        return new FoodItem(
                foodItemEntity.getId(),
                foodItemEntity.getName(),
                foodItemEntity.getUnitPrice(),
                foodItemEntity.getDescription()
        );
    }

}
