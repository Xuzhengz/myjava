package com.xzz.project03.domain;

/**
 * @author 徐正洲
 * @date 2022/5/17-17:22
 */
public class PC implements Equipment {
    private String model;  //机器型号
    private String display; //显示器名称

    public PC() {
    }

    public PC(String model, String display) {
        this.model = model;
        this.display = display;
    }

    @Override
    public String getDescription() {
        return this.model + "(" + this.display + ")";
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getDisplay() {
        return display;
    }

    public void setDisplay(String display) {
        this.display = display;
    }
}