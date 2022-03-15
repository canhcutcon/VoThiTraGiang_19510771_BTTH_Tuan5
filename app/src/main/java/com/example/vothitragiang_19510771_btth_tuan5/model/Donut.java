package com.example.vothitragiang_19510771_btth_tuan5.model;

public class Donut {
    private int id;
    private String name;
    private String description;
    private int price;

    public Donut(int id,String name,String description,int price){
        this.id = id;
        this.description = description;
        this.name = name;
        this.price = price;
    }

    public Donut(){

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Donut{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", price='" + price + '\'' +
                '}';
    }
}
