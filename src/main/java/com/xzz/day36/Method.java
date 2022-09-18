package com.xzz.day36;

import com.xzz.day23.MyAnnovation;
import org.junit.Test;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/**
 * @author 徐正洲
 * @date 2022/6/13-20:13
 *
 * 获取运行时类的方法结构：获取所有父类声明public的方法
 */
public class Method {

    @Test
    public void test(){
        Class<Person> personClass = Person.class;

//        for (java.lang.reflect.Method method : personClass.getMethods()) {
//            System.out.println(method.getName());
//        }
        //declaredMethods:获取当前运行时类所有声明的方法
        java.lang.reflect.Method[] declaredMethods = personClass.getDeclaredMethods();
        for (java.lang.reflect.Method declaredMethod : declaredMethods) {
            System.out.println(declaredMethod);
        }
    }

    /**
     * 获取注解
     */

    @Test
    public void test2(){
        Class<Person> personClass = Person.class;
        java.lang.reflect.Method[] declaredMethods = personClass.getDeclaredMethods();

        for (java.lang.reflect.Method declaredMethod : declaredMethods) {
//            Annotation[] annotations = declaredMethod.getAnnotations();
//            for (Annotation annotation : annotations) {
//                System.out.println(annotation);
//            }
            //抛出的异常
            Class<?>[] exceptionTypes = declaredMethod.getExceptionTypes();
            for (Class<?> exceptionType : exceptionTypes) {
                System.out.println(exceptionType.getName());
            }
        }
        //方法权限符
//        int modifiers = personClass.getModifiers();
//        System.out.println(Modifier.toString(modifiers));

    }
    /**
     * 获取构造器结构：获取类中声明为Public的构造器
     */
    @Test
    public void test3() {
        Class<Person> personClass = Person.class;
        Constructor<?>[] constructors = personClass.getConstructors();
        for (Constructor<?> constructor : constructors) {
            System.out.println(constructor);
        }
        Constructor<?>[] declaredConstructors = personClass.getDeclaredConstructors();
        for (Constructor<?> declaredConstructor : declaredConstructors) {
            System.out.println(declaredConstructor);
        }

    }
    /**
     * 获取运行时类的带泛型父类
     */
    @Test
    public void test4(){
        Class personClass = Person.class;
        Type genericSuperclass = personClass.getGenericSuperclass();
        System.out.println(genericSuperclass);
        ParameterizedType parameterizedType = (ParameterizedType)genericSuperclass;
        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
        System.out.println(((Class) actualTypeArguments[0]).getName());
    }
    /**
     * 获取运行时类的实现的接口
     */
    @Test
    public void test5(){
        Class personClass = Person.class;

        Class[] interfaces = personClass.getInterfaces();
        for (Class anInterface : interfaces) {
            System.out.println(anInterface);
        }
    }

    /**
     * 获取运行时类的实现的接口
     */
    @Test
    public void test6(){
        Class personClass = Person.class;
        Package aPackage = personClass.getPackage();
        System.out.println(aPackage);
    }

    /**
     * 获取运行时类的注解
     */
    @Test
    public void test7(){
        Class personClass = Person.class;
        Annotation annotation = personClass.getAnnotation(MyAnnovation.class);
        System.out.println(annotation);
        Annotation[] annotations = personClass.getAnnotations();
        for (Annotation annotation1 : annotations) {
            System.out.println(annotation1);
        }
    }

    /**
     * 获取运行时类的指定结构
     */
    @Test
    public void field() throws NoSuchFieldException, IllegalAccessException, InstantiationException {
        Class personClass = Person.class;
        Object o = personClass.newInstance();
        Person person =(Person)o;

//        Field name = personClass.getField("sex");
//        name.set(o,12);
//        Object o1 = name.get(o);
//        System.out.println(o1);

        Field name = personClass.getDeclaredField("name");
        //保证当前属性是可访问的
        name.setAccessible(true);
        name.set(person,"xuzz");
        System.out.println(name.get(person));

    }

    /**
     * 获取运行时类的指定方法
     */
    @Test
    public void method() throws Exception {
        Class personClass = Person.class;
        Person personClass1 = (Person) personClass.newInstance();

        java.lang.reflect.Method eat = personClass.getDeclaredMethod("eat",String.class);
        eat.setAccessible(true);
        // 实参1：调用者
        eat.invoke(personClass1, "水果");
    }

    /**
     * 获取运行时类的指定方法
     */
    @Test
    public void construct() throws Exception {
        Class personClass = Person.class;
        Constructor declaredConstructor = personClass.getDeclaredConstructor(String.class);
        declaredConstructor.setAccessible(true);
        Object xzz = declaredConstructor.newInstance("xzz");
        System.out.println(xzz);

    }
}