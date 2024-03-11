package JAVA_BASIC;
import java.util.Scanner;
public class BJ_Array_10871 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);  // Scanner 객체 생성
        // int n = Integer.parseInt(in.nextLine()); // n 입력받기

        String[] nx = in.nextLine().split(" ");  // nx 에 n, x 받기 (String)
        int n = Integer.parseInt(nx[0]);
        int x = Integer.parseInt(nx[1]);
        String[] a = in.nextLine().split(" ");  // 수열 a 받기 (String)

        for (int i = 0; i < n; i++) {
            if (Integer.parseInt(a[i]) < Integer.parseInt(nx[1])) {
                System.out.print(a[i] + " ");
            }
        }

    }
}
