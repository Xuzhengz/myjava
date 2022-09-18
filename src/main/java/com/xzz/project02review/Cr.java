package com.xzz.project02review;

import org.junit.Test;

/**
 * @author 徐正洲
 * @date 2022/5/19-9:57
 */
public class Cr {
    private String name;         //客户姓名
    private char gender;        //性别

    public Cr() {

    }
    public Cr(String name, char gender) {
        this.name = name;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

}