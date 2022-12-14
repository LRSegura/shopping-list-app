package com.lab.shoppinglist.model.item;


import com.lab.shoppinglist.api.annotations.Description;
import com.lab.shoppinglist.api.annotations.InjectedDate;
import com.lab.shoppinglist.model.AEntity;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.math.BigDecimal;
import java.time.LocalDate;

@Getter
@Setter
@ToString
@Entity
public class Item extends AEntity {

    @Column(nullable = false, unique = true)
    private String name;

    @Column(nullable = false)
    private BigDecimal price;

    @ManyToOne
    @JoinColumn(name = "item_category_id", nullable = false)
    private ItemCategory itemCategory;

    @Column(name = "register_date",nullable = false)
    @InjectedDate
    @Description("Register Date")
    private LocalDate registerDate;

}
