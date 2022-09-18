package com.xzz.myjava;

/**
 * @author 徐正洲
 * @date 2022/4/29-9:31
 * 递归：方法体内调用它自已
 */
public class 面向对象上_递归方法 {
    public static void main(String[] args) {
        //    例 计算1-100自然数的和
        面向对象上_递归方法 addMethod = new 面向对象上_递归方法();
        System.out.println(addMethod.getSum(3));


    }

    public int getSum(int i) {
        if (i == 1) {
            return 1;
        } else {
            return i + getSum(i - 1);
        }

    }


}