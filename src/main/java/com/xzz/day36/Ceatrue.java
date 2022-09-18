package com.xzz.day36;

/**
 * @author 徐正洲
 * @date 2022/6/13-20:41
 */
public class Ceatrue<T> {
    public String name;
    private int Id;

    public Ceatrue() {
    }

    public Ceatrue(String name, int id) {
        this.name = name;
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }
    private void show(){
        System.out.println("该我表演了！！！");
    }

    @Override
    public String toString() {
        return "Ceatrue{" +
                "name='" + name + '\'' +
                ", Id=" + Id +
                '}';
    }
}