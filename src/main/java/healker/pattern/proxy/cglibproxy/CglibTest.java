package healker.pattern.proxy.cglibproxy;

import healker.pattern.proxy.ArchitectRoad;
import healker.pattern.proxy.HiAk;
import net.sf.cglib.proxy.MethodInterceptor;
import org.apache.ibatis.executor.loader.cglib.CglibProxyFactory;

/**
 * @author healker
 * @version 1.0
 * @date 2020/5/10 11:12
 * @email healkerzk@163.com
 */
public class CglibTest {

    public static void main(String[] args) {
        CglibProxy cgproxy = new CglibProxy();
        HiAk ar = (HiAk) cgproxy.newInstance(new HiAk());
        ar.road();
    }
}
