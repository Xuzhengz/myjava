package com.xzz.myjava;


/**
 * @author 徐正洲
 * @create 2022-03-30 14:32
 */
public class Day01 {
    //变量
    static class VariableTest{
        public static void main(String[] args) {
//            变量定义
            int myAge =21;
//            变量使用
//            System.out.println(myAge);

//            变量的声明
            int myNumber;
//            变量赋值
            myNumber = 2018121322;
//            System.out.println(myNumber);

//            在作用域之外,无法使用
//            System.out.println(myclass);

//            引用方法
            method();
        }
    }
    public static void method(){
        int myClass = 3;
        System.out.println(myClass);

//        同一个作用域不能重复变量
//        String myClass;
    }
    //    数据类型
    static class DataType{
        public static void main(String[] args) {
//            byte = 1字节 8bit 范围 -128-127
            byte b1;
            b1 =127;
//            System.out.println(b1);
//            声明long类型的变量 必须以L或l结尾
            long l1=213123L;
//            System.out.println(l1);
//            开发中常用int
            int i1=166;
//            System.out.println(i1);
//            浮点型 带小数点
            double d1=123.3;
//            System.out.println(d1);
//            定义float变量时，末尾要f或F结尾
            float f1= 12.3F;
//            System.out.println(f1);

//            char代表两个字节 只能赋值一个字符
            char c1 ='a';
            char c2 ='\t';
            char c3 ='b';
//            System.out.println("hello" + c2 + "world");

//            \0u 使用unicode值表示字符型常量
            char c4 ='\u0043';
//            System.out.println(c4);

//            boolean --- true 和 false  常常在条件判断、循环结构中使用
            boolean bb1 = true;
//            System.out.println(bb1);
            boolean isMarried = true;
            if (isMarried){
//                  \为转义符
                System.out.println("您已经\\n结婚");
            }else {
                System.out.println("未结婚");
            }

        }
    }
/*         数据类型转换
前提：
Boolean只有true、false不能做数据类型转换，其它数据类型可以进行。
1）自动类型转换:
容量小与容量大做运算时，结果自动提升为容量大的数据类型，容量大小表示数的范围和大小，不是内存。
特别： 当byte、char、short三种类型做运算时（包括同类型），结果必须为int类型才能接住。
byte-->short-->int-->long-->float-->double
2）强制类型转换:自动类型提升运算的逆运算
1、有小数的时候可能会造精度损失
2、强制转换变量前面加强转符号（数据类型）
3、当long类型结尾没有加l或者L时会自动转换成int，但是如果超出int范围就会报错
4、float数据类型结尾强制转换必须加F或者f。
5、整型常量，默认类型为int类型、浮点常量，默认类型为double类型。
6、String 强转不了为int类型、
*/
/*String 类型变量的使用
* 1、String 属于引用数据类型，翻译为：字符串。
* 2、声明String类型变量时，使用 ” “。
* 3、String可以和八种基本数据类型变量做运算，且运算只能是连接运算。
* 4、运算的结果是String类型。
* 5、+号前后为整型类型则做加法运算，反之其中一个为字符类型则做拼接。
* */
    static class DataTypeTransfer{
    public static void main(String[] args) {
/*        byte b1 =2;
        int i1 = 12;*/
//        编译不通过，int转不了byte
//        byte b2 =  b1 + i1;

//        int itwo = b1 + i1;
//        long longtwo = b1 + i1;
//        float f2 = b1 + i1;
/*        char c1 = 'a';
        int i3 =12;
        int i4 = c1 + i3;
        short s4 =10;
//        char c2 = c1 + s4;  short 与 char 做运算 需要int类型接
        byte b3 =10;
//        byte c3 = c1 + b3;    编译不通过 需要用int类型
        System.out.println(i4);*/

//        强制类型转换
/*        double d1 =12.6;
        int i1 = (int)d1;

        int i2 = 128;
        byte b1 = (byte)i2;
        System.out.println(b1);   // -128*/

//        long l =12315423423423523l;
//
//        float f2 =21.3F;    //没加f自动识别为double，大的往小的转就报错。
//        int i3 =(int)f2;
//        int i1 =10;
//        String numStr = "学号";
//        boolean b1 =true;
//        System.out.println(numStr +"：" + i1 + b1);


//        练习1
/*        char c = 'a';//97  A:65
        int num = 10;
        String str= "hello";
        System.out.println(c + num + str);
        System.out.println(c + str + num);
        System.out.println(c + (num + str));
        System.out.println((c + num) + str);
        System.out.println(str + num +c);*/

//        练习2
//        控制台打印出 * *效果
//        String str = "*";
//        System.out.println(str + "\t" + str);

//        String str1 =4;  no
//        String str2 = 3.5f + "";  yes
//        System.out.println(str2);
/*        System.out.println(3 +4 + "Hello!");  yes
        System.out.println("Hello!" + 3 +4);  yes
        System.out.println('a' + 1 + "Hello!"); yes
        System.out.println("Hello" + 'a' + 1); yes*/
//        short s =5;
//        s = s -2;
//        char c ='a';
//        int i = 5;
//        float d = 315F;
//        double result = c + i +d;

        int num1 = 0B110;
        int num2 = 110;
        int num3 = 0127;
        int num4 = 0X110A;
        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);
        System.out.println(num4);


    }
}
}
