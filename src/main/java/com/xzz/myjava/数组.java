package com.xzz.myjava;


import java.util.Arrays;

/**
 * @author 徐正洲
 * @date 2022/4/21-18:01
 * 1、数组：是多个相同类型数据按一定顺序排列的集合，并使用一个名字命名，并通过编号的方式对这些数据进行统一管理。
 * 2、数据概念： 1）数组名 2）索引 3）元素 4）数组的长度
 * 3、数组的概述：
 * 1）数组本身是引用数据类型，而数组中的元素可以是任何数据类型，包括基本数据类型和引用数据类型。
 * 2）在内存中开辟一整块连续的空间，
 * 3）数组的长度一旦确定，就不能修改。
 * 4、数组的元素使用：数组元素下标从0开始；长度为n的数组合法下标取值范围: 0 —>n-1；
 * 5、数组元素的默认初始化值
 * 1）整数元素：默认初始化值是0
 * 2）浮点元素：默认初始化值是0.0
 * 3）char元素：默认初始化值是0 而非 '0'
 * 4）布尔元素：默认是false
 * 5)引用数据类型：null
 * 一维数组的使用：
 * 1）一维数组的声明和初始化
 * 2）如何调用数组的指定位置的元素
 * 3）如何获取数组的长度
 * 4）如何遍历数组
 * 5）数据元素的默认初始化值
 * 6）数组的内存解析--简化结构
 * 竖：栈（stack）：存放局部变量
 * 横：1、堆（heap）：存放 new出来的结构：对象、数组    2、方法区：常量池(十六进制 0x) 静态域
 * 多维数组的使用：
 * 元素是 数组就是二维数组
 * 1）二维数组的声明和初始化
 * 2）如何调用数组的指定位置的元素
 * 3）如何获取数组的长度
 * 4）如何遍历数组
 * 5）数据元素的默认初始化值
 * 6）数组的内存解析--简化结构
 */
