package com.pattern.proxy.dynamicproxy.jdkproxy;


import com.pattern.proxy.dynamicproxy.jdkproxy.ZhangSan;

/**
 * Created by Tom.
 */
public class Test {
    public static void main(String[] args) {
        JdkPaotui jdkPaotui = new JdkPaotui();
        IOrde zhangsan = jdkPaotui.getInstance(new ZhangSan());
        zhangsan.orde();


        IOrde zhaoliu = jdkPaotui.getInstance(new ZhaoLiu());
        zhaoliu.orde();

        JdkProxy jdkProxy = new JdkProxy();
        IOrde zhangsan1 = (IOrde) jdkProxy.getInstance(new ZhangSan());
        zhangsan1.orde();

    }
}
