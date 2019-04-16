package com.wdj.partone;

/**
 * Created by DingJin Wang on 2019-4-16
 * TIME 19:18.
 */
public class sixPage {
    public static void main(String[] args) {
        System.out.println(bad(10));
    }

    //无终止的递归函数
    public static int bad(int n) {
        if (n == 0) {
            return 0;
        } else {
            return bad(n / 3 + 1) + n - 1;
        }
    }
}
