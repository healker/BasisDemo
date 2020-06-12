package com.lambdademo;

import java.util.Arrays;
import java.util.Comparator;

public class LambTest {

    public static void main(String[] args) {
        String[] array = new String[] { "Apple", "Orange", "Banana", "Lemon" };

        //java8之前，匿名类方式编写
        Arrays.sort(array, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                return s1.compareTo(s2);
            }
        });
        System.out.println(String.join(", ", array));

        // Lambda表达式写法
        //   参数是(s1, s2)，参数类型可以省略，因为编译器可以自动推断出String类型。
        //    -> { ... }表示方法体，所有代码写在内部即可。
        //    Lambda表达式没有class定义，因此写法非常简洁。
        String[] array2 = new String[] { "Apple", "Orange", "Banana", "Lemon" };
        Arrays.sort(array2, (s1,s2)->{
           return s1.compareTo(s2);
        });
        System.out.println(String.join(", ", array2));

        String[] array3 = new String[] { "Apple", "Orange", "Banana", "Lemon" };
        //Lambda表达式写法
        //   只有一行return xxx的代码，完全可以用更简单的写法
        Arrays.sort(array3, (s1, s2) -> s2.compareTo(s1));
        System.out.println(String.join(", ", array3));

    }
}
