package JAVA_BASIC;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Scanner;

public class BJ_Array_10818 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine()); // 정수 개수(int)

        String[] num = sc.nextLine().split(" "); // n개의 정수 공백으로 구분해 입력(int)
        int[] numInt = new int[n];
        for (int i = 0; i < num.length; i++) {
            numInt[i] = Integer.parseInt(num[i]); // 정수 배열에 정수 형태로 넣기
        }
        Arrays.sort(numInt);
        System.out.println(numInt[0] + " " + numInt[n-1]);
    }
}
