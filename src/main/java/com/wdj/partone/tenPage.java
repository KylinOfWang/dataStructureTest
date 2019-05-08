package com.wdj.partone;

import javafx.scene.shape.Circle;

import java.awt.*;

/**
 * Created by DingJin Wang on 2019-5-8
 * TIME 14:38.
 */
public class tenPage {
    public static Comparable findMax(Comparable[] arr) {
        int maxIndex = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].compareTo(arr[maxIndex]) > 0) {
                maxIndex = i;
            }
        }
        return arr[maxIndex];
    }

    public static void main(String[] args) {
        Integer[] sh1 = {8, 9, 51, 84, 1};
        String[] st1 = {"Joe", "Bob", "Bill", "Zeke"};

        System.out.println(findMax(sh1));
        System.out.println(findMax(st1));
    }
}
