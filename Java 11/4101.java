// 제출 번호: 35434012
// 아이디: adviate
// 문제: 4101
// 문제 제목: 크냐?
// 결과: 맞았습니다!!
// 메모리: 17952KB
// 시간: 244ms
// 언어: Java 11
// 코드 길이: 521B
// 제출한 시간: 2021.11.15 14:21:17

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a, b;

        while (true) {
            a = scanner.nextInt();
            b = scanner.nextInt();

            if(a == 0 && b == 0) {
                break;
            }

            if(a > b) {
                System.out.println("Yes");
            }
            else {
                System.out.println("No");
            }
        }

        scanner.close();
    }
}
