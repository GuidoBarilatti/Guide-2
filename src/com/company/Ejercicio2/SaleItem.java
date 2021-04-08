package com.company.Ejercicio2;

public class SaleItem {
    private String id;
    private String name;
    private String description;
    private float price;
    public SaleItem(){

    }

    public SaleItem(String id, String name, String description, float price) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
    }

    public float getPrice() {
        return price;
    }
}
