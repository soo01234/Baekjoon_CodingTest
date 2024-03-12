package JAVA_BASIC;

import java.util.Scanner;

public class BJ_Array_10813 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];  // n 개 바구니 = n 개 방
        for (int id = 0; id<n; id++) {
            arr[id] = id+1;  // 바구니에 적힌 번호와 같은 번호의 공이 들어있음
        }
        for (int h = 0; h < m; h++) {  // m개의 줄
            int i = sc.nextInt() - 1;
            int j = sc.nextInt() - 1;
            int temp;
            temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        for (int value : arr) {
            System.out.print(value + " ");
        }
    }
}
