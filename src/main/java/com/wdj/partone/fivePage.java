package com.wdj.partone;

/**
 * Created by DingJin Wang on 2019-4-16
 * TIME 19:08.
 */
public class fivePage {

    public static void main(String[] args) {
        System.out.println(function(2));
    }

    //递归函数的实现
    public static int function(int x) {
        if (x == 0) {
            return 0;
        } else {
            return 2 * function(x - 1) + x * x;
        }
    }
}
