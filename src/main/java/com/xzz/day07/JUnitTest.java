package com.xzz.day07;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.lang.management.MemoryManagerMXBean;

/**
 * @author 徐正洲
 * @date 2022/5/9-19:30
 * 单元测试
 * 步骤：
 * 1）类是public、且提供公共的无参构造器（默认即可）
 * 2）单元测试方法，权限是public、没有返回值、没有形参。
 * 3）@Test、并在单元测试类中导入org.junit.Test
 *
 *
 */
public class JUnitTest {

    public static void main(String[] args) {
        JUnitTest jUnitTest = new JUnitTest();
        jUnitTest.setTest();

    }
    @Test
    public void setTest(){
        String mm = new String("mm");
        System.out.println(mm);

    }

    @After
    public void getTest(){
        String mm = new String("mm");
        System.out.println(mm);

    }
}


