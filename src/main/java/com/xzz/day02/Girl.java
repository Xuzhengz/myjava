package com.xzz.day02;

/**
 * @author 徐正洲
 * @date 2022/5/2-16:56
 */
public class Girl {
    private String name;
    private int age;

    public Girl() {
    }

    public Girl(String name) {
        this.name = name;
    }

    public Girl(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void marry(Boy boy) {
        System.out.println("我要嫁给：" + boy.getName());
        boy.marry(this);
    }

    //比较两个对象的大小
    public int compare(Girl girl){
        if (this.age > girl.age){
            return 1;
        }else if (this.age < girl.age){
            return -1;
        }else {
            return 0;
        }

    }

}