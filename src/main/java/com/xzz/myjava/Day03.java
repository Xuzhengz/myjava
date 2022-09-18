package com.xzz.myjava;

/**
 * @author 徐正洲
 * @date 2022/4/7-20:06
 * 算术运算符
 * 赋值运算符
 * 比较运算符
 * 逻辑运算符
 * 位运算符
 * 三元运算符
 */
public class Day03 {
    public static void main(String[] args) {
//        1）算术运算符： +、-、*、/、%、++(前后)、--(前后)、+（连接）
//        除号： /
        int i1, i2, result;
        i1 = 13;
        i2 = 5;
        result = i1 / i2;
        System.out.println(result);  //2
        double result2 = (double) i1 / i2;
        System.out.println(result2);

//        取余: 结果的符号与被模数符号相同、开发中经常使用%来判断能否被除尽的情况。
        int result3 = i1 % i2;
        System.out.println(result3);

//        前 ++  自增1不会改变变量本身的数据类型，先赋值后运算
//        后 ++        先运算后赋值
        int a1 = 10;
        int b1 = ++a1;
        System.out.println(a1 + "---" + b1);
        int a2 = 10;
        int b2 = a2++;
        System.out.println(a2 + "---" + b2);


//        前 -- 自减1 先赋值后运算
//        后 -- 自减1 先运算后赋值
        int a3 = 10;
        int b3 = --a3;
        System.out.println(a3 + "---" + b3);
        int a4 = 10;
        int b4 = a4--;
        System.out.println(a4 + "---" + b4);


//        算术运算符练习题
        int ii1 = 10;
        int ii2 = 20;
        int i = ii1++;
        System.out.println("i=" + i);     //10
        System.out.println("ii1=" + ii1);  //11
        i = ++ii1;
        System.out.println("i=" + i);     //12
        System.out.println("ii1=" + ii1); //12
        i = ii2--;
        System.out.println("i=" + i);    //20
        System.out.println("ii2=" + ii2); //19
        i = --ii2;
        System.out.println("i=" + i);     //18
        System.out.println("ii2=" + ii2);  //18

//        输入一个百位整数，分别打印百位、十位、个位

        int num = 150;
        System.out.println("百位:" + num / 100 + "\t" + "十位:" + num / 10 % 10 + "\t" + "个位:" + num % 10);


//        2)赋值运算符:当"="两侧数据类型不一致时,可使用自动类型转换或使用强制类型转换原则.支持连续赋值.
//        拓展赋值运算符: +=、-=、*=、/=、%=

//        连续赋值
        int i3 = 20, i4 = 10;

        int i5 = 20;
        i5 += 2;   // i5 = i5 + 2;
        System.out.println(i5);

        short s1 = 10;
        s1 += 2;   //不会改变本身的数据类型

//        实现变量+2操作 前提： int i =10;
//        方法1：   i = i+2;
//        方法2：    i += 2;  （推荐）
//        实现变量+1操作
//        方法1：  i = i+1;
//        方法2：  i +=1;
//        方法3：  i++;   （推荐）


//        练习
        int m = 2;
        int n = 3;
        n *= m++;
        System.out.println(m);   //3
        System.out.println(n);   //6\

        int n1 = 10;
        n1 += (n1++) + (++n1); // n1 = n1 + (n1++) + (++n1)
        System.out.println(n1); //32


//        3）比较运算符：结果都是Boolean型，只有true、false。
//        ==、!=、>、<、>=、<=、instanceof
        boolean bb1 = true;
        boolean bb2 = false;

        System.out.println(bb1 == bb2);  // false
        System.out.println(bb1 = bb2);  // false

//        4）逻辑运算符：只使用于Boolean类型
//        &-逻辑与、 |-逻辑或、 !-逻辑非、 &&-短路与（只要有一个false结果就是false）、||-短路或（只要有一个true就为true）、 ^-逻辑异或（当a、b相同时取反，不同则为true）

//        区分 &、 && ： 运算结果相同，当左为true时，二者都会执行右边的运算。不同点：当左边为false时，&会执行右边运算，而&&不会。
//        开发中推荐使用 &&
        boolean bo1 = true;
        int bo2 = 10;
        if (bo1 & (bo2++ > 0)) {
            System.out.println("结果都为true");
            System.out.println(bo2);
        } else {
            System.out.println("其中或全部为false");
        }

        if (bo1 && (bo2++ > 0)) {
            System.out.println("结果都为true");
            System.out.println(bo2);
        } else {
            System.out.println("其中或全部为false");
        }

//        区分 |、|| 相同点： 二者运算结果相同、当左边为false时，二者都会执行符号右边的运算。不同点： 当符号左边是true时， || 不会执行右边的运算。
//        开发中推荐使用 ||
        boolean bo3 = true;
        int bo4 = 10;
        if (bo3 || (bo4++ > 0)) {
            System.out.println("结果都为true");
        } else {
            System.out.println("其中或全部为false");
        }
        System.out.println(bo4);
//        练习
        int x = 1;
        int y = 1;
        if (x++ == 2 || ++y == 2) {
            x = 7;
        }
        System.out.println(x + "----" + y);

        boolean z = true;
        boolean v = false;
        short c = 42;
        if ((c++ == 42) && (v = true)) c++; //  true c=43  && false      y=true c=44
        if ((z = false) || (++c == 45)) c++;// false || true  c = 45   c = 46
        System.out.println(c);


//        5）位运算符（了解）：无 <<<、操作的都是整型的数据
//        左移：<< 右移：>> 无符号右移：>>> 与运算：& 或运算：| 异或运算：^ 取反运算：~

//        左移 在一定范围内、每向左移一位乘以2
        int l = 10, l2 = 10;
        l = l << 2;
//        右移 在一定范围内、每向左移一位除以2
//        无符号右移，最高位无论是0或者1，空缺位都拿0补，功能与右移相同 >>
        l2 = l2 >>> 2;
        System.out.println(l + "----" + l2);

        int m1 = 12;
        int nn = 5;
        int nn2 = ~m1;
//        & 只有1 和1 才是 1 其它为 0
        System.out.println(m1 & nn);
//        | 只要其中有一个1 结果为1
        System.out.println(m1 | nn);
//        ^ 只要两者不一样为1，一样为0
        System.out.println(m1 ^ nn);
//        ~ 1取0 0取1
        System.out.println(nn2);


//        练习 交换两个变量的值
        int num1 = 10;
        int num2 = 20;
//        方式一：定义临时变量方式，对于类型没有限制 （推荐）
        int temp = num1;
        num1 = num2;
        num2 = temp;
        System.out.println(num1);
        System.out.println(num2);
//        方式二：好处：不用定义临时变量。 弊端：两者的范围相加可能超出类型的范围、只能用于数值型。
        num1 = num1 + num2;
        num2 = num1 - num2;
        num1 = num1 - num2;
        System.out.println(num1);
        System.out.println(num2);

//        6）三元运算符： 格式（条件表达式）?表达式1：表达式2;
//        条件表达式的结果为Boolean类型  根据结果决定运行哪个表达式，要求表达式类型结果要接的住。可以嵌套使用。
//        凡是可以使用三元运算符都可以改写为if else
//        如果程序既可以使用三元，又可以使用if-else，那么优先使用三元，因为效率高并且简洁
        int o = 12;
        int p = 12;
        String  op = (o > p) ? "o大" : ((o == p)? "o和p相等" : "p大");
        System.out.println(op);

//        获取三个数的最大值
        int i11 =12;
        int i22 =30;
        int i33 =-43;

        int ib = (i11 > i22)? i11 : i22;
        int ib2 = (ib > i33)? ib : i33;
        System.out.println("最大数为：" + ib2);

//        运算符优先级







    }
}