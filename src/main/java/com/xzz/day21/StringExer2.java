package com.xzz.day21;

import org.junit.Test;

/**
 * @author 徐正洲
 * @date 2022/5/28-19:39
 */
public class StringExer2 {
//    获取字符串中在另一个字符串出现的次数

    public int getCount(String mainStr, String subStr) {
        int mainStrLen = mainStr.length();
        int subStrLen = subStr.length();
        int count = 0;
        int index = 0;

        if (mainStrLen > subStrLen) {
            //方式一
//            while ((index = mainStr.indexOf(subStr)) != -1) {
//                count++;
//                mainStr = mainStr.substring(index + subStr.length());
//            }
            while ((index = mainStr.indexOf(subStr, index)) != -1) {
                count++;
                index += subStrLen;

            }

            return count;
        }
        return count;
    }

    @Test
    public void test() {
        String mainStr = "ab123ab";
        String subStr = "ab";


        System.out.println(getCount(mainStr, subStr));
    }
}