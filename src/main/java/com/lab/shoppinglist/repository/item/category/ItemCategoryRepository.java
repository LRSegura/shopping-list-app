package com.lab.shoppinglist.repository.item.category;

import com.lab.shoppinglist.model.item.ItemCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ItemCategoryRepository extends JpaRepository<ItemCategory, Long> {

    Optional<ItemCategory> findItemCategoriesByDescription(String description);

}