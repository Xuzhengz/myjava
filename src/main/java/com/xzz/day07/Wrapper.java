package com.xzz.day07;

import org.junit.Test;

/**
 * @author 徐正洲
 * @date 2022/5/9-19:44
 *
 * 包装类：java提供了8中基本数据类型对应的包装类，使得基本数据类型的变量具有类的特征。
 * 1）数值型的包装类父类为Number类。
 * 特殊：  int--->Integer    char--->Character
 *
 * 2）基本数据类型与包装类转换
 * 调用包装类的构造器。
 *
 * 3）包装类与基本数据类型转换
 * 对象.包装类类型方法    列如integer.intValue()
 *
 * 4）String类型--->基本数据类型、包装类
 * 调用包装类的方法 例如 Integer.parseInt(String类型变量)
 *
 * 5）说明：Integer内部定义了IntegerCache结构，IntegerCache中定义了Integer[] 数组范围为-127-128 超出则生成一个新的对象
 *
 *
 * */
public class Wrapper {
    //基本数据类型与包装类转换
    @Test
    public void test1(){
        int i =10;
        Integer integer = new Integer(i);
        System.out.println(integer.toString());

        Integer integer1 = new Integer("123");
        System.out.println(integer1.toString());

    }

    //包装类与基本数据类型转换
    @Test
    public void test2(){
        Integer integer = new Integer(12);
        int i = integer.intValue();
        int a = i +12;
        System.out.println(a);

    }



    public void method(Object object){
        System.out.println(object);
    }

    //自动装箱
    @Test
    public void test3(){
        int i=10;
        // Integer l =i;
        method(i);

        //自动拆箱
//        int a =l;
    }

    //基本数据类型、包装类--->String类型
    @Test
    public void test4(){

        int i =10;
//        方式一：字符串拼接
        String string = i + " ";
        System.out.println(string);

//        方式二：调用String重载的valueof方法
        System.out.println(String.valueOf(i));

        Double aDouble = new Double(12.3);
        System.out.println(String.valueOf(aDouble));

        //String类型--->基本数据类型、包装类

//        调用包装类的方法 例如 Integer.parseInt(String类型变量)
        String string2 = "123";
        System.out.println(Integer.parseInt(string2) + 3);



    }

}