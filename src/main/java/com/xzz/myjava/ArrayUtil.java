package com.xzz.myjava;


import java.util.Arrays;

/**
 * @author 徐正洲
 * @date 2022/4/28-16:58
 * <p>
 * 自定义数组的工具类
 */
public class ArrayUtil {
    public static void main(String[] args) {
        ArrayUtil arrayUtil = new ArrayUtil();
        int[] arr = new int[]{1, 2, 3, 5, 4};
        System.out.println("最大值为：" + arrayUtil.getMax(arr));
        System.out.println("最小值为：" + arrayUtil.getMin(arr));
        System.out.println("总和为：" + arrayUtil.getSum(arr));
        System.out.println("平均值：" + arrayUtil.getAvg(arr));
        System.out.println(arrayUtil.getIndex(arr,5));
        arrayUtil.copy(arr);
        arrayUtil.reverse(arr);
        System.out.println();
        arrayUtil.sort(arr);


    }

    //    最大值
    public int getMax(int[] arr) {
        int maxSum = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (maxSum < arr[i]) {
                maxSum = arr[i];
            }
        }
        return maxSum;
    }

    //    最小值
    public int getMin(int[] arr) {
        int minSum = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (minSum > arr[i]) {
                minSum = arr[i];
            }
        }

        return minSum;
    }

    //    总和
    public int getSum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    //    平均值
    public int getAvg(int[] arr) {
        int avg;
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        avg = sum / arr.length;
        return avg;
    }

    //    反转
    public void reverse(int[] arr) {
        for (int i=0;i<arr.length;i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = temp;
            System.out.print(arr[i] + " ");
        }
    }

    //    复制
    public int[] copy(int[] arr) {
        int[] arrCopys = new int[arr.length];
        for (int i=0;i<arrCopys.length;i++){
            arrCopys[i] =arr[i];
        }
        return arrCopys;
    }

    //    排序
    public void sort(int[] arr) {
//        冒泡排序
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        for (int i =0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }

    //    遍历
    public void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    //    查找指定元素
    public int getIndex(int[] arr, int dest) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == dest) {
                System.out.println("查找的元素下标为：" + i);
            }
        }
        return 0;
    }

}
