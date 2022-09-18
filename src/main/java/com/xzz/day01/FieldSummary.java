package com.xzz.day01;

/**
 * @author 徐正洲
 * @date 2022/5/1-21:05
 * 总结：属性赋值的先后顺序
 *
 * (一次)
 * 1、默认初始化值
 * 2、显示初始化
 * 3、构造器中赋值初始化
 *
 *
 * 4、通过对象调用方法赋值（反复执行）
 *
 * 以上赋值的先后顺序
 * 1、2、3、4
 */
public class FieldSummary {
    public static void main(String[] args) {
        Field field = new Field();
        System.out.println(field.getAge());

        Field field1 = new Field(2);
        field1.setAge(3);
        System.out.println(field1.getAge());
    }


    static class Field{
        private String name;
        private int age =1;

        public Field(){

        }
        public Field(int age) {
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }
    }
}