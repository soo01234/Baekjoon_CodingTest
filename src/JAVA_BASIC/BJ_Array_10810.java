package JAVA_BASIC;

import java.util.Scanner;

public class BJ_Array_10810 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];  // n 개 바구니 = n 개 방
        //arr[0] = 0;
        for (int h = 0; h < m; h++) {  // m 개의 줄
            int i = sc.nextInt();
            int j = sc.nextInt();
            int k = sc.nextInt();

            for (int p = i; p <= j; p++) {
                arr[p-1] = k;
            }
        }
        for (int value : arr) {
            System.out.print(value + " ");
        }
    }
}
