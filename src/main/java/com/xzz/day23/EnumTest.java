package com.xzz.day23;

import org.junit.Test;

/**
 * @author 徐正洲
 * @date 2022/5/30-17:19
 * <p>
 * 枚举类：
 * 1）类的对象有限个。
 * 2）当需要定义一组常量时，强烈建议使用枚举类
 * 3）如果枚举类中只有一个对象，则可以作为单例模式的实现方式
 *
 * 常用方法：
 * values方法
 * valueOf方法
 * toString方法
 *
 * 使用enum关键字实现接口
 */
public class EnumTest {
    //    1、private、final修饰属性
    private final String seasonName;

    //    2、私有化构造器
    private EnumTest(String seasonName) {
        this.seasonName = seasonName;
    }

    //    3、提供有限个static final的公开对象
    public static final EnumTest SPRING = new EnumTest("春天");
    public static final EnumTest SUMMER = new EnumTest("夏天");
    public static final EnumTest AUTUMN = new EnumTest("秋天");
    public static final EnumTest WINTER = new EnumTest("冬天");

    //    4、获取属性
    public String getSeasonName() {
        return seasonName;
    }

    //    5、重写toString方法
    @Override
    public String toString() {
        return "EnumTest{" +
                "seasonName='" + seasonName + '\'' +
                '}';
    }
}

interface Info{
    void show();
}

//enum
//1）多个对象之间用逗号
//2）toString方法返回对象的名字
//3）默认继承Enum类
enum MyEnum implements Info {
    //    3、提供有限个static final的公开对象
    SPRING("春天"){
        @Override
        public void show() {
            System.out.println("春天在哪里");
        }
    },
    SUMMER("夏天"){
        @Override
        public void show() {
            System.out.println("夏天在哪里");
        }
    },
    AUTUMN("秋天"){
        @Override
        public void show() {
            System.out.println("秋天在哪里");
        }
    },
    WINTER("冬天"){
        @Override
        public void show() {
            System.out.println("冬天在哪里");
        }
    };
    //    1、private、final修饰属性
    private final String seasonName;

    //    2、私有化构造器
    private MyEnum(String seasonName) {
        this.seasonName = seasonName;
    }


    //    4、获取属性
    public String getSeasonName() {
        return seasonName;
    }

    @Override
    public void show() {
        System.out.println("季节");
    }

//    //    5、重写toString方法
//    @Override
//    public String toString() {
//        return "MyEnum{" +
//                "seasonName='" + seasonName + '\'' +
//                '}';
//    }
}
class MyTest530{
    public static void main(String[] args) {
        System.out.println(MyEnum.SPRING.toString());
        //返回枚举类的对象
        MyEnum[] values = MyEnum.values();
        for (int i = 0; i < values.length; i++) {
            System.out.println(values[i]);
        }
        //返回枚举类中对象名为objName的对象、如果没找到，报错。
        MyEnum spring = MyEnum.valueOf("SPRING");
        System.out.println(spring);
        //让枚举类各自实现对象的自定义方法
        MyEnum.SPRING.show();


    }
}