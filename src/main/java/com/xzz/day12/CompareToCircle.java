package com.xzz.day12;

/**
 * @author 徐正洲
 * @date 2022/5/14-20:46
 */
public class CompareToCircle extends Circle implements CompareObject {
    public CompareToCircle(double radius){
        super(radius);
    }
    @Override
    public int CompareTo(Object o) {
        if (this == o){
            return 0;
        }
        if (o instanceof CompareToCircle){
            CompareToCircle compareToCircle =(CompareToCircle)o;
            if (this.getRadius() > compareToCircle.getRadius()){
                return 1;
            }else if (this.getRadius() < compareToCircle.getRadius()){
                return  -1;
            }else {
                return 0;
            }
        }
        return 0;
    }
}