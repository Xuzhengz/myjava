package com.xzz.day11;

/**
 * @author 徐正洲
 * @date 2022/5/13-19:41
 */
public abstract class Employeeooo {
    private String name;
    private int id;
    private double salary;
    public Employeeooo(){
        super();
    }

    public Employeeooo(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public abstract void work();

}