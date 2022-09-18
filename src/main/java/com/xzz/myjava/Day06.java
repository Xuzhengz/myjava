package com.xzz.myjava;

import java.awt.*;
import java.util.zip.CheckedOutputStream;

/**
 * @author 徐正洲
 * @date 2022/4/14-18:08
 */
public class Day06 {
    public static void main(String[] args) {
//        100以内所有质数输出
//        质数：素数，只能被1和本身整除的自然数,2是最小的素数,从这个数到n-1都不能被本身整除
/*        boolean isFlag = true;

//        获取当前时间距离1970-01-01 00：00：00的时间戳
        long start = System.currentTimeMillis();

        for (int i = 2; i <= 10000; i++) { //遍历100以内自然数
//            优化2 对本身是质数的自然数有效
            for (int j = 2; j < Math.sqrt(i); j++) {

                if (i % j == 0) {
                    isFlag = false;
                    // break; //优化一 只对本身非质数的自然数有效的
                }

            }
            if (isFlag == true) {
                System.out.println(i);
            }
            isFlag = true;
        }
        long end = System.currentTimeMillis();
        System.out.println("所花费的时间：" + (end - start));*/

        /**
        *特殊关键字使用
         * break  continue
         *使用范围: break 使用在 switch 和循环结构中.continue 使用在循环结构中
         *相同:关键字后面不能加执行语句
         *
         *循环结构中的作用: break 结束当前循环  continue 结束当此循环
        *
        */

/*        for (int i=1;i<=10;i++){
            if (i %4==0){
//                break;
                continue;
            }
            System.out.println(i);
        }*/

//     跳出整个循环 需要就加个标签
/*        label:for (int a =1;a <=4; a++){
            for (int j =1; j <=10; j++){
                if (j %4==0){
                    //break;   // 默认跳出包裹此关键字最近一层循环

//                    continue;
//                    break label; 跳出整个循环
                    continue label;

                }
                System.out.print(j);
            }
            System.out.println();
        }*/

//        获取当前时间距离1970-01-01 00：00：00的时间戳
/*        long start = System.currentTimeMillis();
        int count =0;

        Label:for (int i = 2; i <= 10000; i++) { //遍历100以内自然数
//            优化2 对本身是质数的自然数有效
            for (int j = 2; j < Math.sqrt(i); j++) {

                if (i % j == 0) {
                    continue Label;
                }
            }
            count++;
        }
        System.out.println(count);
        long end = System.currentTimeMillis();
        System.out.println("所花费的时间：" + (end - start));*/












    }
}