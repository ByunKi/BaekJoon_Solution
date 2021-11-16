// 제출 번호: 35472364
// 아이디: adviate
// 문제: 4504
// 문제 제목: 배수 찾기
// 결과: 맞았습니다!!
// 메모리: 18696KB
// 시간: 264ms
// 언어: Java 11
// 코드 길이: 580B
// 제출한 시간: 2021.11.16 15:35:25

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        while(true) {
            int a = scanner.nextInt();
            if(a == 0) {
                break;
            }

            if((a % n) == 0 && a > 1) {
                System.out.println(a + " is a multiple of " + n + ".");
            }
            else {
                System.out.println(a + " is NOT a multiple of " + n + ".");
            }
        }

        scanner.close();
    }
}