public class 数组 {
    public static void main(String[] args) {
//        1）一维数组使用：初始化
//        静态初始化：定义数组的同时，赋值
//        int[] num = new int[]{1,2,3,4,5,6,7};
//        System.out.println(num.length);

//        String[] strings = {"xuzheng", "haha"};

//        动态初始化：定义数组，和赋值操作分开
//        int[] ints = new int[5];
//        ints[0] =1;
//        ints[1] =1;
//        ints[2] =1;
//        ints[3] =1;
//        ints[4] =1;
//        ints[5] =1;        不然超出数组取值范围
//        for (int anInt : ints) {
//            System.out.println(anInt);
//        }


//        数组元素的默认初始值
//        int[] ints = new int[3];
//        for (int anInt : ints) {
//            System.out.println(anInt);
//        }

//        char[] chars = new char[4];
//        for (int c =0; c < chars.length; c++) {
//            System.out.println(chars[c]);
//        }
//
//        boolean[] booleans = new boolean[4];
//        System.out.println(booleans[1]);

//        String[] strings = new String[5];
//        System.out.println(strings[0]);

//        int[] ints = new int[]{1,2,3};
//        String[] strings = new String[2];
//        strings[1] ="徐正洲";
//        strings = new String[2];
//        System.out.println(strings[1]);

//        练习一
//        1）使用scanner 读取学生个数
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("请输入学生个数：");
//        int studentNum = scanner.nextInt();
////        2）创建数组存储学生创建，动态初始化
//        int[] ints = new int[studentNum];
//        for (int i = 0; i < ints.length; i++) {
////        3）给学生成绩赋值
//            System.out.println("请输入成绩：");
//            int score = scanner.nextInt();
//            ints[i] += score;
//        }
////        4）获取最高分
//        int maxScore = 0;
//        for (int i = 0; i < ints.length; i++) {
//            if (maxScore < ints[i]) {
//                maxScore = ints[i];
//            }
//        }
//
////        5）给出成绩等级和成绩
//        char level;
//        for (int i = 0; i < ints.length; i++) {
//            if (maxScore - ints[i] <= 10) {
//                level = 'A';
//            } else if (maxScore - ints[i] <= 20) {
//                level = 'B';
//            } else if (maxScore - ints[i] <= 30) {
//                level = 'C';
//            } else {
//                level = 'D';
//            }
//
//            System.out.println("student" + i +"\t"+ "score is" + "\t" + maxScore + "grade is " + level);
//
//        }
//        二维数组的声明
//        静态初始化
//        int[][] twoDemision = {{1, 2, 3}, {4, 5, 6}};
//        动态初始化
//        String[][] strings = new String[3][2];
//        调用数组指定的元素
        //   System.out.println(strings[1]);  // 调用外层的时候是地址值   里层为初始化值

//        获取数组的长度
        //  System.out.println(twoDemision.length); // 外层长度 2
        //   System.out.println(twoDemision[0].length); //内层长度元素1 3

//        如何遍历二维数组
//        for (int i = 0; i < twoDemision.length;i++ ){
//            for (int j =0; j < twoDemision[i].length;j++){
//                System.out.print(twoDemision[i][j]);
//            }
//            System.out.println();
//        }


//        数组的内存解析


/*        int[][] ints = new int[3][];    // 内层数组没有赋值 属于引用数据类型 默认值null
        System.out.println(ints[1]);
        int[][] arr = new int[3][];     // 内层数组没有赋值 属于引用数据类型 默认值null
        arr[1] = new int[]{1,2,3};      // 内层第二数组的值为 1 2 3  其余为null
        arr[2] = new int[3];            // 内层第三数组的值 为int数组 默认初始化为 0
        System.out.println(arr[0]);     // 引用数据类型 默认为null
        System.out.println(arr[0][0]);  // 第一层数组为null  内层没赋值 找不到 空指针*/

//        二维数组练习
//        求和
//        int[][] arr = new int[][]{{3,5,8},{12,9},{7,0,6,4}};
//        int sum =0;
//        for (int i =0; i< arr.length; i++){
//            for (int j =0; j< arr[i].length;j++) {
//                sum += arr[i][j];
//            }
//        }
//        System.out.println(sum);

//        使用二维数组打印一个10行杨辉三角

/*//        1）声明二维数组并初始化（动态）
        int[][] arrs = new int[10][];
//        2）数组元素赋值
        for (int i = 0; i < arrs.length; i++) {
            arrs[i] = new int[i + 1];

//            2.1）给首末元素赋值
            arrs[i][0] = 1;
            arrs[i][i] = 1;

//            2.2）给非首末元素赋值
            if (i>1){
                for (int j =1; j< arrs[i].length -1;j++){
                    arrs[i][j] = arrs[i-1][j-1] + arrs[i-1][j];
                }
            }
        }


//         3）遍历二维数组
        for (int a = 0; a < args.length; a++) {
            for (int j = 0; j < arrs[a].length; j++) {
                System.out.print(arrs[a][j] + " ");
            }
            System.out.println();
        }*/


//        1）声明二维数组并初始化（动态）
//        int[][] ints = new int[10][];
//
//
////        2）数组元素赋值
//        for (int i =0; i< ints.length; i++){
//            ints[i] = new int[i+1];
//            ints[i][0] = 1;
//            ints[i][i] = 1;
//            if (i>1){
//                for (int j =1; j< ints[i].length -1;j++){
//                    ints[i][j] = ints[i-1][j-1] + ints[i-1][j];
//                }
//            }
////            3）遍历二维数组
//            for (int j=0;j<ints[i].length;j++){
//                System.out.print(ints[i][j] + " ");
//            }
//            System.out.println();
//        }


//        复习
//        1）创建一个二维数组
/*        int[][] yangHui = new int[10][];
//        2）给二维数组赋值
        for(int i =0;i<yangHui.length;i++){
            yangHui[i] = new int[i +1];
//            2.1)每一行的第一个元素和最后一个元素都是 1
            yangHui[i][0] = 1;
            yangHui[i][i] =1;
            if (i>1){
                for (int j =1; j< yangHui[i].length -1;j++){
                    yangHui[i][j] = yangHui[i-1][j-1] + yangHui[i-1][j];
                }
            }



//            3)打印杨辉三角数组
            for (int j=0;j<yangHui[i].length;j++){
                System.out.print(yangHui[i][j] + " ");
            }
            System.out.println();

        }*/


/**
 *       3.4 数组中涉及的常见算法
 * 1. 数组元素的赋值(杨辉三角、回形数等)
 * 2. 求数值型数组中元素的最大值、最小值、平均数、总和等
 * 3. 数组的复制、反转、查找(线性查找、二分法查找)
 * 4. 数组元素的排序算法
 *
 */

//        2. 求数值型数组中元素的最大值、最小值、平均数、总和等
//        1）定义一个数组长度为10的随机两位数 例如：取值范围为[a,b]  (int) (Math.random() * (b - a + 1) + 10);
//        int[] ints = new int[10];
//        for (int i = 0; i < ints.length; i++) {
//            ints[i] = (int) (Math.random() * (99 - 10 + 1) + 10);
//        }
//
//
////        2）遍历数组取出数据
//
//
////        最大值
//        int maxNum = ints[0];
//        for (int i = 1; i < ints.length; i++) {
//
////            System.out.print(ints[i] +"\t");
//
//            if (maxNum < ints[i]) {
//                maxNum = ints[i];
//            }
//
//
//        }
//        System.out.println("最大值为：" + maxNum);
//
//
////        最小值
//        int minNum = ints[0];
//        for (int i = 1; i < ints.length; i++) {
//
//            if (minNum > ints[i]) {
//                maxNum = ints[i];
//            }
//
//        }
//        System.out.println("最小值为：" + maxNum);
//
////        平均值
//
//        int avgNum = 0;
//        for (int i = 1; i < ints.length; i++) {
//
//            avgNum += ints[i];
//        }
//        System.out.println("平均值：" + avgNum / ints.length);
//
////        总和
//        int sum = 0;
//        for (int i = 1; i < ints.length; i++) {
//
//            sum += ints[i];
//        }
//        System.out.println("平均值：" + sum);


//        3. 数组的复制、反转、查找(线性查找、二分法查找)

        //复制
        String[] ziMu = new String[]{"A", "B", "C", "D", "E", "F"};
        ;
//
//        String[] ziMuCopy = new String[ziMu.length];
//
//        for (int i =0;i<ziMu.length;i++){
//            ziMuCopy[i] =ziMu[i];
//            System.out.print(ziMuCopy[i] + "\t");
//        }
//        System.out.println();
//
////        反转
//        for (int i =0,j = ziMu.length -1; i <j;i++,j--){
//            String temp = ziMu[i];
//            ziMu[i] = ziMu[j];
//            ziMu[j] = temp;
//            System.out.print(ziMu[i] + "\t");
//        }

//        String A = "H";
//        boolean isFlag = true;
//        for (int i=0;i<ziMu.length;i++){
//            if (A.equals(ziMu[i])){
//                isFlag = false;
//                System.out.println("字母：" +A +"下标为：" +i);
//                break;
//            }
//        }
//        if (isFlag){
//            System.out.println("很遗憾没有找到！！！");
//        }

//        二分法查找 按有次序的大小排序
//        int[] ints = new int[]{-1,1,2,3,4,5,6,7,8};
//
//        int num =10;
//        int head =0;
//        int end = ints.length-1;
//        boolean isExist = true;
//        while (head <= end){
//            int middle = (head + end)/2;
//            if (num == ints[middle]){
//                System.out.println(middle);
//                isExist =false;
//                break;
//            }else if (ints[middle] > num){
//                end = middle -1;
//            }else {
//                head = middle +1;
//            }
//
//        }
//        if (isExist){
//            System.out.println("没有找到元素");
//        }


//        排序算法
//        1）冒泡排序：相邻元素相互比较
        int[] ints = new int[]{0, -1, 3, 2, 5, 4, 6, 7, 8, 9, 10};
        int[] ints2 = new int[]{1, 2, 3, 5, 4, 6, 7, 8, 9, 10};
//        for (int i =0; i<ints.length -1;i++){            //遍历出数组元素
//            for (int j =0; j < ints.length -1 -i;j++){   //每次需要比较的次数为 len -1 -i
//                if (ints[j] > ints[j +1]){
//                    int temp = ints[j];
//                    ints[j] = ints[j +1];
//                    ints[j +1] =temp;
//                    System.out.println(temp);
//                }
//
//            }

//        2）arrarys 工具类的使用

/*        int binarySearch = Arrays.binarySearch(ints, 11);
        if (binarySearch < 0){
            System.out.println("索引越界！！！");
        }else {
            System.out.println("下标为：" + binarySearch);
        }

        boolean equals = Arrays.equals(ints, ints2);   // 需要对比的数组里面的元素值和下标都相同 才为true
        System.out.println(equals);

        Arrays.sort(ints);   // 排序 从小到大
        for (int i =0; i < ints.length; i++){
            System.out.print(ints[i] + " ");
        }
        System.out.println();

        String arr = Arrays.toString(ints);
        System.out.println(arr);*/


//        练习
//        使用冒泡排序，实现如下的数组从小到大排序
        int[] arrs = new int[]{34, 5, 22, -98, 6, -76, 0, -3};

//        遍历数组元素
//        每次比较次数 len -i -1
//        for (int i = 0; i < arrs.length - 1; i++) {
//
//            for (int j = 0; j < arrs.length - 1 - i; j++) {
//                if (arrs[j] > arrs[j + 1]) {
//                    int temp = arrs[j];
//                    arrs[j] = arrs[j + 1];
//                    arrs[j + 1] = temp;
//                    System.out.print(arrs[i]);
//                }
//            }
//        }

        Arrays.sort(arrs);
        for (int i =0;i<arrs.length;i++){
            System.out.print(arrs[i] +" ");
        }




    }

}
