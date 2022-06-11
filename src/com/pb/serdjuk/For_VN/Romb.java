package com.pb.serdjuk.For_VN;

public class Romb {
    public static void main(String[] args) {
        int N = 10;
        for (int i = 1; i<=N; i++) {
            for (int k = 0; k < N - i; k++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2*i-1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int q = 1; q<=N-1; q++) {
                for (int n = 0; n<q; n++) {
                    System.out.print(" ");
                }
                for (int l = 0; l<(N-q)*2-1; l++) {
                     System.out.print("*");
                }
                System.out.println();
        }
    }


}
