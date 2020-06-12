package com.concurrency;

public class SynchronizedDemo {


    synchronized void demo() {
        System.out.println("synchronized demo");
    }

    Object ojb = new Object();
    void demo02() {
        synchronized (ojb) {
            //线程安全性问题
            System.out.println("synchronized demo");
        }
    }

    //锁的范围
    // 实例锁,对象实例
    // 类锁，静态方法、类对象   demo04/demo05中锁的范围是一样的，都是类锁
    // 代码块
    synchronized static void demo04() {

    }

    void demo05() {
        synchronized (SynchronizedDemo.class) {

        }
    }


    public static void main(String[] args) {
        SynchronizedDemo synchronizedDemo = new SynchronizedDemo();
        SynchronizedDemo synchronizedDemo2 = new SynchronizedDemo();
        new Thread(() -> {
            synchronizedDemo.demo();
        },"t1").start();

        new Thread(() -> {
            synchronizedDemo.demo();
        },"t2").start();

    }

}
