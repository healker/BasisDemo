package healker.pattern.proxy.staticproxy;

import healker.pattern.proxy.ArchitectRoad;
import healker.pattern.proxy.HiAk;
import netscape.security.PrivilegeTable;

/**
 * @author healker
 * @version 1.0
 * @date 2020/5/10 16:16
 * @email healkerzk@163.com
 */
public class ArchitectTeacher implements ArchitectRoad {

    private HiAk hiAk;

    ArchitectTeacher(HiAk hiAk) {
        this.hiAk = hiAk;
    }

    public void road() {
        System.out.println("---前置增强！架构师之师引领架构之路---");
        this.hiAk.road();
        System.out.println("---后置增强！架构师之师引领架构之路---");
    }
}
