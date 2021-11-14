// 제출 번호: 35402132
// 아이디: adviate
// 문제: 10826
// 문제 제목: 피보나치 수4
// 결과: 맞았습니다!!
// 메모리: 29144KB
// 시간: 228ms
// 언어: Java 11
// 코드 길이: 743B
// 제출한 시간: 2021.11.14 12:50:49

import java.math.*;
import java.util.*;

public class Main {
    public static BigInteger[] arr;

    public static BigInteger func(int n) {
        if(arr[n].intValue() == 0) {
            arr[n] = arr[n].add(func(n - 1).add(func(n - 2)));
        }
        return arr[n];
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        if(n >= 1) {
            arr = new BigInteger[n + 1];

            Arrays.fill(arr, BigInteger.ZERO);
            arr[0] = BigInteger.ONE;
            arr[1] = BigInteger.ONE;

            System.out.println(func(n - 1));
        }
        else {
            System.out.println(0);
        }
        scanner.close();
    }
}
