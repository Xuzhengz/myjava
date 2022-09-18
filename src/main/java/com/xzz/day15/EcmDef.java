package com.xzz.day15;

/**
 * @author 徐正洲
 * @date 2022/5/17-15:59
 */
public class EcmDef {
    public static void main(String[] args) {
        try {
            int i = Integer.parseInt(args[0]);
            int j = Integer.parseInt(args[1]);
            System.out.println(EcmDef.ecm(i, j));
        } catch (MyException e) {
            System.out.println(e.getMessage());
        }catch (NumberFormatException e){
            System.out.println("数据类型不一致");
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("缺少命令行参数");
        }catch (ArithmeticException e){
            System.out.println("分母为0");
        }

    }

    public static int ecm(int i, int j) throws MyException {
        if (i > 0 && j > 0) {
            return i / j;
        } else {
            throw new MyException("分子或分母为负数");
        }

    }

}