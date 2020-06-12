package healker.pattern.proxy.staticproxy;

import healker.pattern.proxy.HiAk;

/**
 * @author healker
 * @version 1.0
 * @date 2020/5/10 16:29
 * @email healkerzk@163.com
 */
public class StaticTest {
    public static void main(String[] args) {
        ArchitectTeacher at = new ArchitectTeacher(new HiAk());
        at.road();
    }
}
