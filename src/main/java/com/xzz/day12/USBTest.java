package com.xzz.day12;

/**
 * @author 徐正洲
 * @date 2022/5/14-20:03
 * <p>
 * 1、接口使用体现多态性
 * <p>
 * 2、接口、实际上就是定义一个规范。
 * <p>
 * 3、面向接口编程
 */
public class USBTest {
    public static void main(String[] args) {
        Computer computer = new Computer();
        computer.transferDate(new Printer()); // 非匿名类的匿名对象
        USB phone = new USB() {    // 匿名类的非匿名对象
            @Override
            public void start() {

            }

            @Override
            public void stop() {

            }
        };
        computer.transferDate(phone);

        // 匿名类的匿名对象
        computer.transferDate(new USB() {
            @Override
            public void start() {

            }

            @Override
            public void stop() {

            }
        });

        computer.transferDate(phone);
    }

    static class Computer {
        public void transferDate(USB usb) {
            if (usb instanceof USB) {
                usb.start();
                usb.stop();
            } else {
                return;
            }

        }
    }
}

interface USB {

    void start();

    void stop();
}

class Flash implements USB {

    @Override
    public void start() {
        System.out.println("U盘开启");

    }

    @Override
    public void stop() {
        System.out.println("U盘关闭");
    }
}

class Printer implements USB {

    @Override
    public void start() {
        System.out.println("打印机开启");
    }

    @Override
    public void stop() {
        System.out.println("打印机关闭");
    }
}
