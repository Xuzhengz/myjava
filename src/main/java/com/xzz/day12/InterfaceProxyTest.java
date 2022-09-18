package com.xzz.day12;

/**
 * @author 徐正洲
 * @date 2022/5/14-20:20
 * <p>
 * 接口应用：代理模式
 * 通过代理类对象调用被代理类的方法。
 */
public class InterfaceProxyTest {
    public static void main(String[] args) {
        ProxyServer proxyServer = new ProxyServer(new Server());
        proxyServer.browse();
    }
}

interface Newwork {
    public void browse();
}

//被代理类
class Server implements Newwork {

    @Override
    public void browse() {
        System.out.println("网络访问");
    }
}

//代理类
class ProxyServer implements Newwork {
    private Newwork newwork;

    public ProxyServer(Newwork newwork) {
        this.newwork = newwork;
    }

    public void check() {
        System.out.println("校验");
    }

    @Override
    public void browse() {
        check();
        newwork.browse();

    }
}