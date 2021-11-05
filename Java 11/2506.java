// 제출 번호: 35084099
// 아이디: adviate
// 문제: 2506
// 문제 제목: 점수계산
// 결과: 맞았습니다!!
// 메모리: 177724KB
// 시간: 212ms
// 언어: Java 11
// 코드 길이: 542B
// 제출한 시간: 2021.11.04 23:31:31

import java.util.Scanner;

class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int score = 0, extra = 1;

        int[] arr = new int[size];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }

        for (int i: arr) {
            if(i == 0) {
                extra = 0;
            }
            score += (extra * 1);
            extra++;
        }

        System.out.println(score);
    }
}