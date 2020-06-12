package com.pattern.factory.simplefactory;

import com.pattern.factory.ElectricalAppliancesI;
import com.pattern.factory.Refrigerator;
import com.pattern.factory.TV;

/**
 * @author healker
 * @date 2020/4/28 21:31
 * @email healkerzk@163.com
 * @version 1.0
 */
public class Test {
    public static void main(String[] args) {
        ElectricalAppliancesI tvAppliances = ElectricalAppliancesFactory.create(TV.class);
        tvAppliances.startUp();
        ElectricalAppliancesI refrigeratorAppliances = ElectricalAppliancesFactory.create(Refrigerator.class);
        refrigeratorAppliances.startUp();
    }
}
