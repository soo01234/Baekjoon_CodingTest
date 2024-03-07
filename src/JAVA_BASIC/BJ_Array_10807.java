package JAVA_BASIC;
import java.util.Scanner;
public class BJ_Array_10807 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);  // Scanner 객체 생성

        int count = 0;
        int n = Integer.parseInt(in.nextLine());
        int[] arr = new int[n];  // 방 n개 !!

        String[] nums = in.nextLine().split(" ");

        int v = in.nextInt();

        for(int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(nums[i]);
            if (arr[i] == v) {
                count++;
            }
        }
        System.out.println(count);

    }
}
