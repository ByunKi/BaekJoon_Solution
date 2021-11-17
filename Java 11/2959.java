// 제출 번호: 35496850
// 아이디: adviate
// 문제: 2959
// 문제 제목: 거북이
// 결과: 맞았습니다!!
// 메모리: 17664KB
// 시간: 220ms
// 언어: Java 11
// 코드 길이: 390B
// 제출한 시간: 2021.11.17 10:10:01

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[4];
        for (int i = 0; i < 4; i++) {
            arr[i] = scanner.nextInt();
        }
        Arrays.sort(arr);
        System.out.println(arr[0] * arr[2]);
        scanner.close();
    }
}
