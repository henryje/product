package com.example.product.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
//todo what is the difference in using lombok Data as to using the
//Getter and Setter
public class Product {
    @Id
    //todo what is the differences in the GenerationType
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private int productId;
    private String name;
    private String description;
    private double price;
}
