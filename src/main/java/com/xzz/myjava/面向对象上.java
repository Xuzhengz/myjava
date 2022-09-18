package com.xzz.myjava;


import java.lang.reflect.Method;
import java.util.jar.JarEntry;

/**
 * @author 徐正洲
 * @date 2022/4/25-19:52
 */
public class 面向对象上 {
    public static void main(String[] args) {
        /** 一、java面向对象学习的三条主线（4-6）
         * 1、java类以及类的成员（属性、方法、构造器、代码块、内部类）
         * 2、面向对象的三大特征：封装性、继承性、多态性、（抽象性）
         * 3、其它关键字：this、super、static、final、abstract、interface、package、import
         *
         * "大处着眼，小处着手"
         *
         * 面向过程：以函数位最小单位，考虑怎么做。
         * 面向对象：以类/对象位最小单位，考虑谁来做。
         * 创建类的对象 = 类的实例化 = 实例化类
         *
         * 二、类和对象的使用（面向对象思想落地的实现）
         * 1、创建类，设计类的成员
         * 2、创建类的对象
         * 3、调用类的成员（属性，方法）
         *
         * 三、如果创建一个类的多个对象，则每个对象都独立的拥有一套类的属性
         * 意味着：如果我们修改一个对象的属性A。则不影响另外一个对象属性A的值
         *
         * 四、对象的内存解析
         *
         *实例对象存放在栈 stack 中、 属性存放在堆 heap中
         *
         * 五、类中属性的使用
         * 属性（成员变量） vs 局部变量
         * 1、相同点；
         * 1）定义变量的格式、数据类型 变量名 = 变量值;
         * 2）先声明、后使用
         * 3）变量都有其对应的作用域、
         *
         * 2、不同点：
         * 1）在类中声明的位置不同
         * 2）属性：直接定义在类的{}中 （成员变量）
         * 3）局部变量：声明在方法内、方法形参、代码块内、构造器形参、构造器内部的变量
         * 4）权限修饰符的不同
         * 属性：可以在声明属性时、指明其权限、使用权限修饰符
         * 常用的权限修饰符：private、public、缺省、protected 这些修饰符不可用于 局部变量
         * 目前、声明属性的时候、默认使用缺省就行。
         *
         * 5）默认初始化值的情况
         * 属性：类的属性、根据其类型、都有默认初始化值===一维数组的默认初始化值
         * 整型：0  浮点型：0.0 char： 0|'\u0000' 布尔型：flase 引用数据类型（类、数组、接口）：null
         *
         * 局部变量：没有默认初始化值、调用之前一定要显示赋值。 形参在调用的时候赋值即可。
         *
         * 6）在内存中加载的位置
         * 属性：加载到堆空间 （非static）
         * 局部变量：加载到栈空间
         *
         * 六、类中方法的声明和使用
         * 方法：描述类具有的功能
         *
         * 1、举例：
         * public void eat(){       // 没有返回值
         * public void sleep(int hour){       // 没有返回值
         * public String getName(){    // 有返回值
         * public String getNation(String nation){ // 有返回值
         *
         * 2、方法的声明：权限修饰符 返回值类型 方法名（形参列表）{
         *     方法体
         * }
         *
         * 3、说明：
         * 1）权限修饰符：private、public、缺省、protected
         * 2）返回值类型：有返回值 vs 没有返回值
         * 如果方法有返回值、则必须在方法声明时、指定返回值的类型、同时、方法中、需要使用return 返回
         * 通常没有返回值的方法，就不用return、但是使用的话、只能使用return 结束方法。
         *
         * return 关键字的使用
         * 1）返回方法形参的数据
         * 2）终止方法，后面不能有执行语句
         *
         *
         * "万事万物皆对象"
         * 1、在java语言范畴中，我们都将功能、结构等封装到类中、通过类的实例化、来调用
         * 2、涉及到java语言中与前端html、后端数据库交互时、前后端的结构在java层面交互时、都体现为类、对象，
         *
         * 内存解析的说明
         * 1、引用类型的变量、只可能存储两类值、null 或者 地址值
         *
         * 匿名对象的使用
         * 创建的对象没有名称
         * 匿名对象只能调用一次
         *
         */
//        构建对象1
//        Person person = new Person();

//        调用属性
//        person.name="xuzhengzhou";
//        person.age=22;
//        person.isMale=true;

//        调用方法
/*        person.eat();
        person.sleep();
        person.talk("chinese");
        System.out.println(person.name);*/

//        构建对象2
/*        Person person2 = new Person();
        System.out.println(person2.name);
        System.out.println(person2.sex);*/

//        构建对象3
/*        Person person3 = new Person();
        // 将person变量保存的对象地址值赋给person3，导致person3和person只向堆空间同一个实体
        person3 = person;
        System.out.println(person3.name);

        person3.age =10;
        System.out.println(person3.age);*/

//        构造对象4
//        Person person4 = new Person();
//        System.out.println(person4.name);  //null
//        System.out.println(person4.isMale); //false

//        customer customer = new customer();
//        customer.eat();
//        System.out.println(customer.getName());  // 默认null 初始化值

/*        Person person = new Person();
        person.name = "xuzz";
        person.age = 22;
        person.sex = 1;
        person.study();
        person.showAge();
        System.out.println(person.addAge(2));

        Person person1 = new Person();
        System.out.println(person1.age);*/

//        circle circle = new circle();
//        circle.r=2.3;
//        circle.area();

/*        zArea zArea = new zArea();
        System.out.println("面积为：" + zArea.method(11,8));*/
//
//        Student[] students = new Student[20]; //自定义的类也可以作为数组
//        for (int i = 0; i < 20; i++) {
//            students[i] = new Student();
//            //给属性赋值
////            学号
//            students[i].number = i + 1;
////            班级
//            students[i].state = (int) (Math.random() * (6 - 1 + 1) + 1);
//            //成绩
//            students[i].score = (int) (Math.random() * (100 - 0 + 1));
//
//        }

//        for (int i = 0; i < students.length; i++) {
//            System.out.println(students[i].info());
//        }

        //打印班级为3 的学生信息
//        for (int i = 0; i < students.length; i++) {
//            if (students[i].state == 3) {
//                System.out.println(students[i].info());
//            }
//        }
        //打印按成绩排序的学生信息
//        for (int i = 0; i < students.length - 1; i++) {
//            for (int j = 0; j < students.length - 1 - i; j++) {
//                if (students[j].score > students[j + 1].score) {
//                    //如果需要排序,交换的是数组的元素,student对象
//                    Student temp = students[j];
//                    students[j] =students[j+1];
//                    students[j+1] =temp;
//                }
//            }
//        }
//
//        for (int i = 0; i < students.length; i++) {
//                    System.out.println(students[i].info());
//        }
        phone phone = new phone();
        phone.sendEmail();
        phone.playGame();

        //匿名对象
        new phone().sendEmail();
        new phone().playGame();
        new phone().price=1999; //1999
        new phone().showPrice();



    }

