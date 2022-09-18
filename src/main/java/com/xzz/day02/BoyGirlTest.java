package com.xzz.day02;

/**
 * @author 徐正洲
 * @date 2022/5/2-17:10
 */
public class BoyGirlTest {
    public static void main(String[] args) {
        Boy boy = new Boy("徐正洲", 23);
        Girl girl = new Girl("朱丽叶",22);
        girl.marry(boy);
        Girl girl1 = new Girl("祝英台", 21);
        System.out.println(girl.compare(girl1)); //形参为girl1 年龄为21 比当前调用的对象girl年龄22小。

    }
}