package com.xzz.day01;

/**
 * @author 徐正洲
 * @date 2022/5/1-20:54
 */
public class TriAngle {
    private int base;
    private int height;

    public TriAngle(int a, int b) {
        base = a;
        height = b;
    }
    public TriAngle(){

    }

    public int getBase(){
        return base;
    }
    public void setBase(int b){
        base =b;
    }
    public int getHeight(){
        return height;
    }
    public void setHeight(int h){
        height =h;
    }


}