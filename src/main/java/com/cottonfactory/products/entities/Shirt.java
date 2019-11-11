package com.cottonfactory.products.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Shirt {
    private String size;
    private String color;
    private float price;

    @Id @GeneratedValue
    Long id;

    public Shirt(String size, String color, float price) {
        this.size = size;
        this.color = color;
        this.price = price;
    }

    public String getSize() { return this.size; }

    public String getColor() { return this.color; }

    public float getPrice() { return this.price; }
}
