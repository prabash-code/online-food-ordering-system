package edu.icet.repository;

import edu.icet.model.dto.FoodItem;
import edu.icet.model.entity.FoodItemEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FoodItemRepository extends JpaRepository<FoodItemEntity,Long> {
}
