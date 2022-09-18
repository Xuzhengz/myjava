package com.xzz.day03;

/**
 * @author 徐正洲
 * @date 2022/5/5-20:08
 */
public class ManKind {
    //属性
    private int sex;
    private int salary;

    //构造器
    public ManKind() {
    }

    public ManKind(int sex, int salary) {
        this.sex = sex;
        this.salary = salary;
    }

    //方法
    public void manOrWoman(){
        if (this.sex==1){
            System.out.println("man");
        }else if (this.sex==0){
            System.out.println("woman");
        }
    }
    public void employeed(){
        if (this.salary ==0){
            System.out.println("失业");
        }else if (this.salary==1){
            System.out.println("就业");
        }
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}