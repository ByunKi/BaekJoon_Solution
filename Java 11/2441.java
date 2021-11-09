// 제출 번호: 35231555
// 아이디: adviate
// 문제: 2441
// 문제 제목: 별 찍기 - 4
// 결과: 맞았습니다!!
// 메모리: 18856KB
// 시간: 348ms
// 언어: Java 11
// 코드 길이: 451B
// 제출한 시간: 2021.11.09 12:40:42

import java.util.*;

class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        for(int i = 0; i < n; i++) {
            for (int a = (n - i); a < n; a++) {
                System.out.print(" ");
            }

            for (int b = i; b < n; b++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
