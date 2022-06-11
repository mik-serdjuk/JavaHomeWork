package com.pb.serdjuk.For_VN;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Arrays;

public class ZIKL {
    public static void main(String[] args) {
        for (int i = 1; i<=4; i++) {
            for (int k = 0; k<(4-i); k++) {
                System.out.print(" ");
            }
            for (int j = 0; j<(i*2)-1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
