package com.xzz.day21;

import org.junit.Test;

/**
 * @author 徐正洲
 * @date 2022/5/28-19:19
 */
public class StringExer {
    //    1）将字符串中指定字符进行反转
    public String reverse1(String str, int Start, int End) {
//        方式一：转成char数组
        if (str != null) {
            char[] chars = str.toCharArray();
            for (int x = Start, y = End; x < y; x++, y--) {
                char temp = chars[x];
                chars[x] = chars[y];
                chars[y] = temp;
            }
            return new String(chars);
        }
        return null;
    }

    public String reverse2(String str, int Start, int End) {
//        方式二：使用String拼接
        if (str != null) {
            String reverseStr = str.substring(0, Start);

            for (int i = End; i >= Start; i--) {
                reverseStr += str.charAt(i);
            }

            reverseStr += str.substring(End + 1);

            return reverseStr;
        }
        return null;
    }

    public String reverse3(String str, int Start, int End) {
//        方式三：使用StringBuffer拼接
        StringBuffer stringBuffer = new StringBuffer(str.length());
        if (str != null) {
            stringBuffer.append(str.substring(0, Start));

            for (int i = End; i >= Start; i--) {
                stringBuffer.append(str.charAt(i));
            }

            stringBuffer.append(str.substring(End + 1));

            return new String(stringBuffer);
        }
        return null;
    }

    @Test
    public void test() {
        String s1 = "abcdefg";
        String reverse = reverse3(s1, 2, 5);
        System.out.println(reverse);
    }
}