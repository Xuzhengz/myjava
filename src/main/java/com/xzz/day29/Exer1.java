package com.xzz.day29;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 徐正洲
 * @date 2022/6/5-19:52
 */
public class Exer1<T> {
    //类的内部接口就可以使用泛型。
    T orderT;

    public Exer1() {

    }

    public Exer1(T orderT) {
        this.orderT = orderT;
    }

    public T getOrderT() {
        return orderT;
    }

    public void setOrderT(T orderT) {
        this.orderT = orderT;
    }

    @Override
    public String toString() {
        return "Exer1{" +
                "orderT=" + orderT +
                '}';
    }

    //泛型方法：在方法中出现了泛型的结构
    public <E> List<E> copy(E[] arr){
        ArrayList<E> es = new ArrayList<>();
        for (E e : arr) {
            es.add(e);
        }
        return es;
    }

}