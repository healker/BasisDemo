package com.pattern.factory.simplefactory;

import com.pattern.factory.AirConditioning;
import com.pattern.factory.ElectricalAppliancesI;
import com.pattern.factory.Refrigerator;
import com.pattern.factory.TV;

/**
 * @author healker
 * @version 1.0
 * @date 2020/4/28 21:39
 * @email healkerzk@163.com
 * @description :
 *      1.日历类：Calendar
 */
public class ElectricalAppliancesFactory {
    /**
     * 方法升级：利用反射创建对象,利用泛型限制必须传ElectricalAppliances接口类的子类
     * @param clazz 利用泛型限制必须传ElectricalAppliances接口类的子类
     * @return
     */
    public static ElectricalAppliancesI create(Class<? extends ElectricalAppliancesI> clazz) {
        try {
            if (null != clazz) {
                return clazz.newInstance();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * 方法升级：利用反射创建对象，根据对象类名创建对象
     * @param clazzName e.g.  clazzName = com.pattern.factory.AirConditioning
     * @return
     */
    public static ElectricalAppliancesI create_v2(String clazzName) {
        try {
            if (!(null == clazzName || "".equals(clazzName))) {
                return (ElectricalAppliancesI) Class.forName(clazzName).newInstance();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * @param appliancesName
     * @return
     */
    public static ElectricalAppliancesI create_v1(String appliancesName) {
        if ("冰箱".equals(appliancesName)) {
            return new Refrigerator();
        } else if ("电视".equals(appliancesName)) {
            return new TV();
        } else if ("空调".equals(appliancesName)) {
            return new AirConditioning();
        }
        return null;
    }

}


