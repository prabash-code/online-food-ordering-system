package edu.icet.controller;


import edu.icet.model.dto.FoodItem;
import edu.icet.service.FoodItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/food")
public class FoodItemController {

    @Autowired
    FoodItemService foodItemService;

    @PostMapping
    public FoodItem addFoodItem(@RequestBody FoodItem foodItem){
        FoodItem foodItemAdd = foodItemService.addFoodItem(foodItem);
        return foodItemAdd;
    }
    @GetMapping
    public List<FoodItem> getAll(){
        return foodItemService.getAll();
    }
    @PutMapping("/{id}")
    public FoodItem updateCustomer(@PathVariable Long id, @RequestBody FoodItem foodItem){
        return foodItemService.updateFoodItem(id,foodItem);
    }
}
