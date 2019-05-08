package com.wdj.partone;

/**
 * Created by DingJin Wang on 2019-4-16
 * TIME 19:18.
 */
public class sevenPage {
    public static void main(String[] args) {
        printOut(72364);
    }

    //无终止的递归函数
    public static void printOut(int n) {
        if (n >= 10) {
            printOut(n / 10);
        }
        System.out.println(n % 10);
    }
}
