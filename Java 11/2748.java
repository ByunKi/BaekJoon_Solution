// 제출 번호: 35401049
// 아이디: adviate
// 문제: 2748
// 문제 제목: 피보나치 수2
// 결과: 맞았습니다!!
// 메모리: 17864KB
// 시간: 224ms
// 언어: Java 11
// 코드 길이: 617B
// 제출한 시간: 2021.11.14 11:50:40

import java.math.*;
import java.util.*;

public class Main {
    public static BigInteger[] arr = new BigInteger[90];

    public static BigInteger func(int n) {
        if(arr[n].intValue() == 0) {
            arr[n] = arr[n].add(func(n - 1).add(func(n - 2)));
        }

        return arr[n];
    }

    public static void main(String[] args) {
        Arrays.fill(arr, BigInteger.ZERO);
        arr[0] = BigInteger.ONE;
        arr[1] = BigInteger.ONE;

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(func(n - 1));

        scanner.close();
    }
}
