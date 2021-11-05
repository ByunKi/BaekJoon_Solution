// 제출 번호: 35111234
// 아이디: adviate
// 문제: 1964
// 문제 제목: 오각형, 오각형, 오각형…
// 결과: 맞았습니다!!
// 메모리: 17556KB
// 시간: 212ms
// 언어: Java 11
// 코드 길이: 272B
// 제출한 시간: 2021.11.05 20:03:23

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        long rst = ((3L * n * n) + (5L * n) +2) / 2;
        System.out.println(rst % 45678);
    }
}