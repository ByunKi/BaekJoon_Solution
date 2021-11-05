// 제출 번호: 35111448
// 아이디: adviate
// 문제: 2576
// 문제 제목: 홀수
// 결과: 맞았습니다!!
// 메모리: 18336KB
// 시간: 228ms
// 언어: Java 11
// 코드 길이: 569B
// 제출한 시간: 2021.11.05 20:10:26

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0, min = 100;

        for (int i = 0; i < 7; i++) {
            int num = scanner.nextInt();

            if((num % 2) != 0) {
                if(num < min) {
                    min = num;
                }

                sum += num;
            }

        }

        if(sum <= 0) {
            System.out.println(-1);
        }
        else {
            System.out.println(sum + "\n" + min);
        }

    }
}