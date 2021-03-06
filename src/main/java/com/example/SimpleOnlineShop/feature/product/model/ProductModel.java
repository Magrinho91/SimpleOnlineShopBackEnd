package com.example.SimpleOnlineShop.feature.product.model;

import com.example.SimpleOnlineShop.feature.user.model.UserModel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ProductModel {
    @Id
    @GeneratedValue
    private Long id;

    @Column
    private String name;

    @Column
    private String categoryName;

    @Column
    private Double price;

    @ManyToOne
    private UserModel seller;

    @OneToOne
    private UserModel owner;

    @Column
    @Builder.Default
    private Boolean isBought = false;




}
