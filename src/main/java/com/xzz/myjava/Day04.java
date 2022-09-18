package com.xzz.myjava;

import java.util.Scanner;

/**
 * @author 徐正洲
 * @date 2022/4/8-9:14
 * <p>
 * <p>
 * 流程控制
 * 1）顺序结构：没有任何判断
 * 2）分支结构 if-else、 switch-case
 * 3）循环结构 for、while、do...while、foreach(jdk1.5)
 */
public class Day04 {
    public static void main(String[] args) throws InterruptedException {
//        分支-if-else
//        第一种
/*        if(条件表达式){

        }*/
//        第二种 二选一
/*        if(条件表达式){

        }else{

        }*/
//        第三种 n选一
/*        if(条件表达式){

        }else if{

        }else{

        }*/

//        举例1
//        int heartBeats = 59;
/*        if (heartBeats < 60 || heartBeats >100){
            System.out.println("需要做进一步检查");
        }
        System.out.println("检查结束");*/
//        举例2
//        int age = 19;
/*        if (age <18){
            System.out.println("还在青春期");
        }else{
            System.out.println("可以娶老婆了");
        }*/
//        举例3
/*        if (age < 0){
            System.out.println("年龄不属于范围之内");
        }else if(age < 18){
            System.out.println("还在青春期");
        }else {
            System.out.println("可以娶老婆了");
        }*/

/*        int i1 =10;
        int i2 =11;
        int i3 =12;
        int max;
        if (i1 >= i2 && i1 >= i3){
            max = i1;
        }else if (i2 >= i1 && i2 >= i3){
            max = i2;
        }else {
            max = i3;
        }
        System.out.println(max);*/

/*        double d1 =11.0;
        double d2 =12.0;

        if (d1 > 10.0 && d2 < 20.0){
            System.out.println("两数之和：" + (d1+d2));
        }else {
            System.out.println("两数乘积：" + (d1*d2));
        }*/


//        1）使用Scanner，从控制器获取不同类型的变量
//        注意：需要根据相应的方法、输入指定类型的值，如果不匹配，会报异常，并且程序停止。
//        具体步骤：
//        1、导包 import java.util.Scanner;
//        2、Scanner的实例化
        Scanner scan = new Scanner(System.in);
//        3、调用相关方法，获取指定类型的变量


/*      byte b1 = scan.nextByte();
        short s1 =scan.nextShort();

        long l1 =scan.nextLong();
        float f1 =scan.nextFloat();
        double d1 =scan.nextDouble();*/
//        char c1 =scan. scan没有提供相关方法获取char
/*        boolean bl1 =scan.nextBoolean();
        String num = scan.nextLine();  //获取字符串类型*/

/*
注意：
        1）else 结构是可选的。
        2）若多个表达式之间是“互斥”（没有交集的关系），执行语句顺序没有要求，反之按照顺序进行。
        3）若多个表达式有包含关系，需要把范围小的写在上面，否则根本不执行。
        int score = scan.nextInt();
        System.out.println("成绩为：" + score);

        if (score ==100){
            System.out.println("奖励一辆BWM");
        }else if (score >80 && score <= 99){
            System.out.println("奖励一台iphone xs max");
        }else if (score >60 && score <=80 ){
            System.out.println("奖励一台ipad");
        }else{
            System.out.println("奖励一个大嘴巴子！！！");
        }*/

/*        System.out.println("请输入您的性别： （男\\女）");
        String gender = scan.next();  //男
        char genderChar = gender.charAt(0); //获取索引为0位置上的字符
        System.out.println(genderChar);*/

//        练习2
//        说明：if-else可以嵌套、
//        从控制台输入三个整数，进行排序使用（if-else） 从小到大输出
/*        System.out.println("请输入第一个整数");
        int i1 = scan.nextInt();
        System.out.println("请输入第二个整数");
        int i2 = scan.nextInt();
        System.out.println("请输入第三个整数");
        int i3 = scan.nextInt();

        if (i1 >= i2) {
            if (i3 >= i1) {
                System.out.println(i2 + "," + i1 + "," + i3);
            } else if (i3 <= i2) {
                System.out.println(i3 + "," + i2 + "," + i1);
            } else {
                System.out.println(i2 + "," + i3 + "," + i1);
            }
        } else {
            if (i3 >= i2) {
                System.out.println(i1 + "," + i2 + "," + i3);
            } else if (i3 <= i2) {
                System.out.println(i3 + "," + i1 + "," + i2);
            } else {
                System.out.println(i1 + "," + i3 + "," + i2);
            }
        }*/


//        练习3
//        int dogAge =scan.nextInt();
//        if (dogAge >=0 && dogAge <=2){
//            System.out.println("相当于人的年龄10.5倍" + dogAge *10.5);
//        }else if (dogAge > 2){
//            System.out.println("相当于人的年龄：" + (2 * 10.5 + (dogAge -2) *4) );
//        }else {
//            System.out.println("输入狗的年龄错误！！！");
//        }

//        练习4
//        随机两位数数的产生 10-99

//        double i = (int)(Math.random() * 90 + 10);
//        System.out.println(i);

//        练习5
/*        System.out.println("请输入你的身高 （cm）");
        int height = scan.nextInt();
        System.out.println("请输入你的财富 （千万）");
        double wealth = scan.nextDouble();*/
/*        方式一
        System.out.println("是不是帅哥 （true/false）");
        boolean handSome = scan.nextBoolean();

        if (height >= 180 && wealth >= 1 && handSome == true){
            System.out.println("遇到就嫁了吧");
        }else if (height >= 180 || wealth >= 1 || handSome == true){
            System.out.println("可以考虑一下");
        }else{
            System.out.println("放弃");
        }*/
//        方式二
/*        System.out.println("是不是帅哥 （是/否）");
        String isHandsome = scan.next();
        if (height >= 180 && wealth >= 1 && isHandsome.equals("是")){
            System.out.println("遇到就嫁了吧");
        }else if (height >= 180 || wealth >= 1 || isHandsome.equals("是")){
            System.out.println("可以考虑一下");
        }else{
            System.out.println("放弃");
        }*/


//        2）分支结构 switch-case
        /**
         * 1、根据switch表达式中的值，依次匹配各个case中的常量，一旦匹配成功，则进入相应的语句并执行。
         * 2、当调用完执行语句，需要加break才能不进入其它case语句中。
         * 3、当default为最后的语句时，可以不使用break终止。
         * 4、break表示一旦执行到此关键字，则跳出语句并终止。
         * 5、表达式，只能是以下数据类型： byte、short、char、int、枚举类型、string。
         * 6、case之后只能声明常量，不能声明范围。
         * 7、default 是可选的，并且位置灵活。
         * 8、如果多个case执行语句相同，可合并。
         * 9、冗余：代码重复没必要写。
         * 10、凡是可以使用switch-case结构，都可以转换为if-else，反之不成立。
         * 11、case取值不多的情况下，优先使用switch 反之，优先使用if-else。
         *
         */

/*        switch (表达式){
            case 常量1:
                break;
            case 常量2:
                break;
            default:
                break;
        }*/

 /*       int number =2;
        switch (number){
            case 0:
                System.out.println("zero");
                break;
            case 1:
                System.out.println("one");
                break;
            case 2:
                System.out.println("two");
                break;
            case 3:
                System.out.println("three");
                break;
            default:
                System.out.println("other");
                break;
        }*/

//        练习1

/*        System.out.println("请输入year");
        int year = scan.nextInt();
        System.out.println("请输入month");
        int month = scan.nextInt();
        System.out.println("请输入day");
        int day = scan.nextInt();

//        定义一个变量保存总天数
        int sumDays = 0;*/
/*        switch (month) {
            case 1:
                sumDays = day;
                break;
            case 2:
                sumDays = 31 + day;
                break;
        }
        过多的重复。
        */

//        倒序（优化）
/*        switch (month) {
            case 12:
                sumDays += 30;
            case 11:
                sumDays += 31;
            case 10:
                sumDays += 30;
            case 9:
                sumDays += 31;
            case 8:
                sumDays += 31;
            case 7:
                sumDays += 30;
            case 6:
                sumDays += 31;
            case 5:
                sumDays += 30;
            case 4:
                sumDays += 31;
            case 3:
//                sumDays +=28;
                if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
                    sumDays += 29;
                } else {
                    sumDays += 28;
                }
            case 2:
                sumDays += 31;
            case 1:
                sumDays += day;

        }
        System.out.println("总天数" + sumDays);*/

//        循环结构 for、while、do-while
        /**
         * 初始化部分
         * 循环条件部分 是boolean类型
         * 循环体部分
         * 迭代部份
         *
         *
         */

//        1）for
/*        for (1(初始化);2(循环条件);4(迭代部分)){
            3(循环体部分);
        }*/
//        int i;
/*        for (i=1; i <=500;i++){
            System.out.println("hello,world!!!" + i);
            Thread.sleep(1);
        }*/
/*        int sum = 0;

        for (i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                sum += i;
            }
        }
        System.out.println("总和：" + sum);*/

/*        for (i = 1; i <= 150; i++) {
            System.out.print(i + " ");

            if (i % 3 == 0) {
                System.out.println("foo  ");
            }
            if (i % 5 == 0) {
                System.out.println("biz  ");
            }
            if (i % 7 == 0) {
                System.out.println("baz  ");
            }
            System.out.println();
        }*/

//        复习
/*        int a =3;
        int x =100;

        switch (a){
            case 1:
                x+=5;
            break;
            case 2:
                x+=10;
                break;
            case 3:
                x+=16;
                break;
            default:
                x+=34;
             break;
        }
        System.out.println(x);*/

/*        int sum = 0;

        for (i = 0; i <= 100; i++) {
            if (i % 2 != 0) {
                sum += i;
            }
        }
        System.out.println(sum);*/

//        for循环列题
//        输入两个正整数m和n，求其最大公约数和最小公倍数
//        说明：break关键字使用
/*        System.out.println("请输入一个正整数");
        int m = scan.nextInt();
        System.out.println("请输入一个正整数");
        int n = scan.nextInt();

//        获取两个中最小值
        int min = (m <= n) ? m : n;
//        约数
        for (i = min; i >= 1; i--) {
            if (m % i == 0 && n % i == 0) {
                System.out.println("最大公约数" + i);  //最大公约数
                break;
            }
        }

        int max = (m >= n) ? m : n;
        for (i = max; i <= m * n; i++) {
            if (i % m == 0 && i % n == 0) {
                System.out.println("最小公倍数" + i); //最小公倍数
                break;
            }
        }*/





    }


}