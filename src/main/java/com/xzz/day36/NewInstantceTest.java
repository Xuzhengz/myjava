package com.xzz.day36;

import org.apache.commons.validator.Var;
import org.junit.Test;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Random;

/**
 * @author 徐正洲
 * @date 2022/6/13-19:39
 *
 * 通过反射创建对应的运行时类的对象
 * 1）newInstaance：要求运行时类必须提供空参构造器，空参构造器访问权限为Public
 * 2）在javabean中提供一个public的空参构造器，原因：
 * 1、便于反射，创建运行时类的对象
 * 2、便于子类继承父类，调用super()
 *
 */
public class NewInstantceTest {
    @Test
    public void test() throws Exception {
        Class<Person> personClass = Person.class;
        Person person = personClass.newInstance();
        Method show = personClass.getDeclaredMethod("show");
        show.setAccessible(true);
        show.invoke(person);
    }
    @Test
    public void test2() throws IllegalAccessException, InstantiationException, ClassNotFoundException {
        int num = new Random().nextInt(3);
        String classPath="";
        switch (num){
            case 0:
                classPath="java.util.Date";
                break;
            case 1:
                classPath="java.sql.Date";
                break;
            case 2:
                classPath="com.xzz.day36.Person";
                break;
        }
        Object instance = getInstance(classPath);
        System.out.println(instance.getClass());


    }
    public Object getInstance(String classPath) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        Class<?> aClass = Class.forName(classPath);
        Object o = aClass.newInstance();
        return o;
    }
    /**
     * 获取运行时类的完整结构
     * 1）getFields：获取本类和父类public修饰符的属性
     * 2）getDeclaredFields：获取本类所有的属性（包含私有）
     */
    @Test
    public void test3(){
        Class<Person> personClass = Person.class;
        Field[] fields = personClass.getFields();
//        for (Field field : fields) {
//            System.out.println(field);
//        }
        Field[] declaredFields = personClass.getDeclaredFields();
        for (Field declaredField : declaredFields) {
            System.out.println(declaredField);
            System.out.println("****************");

            //获取权限修饰符
            int modifiers = declaredField.getModifiers();
            System.out.println(Modifier.toString(modifiers));

            //获取类型
            Class<?> type = declaredField.getType();
            System.out.println(type.getName());

            //获取变量名
            System.out.println(declaredField.getName());
        }



    }

}