package com.cycledemo;

import org.junit.jupiter.api.Test;

public class CycleDemo {


    @Test
    void test() {
        int i = 1;
        //while do
        //先判断再执行
        while (i < 1) {
            i++;
        }
        System.out.println("while do : " + i);

        int y = 1;
        //do while
        //先执行再判断
        do {
            y++;
        } while (y < 1);
        System.out.println("do while : " + y);
    }

}

