package com.xzz.day02;

import com.xzz.day01.Person;

import java.util.*;

/**
 * @author 徐正洲
 * @date 2022/5/2-19:01
 *
 * package关键字的使用
 * 1、更好管理项目中的类，提供包的概念
 * 2、使用package声明类和接口所属的包，声明在源文件的首行。
 * 3、包，属于标识符，遵循标识符的命名规则、规范（xxxyyyzzz），”见名知意“
 * 4、每”。“ 一次 就代表一层文件目录。
 * MVC：
 * 1、常用设计模式之一，将整个程序分为三个层次：视图模型层、控制器层、数据模型层
 *
 * 模型层（处理数据）：数据对象封装 model.bean/domain  数据库操作类 model.doc 数据库 model.db
 * 控制层（处理业务逻辑）：应用界面相关 controller.activitiy 存放fragment controller.fragment 显示列表的适配器 controller.adapter
 * 服务相关的 controller.service  抽取的基类： controller.base
 * 视图层（显示数据）：相关工具类 view.utils 自定义view view.ui
 *
 * Import关键字的使用
 * 作用：导入
 * 1、在源文件中显示的使用import结构导入指定包下的类、接口
 * 2、声明在包的声明和类的声明之间
 * 3、可以使用.*的方式，导入包下所有的结构。如果需要使用子包下的结构仍需要导入。
 * 4、如果使用的类为java.lang包下面的则可以省略导入。
 * 5、如果需要使用不同包但类名相同，需要补充全全类名的方式。
 * 6、import static：导入包下的静态结构
 *
 */
public class Package {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(new int[]{1, 2, 3}));
        Person person = new Person();
        Scanner scanner = new Scanner(System.in);
        String next = scanner.next();

    }
}