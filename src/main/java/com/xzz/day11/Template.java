package com.xzz.day11;

/**
 * @author 徐正洲
 * @date 2022/5/13-20:01
 * <p>
 * 模板方法的设计模式：
 */
public class Template {
    public static void main(String[] args) {
        Test subT = new SubT();
        subT.code();
        subT.test();
    }
}

abstract class Test {
    //计算代码所花费的时间
    public void test() {
        long l = System.currentTimeMillis();
        this.code();
        long end = System.currentTimeMillis();
        System.out.println(3 - 2);


    }

    public abstract void code();
}

class SubT extends Test {

    @Override
    public void code() {
        int sum = 0;
        for (int i = 0; i < 100; i++) {
            if (i % 2 == 0) {
                sum += i;
            }
        }
        System.out.println(sum);
    }
}