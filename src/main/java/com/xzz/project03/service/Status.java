package com.xzz.project03.service;

/**
 * @author 徐正洲
 * @date 2022/5/18-9:57
 */
//表示员工的状态
public enum Status{
    //创建三个对象 表示员工状态
    //枚举对象 有限个。
    FREE("FREE"),//空闲
    BUSY("BUSY"), //忙碌
    VOCATION("VOCATION"); //休假

    private final String NAME;


    //构造器
    private Status(String name) {
        this.NAME = name;
    }

    public String getNAME() {
        return NAME;
    }

    @Override
    public String toString() {
        return NAME;
    }
}
