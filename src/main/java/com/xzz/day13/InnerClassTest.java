package com.xzz.day13;

/**
 * @author 徐正洲
 * @date 2022/5/15-20:17
 */
public class InnerClassTest {
    // 返回一个实现了Compable接口的类的对象
    public Comparable getCompable(){
        class MyCompable implements Comparable{
            @Override
            public int compareTo(Object o) {
                return 0;
            }
        }
        return new MyCompable();
    }
}