    // person类
    static class Person {
        //            属性
        String name;
        int sex;
        int age;

        //            方法
        public void eat() {
            String food = "大米"; //局部变量
            System.out.println("人可以吃饭");
        }

        public void study() {
            System.out.println("studying");
        }

        public void showAge() {
            System.out.println("年龄是：" + age);
        }

        public int addAge(int i) {
            age += i;
            return age;
        }

        public void sleep() {
            System.out.println("人可以睡觉");
        }

        public void talk(String language) {    // language 形参  局部变量
            System.out.println("使用的语言：" + language);
        }
    }

    //客户类
    static class Customer {

        //属性
        String name;
        int age;
        boolean isMale;

        //方法

        public void eat() {
            System.out.println("客户吃饭");
        }

        public void sleep(int hour) {
            System.out.println("休息：" + hour + "个小时");
        }

        public String getName() {
            return name;
        }

        public String getNation(String nation) {
            String info = "国籍是：" + nation;
            return info;
        }
    }

    //圆面积
    static class Circle {
        //属性
        double r; //半径

        //方法
        public void area() {
            String areas = "面积是：" + Math.PI * r * r;
            System.out.println(areas);
        }

    }

    //矩形--方法形参
    static class ZArea {

        public int method(int m, int n) {
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.print("* ");
                }
                System.out.println();
            }
            return m * n;

        }
    }

    //    学生类
    static class Student {
        //属性
        int number;
        int state;
        int score;

        //显示学生信息

        public String info() {
            return "学号:  " + number + "  班级:  " + state + "  成绩:  " + score;
        }
    }

    //手机类
    static class phone {
        //属性
        double price;

        //        方法
        public void sendEmail() {
            System.out.println("发送邮件");
        }

        public void playGame() {
            System.out.println("玩游戏");
        }

        public void showPrice()
        {
            System.out.println("手机价格为：" + price);
        }
    }




}