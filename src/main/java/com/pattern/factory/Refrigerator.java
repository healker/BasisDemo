package com.pattern.factory;


/**
 * @author healker
 * @version 1.0
 * @date 2020/4/28 21:33
 * @email healkerzk@163.com
 */
public class Refrigerator implements ElectricalAppliancesI {
    public void startUp() {
        System.out.println("冰箱已启动");
    }
}
