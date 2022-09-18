package com.xzz.project03.domain;

/**
 * @author 徐正洲
 * @date 2022/5/17-17:27
 */
public class Printer implements Equipment {
    private String name; //机器型号
    private String type; //机器类型

    public Printer() {
    }

    public Printer(String name, String type) {
        this.name = name;
        this.type = type;
    }

    @Override
    public String getDescription() {
        return this.name + "(" + this.type + ")";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}