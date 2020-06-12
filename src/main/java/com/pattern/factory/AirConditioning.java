package com.pattern.factory;


/**
 * @author healker
 * @version 1.0
 * @date 2020/4/28 21:34
 * @email healkerzk@163.com
 */
public class AirConditioning implements ElectricalAppliancesI {
    public void startUp() {
        System.out.println("空调已启动");
    }
}
