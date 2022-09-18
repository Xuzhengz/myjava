package com.xzz.day15;

/**
 * @author 徐正洲
 * @date 2022/5/17-15:33
 */
public class HandThrowsException {
    public static void main(String[] args) {
        try {
            Student student = new Student();
            student.register(1); // 此时出现错误，下一行代码不执行。
            System.out.println(student);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
class Student{
    private int id;

    public void register(int id) throws MyException {
        if (id > 0){
            this.id=id;
        }else {
//            System.out.println("非法输入！！！");
//            自动生成异常对象
            throw new MyException("非法输入！！！");
        }
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                '}';
    }
}