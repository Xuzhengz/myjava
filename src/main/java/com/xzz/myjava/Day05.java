package com.xzz.myjava;

import java.util.Scanner;

/**
 * @author 徐正洲
 * @date 2022/4/13-9:54
 */
public class Day05 {
    public static void main(String[] args) {
        /**
         *while 循环结构
         * 初始化条件
         * while(循环条件){
         * 循环体
         * 迭代条件
         * }
         *说明： 写while循环千万不能丢迭代条件，丢了导致死循环
         * 1)for和while可以相互转换。
         * 2）for与while 初始化条件作用域不同
         *
         * do-while循环的使用
         * 初始化条件
         *do{
         * 循环体
         * 迭代条件
         * }
         * while(循环条件);
         *至少执行一次循环体
         *使用for和while更多
         *不在循环条件部分限制次数的结构 for(;;)、while(true)
         * 结束循环的方式：
         * 循环条件部分返回为false
         * break
         */

//        int i = 1;
/*        while (i <=100){
            if (i%2==0){
                System.out.println(i);
            }
            i++;
        }*/


/*
        do {
            if (i % 2==0){
                System.out.println(i);
            }
            i++;
        }   while (i <=100);
*/

        Scanner scanner = new Scanner(System.in);
//        默认定义一个Boolean true
/*        int zCount=0;
        int fCount=0;
        while (true){   //等于  for( ; ;)
            System.out.println("请输入一个整数");
            int i = scanner.nextInt();
//            判断正负情况
            if (i >0){
                zCount++;
            }else if (i < 0){
                fCount++;
            }else{
                break;
            }
        }
        System.out.println("输入的正数个数为："  + zCount);
        System.out.println("输入的负数个数为："  + fCount);*/


//        嵌套循环的使用
//        1、将一个循环结构A 声明在另一个循环结构B的循环体中，就构成了嵌套循环
//        2、外层循环、内层循环
//        3、内层循环结构遍历一遍、只相当于外层循环循环体执行了一次
//        4、外层循环控制行数、内存循环控制列数

/*        int i, j;
        for (i = 1; i <= 5; i++) {  //控制行数
            for (j = 1; j <= 5 - i; j++) { //控制列数
                System.out.print("*");
            }
            System.out.println();
        }*/

//        九九乘法表
        int a,b;
        for (a=1;a<=9;a++){
            for (b=1;b<=a;b++){
                System.out.print(a + "*" + b + "=" + (a*b) + " ");
            }
            System.out.println();
        }



    }
}