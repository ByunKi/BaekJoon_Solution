// 제출 번호: 35386424
// 아이디: adviate
// 문제: 2747
// 문제 제목: 피보나치 수
// 결과: 맞았습니다!!
// 메모리: 17668KB
// 시간: 208ms
// 언어: Java 11
// 코드 길이: 535B
// 제출한 시간: 2021.11.13 20:22:48

import java.util.*;

public class Main {
    public static int[] arr = new int[45];

    public static int func(int n) {
        if(arr[n] != 0) {
            return arr[n];
        }
        else {
            arr[n] = func(n - 1) + func(n - 2);
            return arr[n];
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        arr[0] = 1;
        arr[1] = 1;
        int n = scanner.nextInt();
        System.out.println(func(n - 1));

        scanner.close();
    }
}
