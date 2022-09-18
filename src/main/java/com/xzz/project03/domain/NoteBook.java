package com.xzz.project03.domain;

/**
 * @author 徐正洲
 * @date 2022/5/17-17:25
 */
public class NoteBook implements Equipment {
    private String model; //机器型号
    private double price; //价格

    public NoteBook() {
    }

    public NoteBook(String model, double price) {
        this.model = model;
        this.price = price;
    }

    @Override
    public String getDescription() {
        return this.model + "(" + this.price + ")";
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}