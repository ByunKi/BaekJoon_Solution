// 제출 번호: 35496677
// 아이디: adviate
// 문제: 2921
// 문제 제목: 도미노
// 결과: 맞았습니다!!
// 메모리: 17700KB
// 시간: 216ms
// 언어: Java 11
// 코드 길이: 260B
// 제출한 시간: 2021.11.17 09:59:34

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(n * (n+1) * (n+2) / 2);
        scanner.close();
    }
}
