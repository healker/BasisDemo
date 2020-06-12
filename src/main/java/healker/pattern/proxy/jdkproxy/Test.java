package healker.pattern.proxy.jdkproxy;

import healker.pattern.proxy.ArchitectRoad;
import healker.pattern.proxy.HiAk;

/**
 * @author healker
 * @version 1.0
 * @date 2020/5/10 10:54
 * @email healkerzk@163.com
 */
public class Test {
    public static void main(String[] args) {
        JdkProxy jp = new JdkProxy();
        ArchitectRoad ar = (ArchitectRoad) jp.newInstance(new HiAk());
        ar.road();
    }
}
