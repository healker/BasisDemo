package com.concurrency;


import org.junit.jupiter.api.Test;
import sun.misc.Unsafe;

import java.lang.reflect.Field;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicIntegerArray;

public class CasTest {
    // https://blog.csdn.net/u011506543/article/details/82392338
    private static Field unsafe = null;

    @Test
    public void test() throws NoSuchFieldException {
//        compareAndSet
//        unsafe.compareAndSwapInt(this, valueOffset, expect, update);

        unsafe = Unsafe.class.getDeclaredField("theUnsafe");
//        public final int getAndAddInt(Object var1, long var2, int var4) {
//            int var5;
//            do {
//                var5 = this.getIntVolatile(var1, var2);
                //           compareAndSwapInt(this,this的偏移量，根据偏移量获取到的值，var5 + 要改变的值)
//            } while(!this.compareAndSwapInt(var1, var2, var5, var5 + var4));
//
//            return var5;
//        }
        AtomicInteger count = new AtomicInteger(0);
        for (int i = 1; i <= 10; i++) {
            new Thread(() -> {
                while (count.compareAndSet(0, 2)) {

                }
            }, "t" + i).start();
        }
    }


}
