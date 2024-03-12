package JAVA_BASIC;

import java.util.Scanner;

public class BJ_Array_5597 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[30]; // 방 30개짜리 배열 arr
        for (int i = 0; i < 28; i++) {  // 28명 제출
            int n = sc.nextInt();
            arr[n+1] = n;
        }
        for (int j = 0; j < 30; j++) {
            if (arr[j] == 0) {
                System.out.println(j + 1);
                System.out.println(j + 2);
            }
        }
    }
}
