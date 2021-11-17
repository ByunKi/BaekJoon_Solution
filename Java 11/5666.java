// 제출 번호: 35497327
// 아이디: adviate
// 문제: 5666
// 문제 제목: Hot Dogs
// 결과: 맞았습니다!!
// 메모리: 17996KB
// 시간: 248ms
// 언어: Java 11
// 코드 길이: 401B
// 제출한 시간: 2021.11.17 10:27:13

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double hotDogs, people;
        do {
            hotDogs = scanner.nextDouble();
            people = scanner.nextDouble();

            System.out.printf("%.2f%n", hotDogs/people);
        } while (scanner.hasNext());
        scanner.close();
    }
}
