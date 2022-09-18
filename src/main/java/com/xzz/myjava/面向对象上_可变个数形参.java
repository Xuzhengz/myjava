package com.xzz.myjava;

/**
 * @author 徐正洲
 * @date 2022/4/28-20:52
 *
 * 格式：  数据类型 ... 变量名
 *
 * 当调用可变个数形参的方法时，传入参数的个数 0。。。。n
 * 可变形参可与本类方法名相同的构成重载
 * 可变形参可与本类方法名相同的，形参为数组的不构成重载。
 * 可变个数形参，必须声明在末尾，并且最多只能声明一个。
 */
public class 面向对象上_可变个数形参 {
    public static void main(String[] args) {
        面向对象上_可变个数形参 varMethod = new 面向对象上_可变个数形参();
        varMethod.print("ada");
        varMethod.print("ada","asda");
        varMethod.print();


    }

    public void  print(String ... strings){
        System.out.println("可变形参");
    }

    public void  print(String s ){
        System.out.println(s);
    }
}