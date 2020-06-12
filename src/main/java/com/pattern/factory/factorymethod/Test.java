package com.pattern.factory.factorymethod;

import com.pattern.factory.ElectricalAppliancesI;
import org.slf4j.LoggerFactory;

/**
 * @author healker
 * @version 1.0
 * @date 2020/5/2 18:15
 * @email healkerzk@163.com
 */
public class Test {
    public static void main(String[] args) {
        ElectricalAppliancesFactory electricalAppliancesFactory = new TVFactory();
        ElectricalAppliancesI tv = electricalAppliancesFactory.creat();
        tv.startUp();
//        AnnotationApplicationConnext
    }
}
