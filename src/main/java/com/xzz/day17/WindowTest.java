package com.xzz.day17;

/**
 * @author 徐正洲
 * @date 2022/5/22-19:24
 *
 * 例子：创建三个窗口卖票，总票数为100张
 *
 * 存在线程安全问题、待解决。
 */
class window extends Thread{
    private static int ticket =100;

    @Override
    public void run() {
        while (true){
            if (ticket >0){
                System.out.println(getName() + "窗口卖票了，票号为" + ticket);
                ticket--;
            }else {
                break;
            }
        }

    }
}

public class WindowTest {
    public static void main(String[] args) {
        window window1 = new window();
        window window2 = new window();
        window window3 = new window();

        window1.setName("窗口1");
        window2.setName("窗口2");
        window3.setName("窗口3");

        window1.start();
        window2.start();
        window3.start();
    }
}