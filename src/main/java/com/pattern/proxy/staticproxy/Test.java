package com.pattern.proxy.staticproxy;

/**
 * @author healk
 */
public class Test {
    public static void main(String[] args) {
        Lisi lisi = new Lisi(new ZhangSan());
        lisi.orde();
    }
}
