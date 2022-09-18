package com.xzz.day07;

import java.util.Scanner;
import java.util.Vector;


/**
 * @author 徐正洲
 * @date 2022/5/9-20:22
 * <p>
 * Vector：不需要定义数组长度
 */
public class StudentScore {
    public static void main(String[] args) {
//        1、实例化Scanner
        Scanner scanner = new Scanner(System.in);

//        2、创建Vector对象 相当于数组
        Vector vector = new Vector();

//        3、通过for(;;)方法给Vector添加数据元素
        int max = 0;
        for (; ; ) {
            System.out.print("请输入学生成绩(负数时退出循环):");
            int number = scanner.nextInt();
            //        3.2当输入是负数的时候，退出循环
            if (number < 0) {
                break;
            }
            if (number > 100) {
                System.out.println("非法成绩");
            }
            //        3.1 添加操作  addElement(Object object)
            vector.addElement(number);
            //        4.获取学生成绩最大值
            if (max < number) {
                max += number;
            }
        }

        // 变量vector数组，得到所有学生的成绩，并于max比较，得到每个学生的成绩
        for (int i = 0; i < vector.size(); i++) {
            char level;
            Object o = vector.elementAt(i);

            Integer inScore = (Integer) o;

            int score = inScore.intValue();

            if (max - score <= 10 && max - score >0) {
                level = 'A';
            } else if (max - score <= 20) {
                level = 'B';
            } else if (max - score <= 30) {
                level = 'C';
            } else {
                level = 'D';
            }
            System.out.println("学生：" + i + "的等级为：" + level);


        }


    }
}