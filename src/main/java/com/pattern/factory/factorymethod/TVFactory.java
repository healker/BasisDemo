package com.pattern.factory.factorymethod;

import com.pattern.factory.ElectricalAppliancesI;
import com.pattern.factory.TV;

/**
 * @author healker
 * @version 1.0
 * @date 2020/5/2 17:15
 * @email healkerzk@163.com
 */
public class TVFactory implements ElectricalAppliancesFactory{

    public ElectricalAppliancesI creat() {
        return new TV();
    }
}
