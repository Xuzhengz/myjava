package com.xzz.day18;

/**
 * @author 徐正洲
 * @date 2022/5/23-20:08
 *
 * 线程死锁问题。
 */
public class BadLock {
    public static void main(String[] args) {
        StringBuffer stringBuffer = new StringBuffer();
        StringBuffer stringBuffer2 = new StringBuffer();

        new Thread(){
            @Override
            public void run() {
                synchronized (stringBuffer){
                    stringBuffer.append("a");
                    stringBuffer2.append("1");

                    synchronized ((stringBuffer2)){
                        stringBuffer.append("a");
                        stringBuffer2.append("1");
                        System.out.println(stringBuffer);
                        System.out.println(stringBuffer2);
                    }
                }
            }
        }.start();

        new Thread(){
            @Override
            public void run() {
                synchronized (stringBuffer2){
                    stringBuffer.append("a");
                    stringBuffer2.append("1");

                    synchronized ((stringBuffer)){
                        stringBuffer.append("a");
                        stringBuffer2.append("1");
                        System.out.println(stringBuffer);
                        System.out.println(stringBuffer2);
                    }
                }
            }
        }.start();

    }
}