package com.pattern.proxy.staticproxy;

/**
 *
 */
public class Lisi implements IOrde {

    private ZhangSan zhangsan;

    //构造方法
    public Lisi(ZhangSan zhangsan) {
        this.zhangsan = zhangsan;
    }

    public void orde() {
        System.out.println("跑腿李四，接收订单");
        zhangsan.orde();
        System.out.println("完成订单");
    }
}
