// 제출 번호: 35213562
// 아이디: adviate
// 문제: 7770
// 문제 제목: 아즈텍 피라미드
// 결과: 맞았습니다!!
// 메모리: 17616KB
// 시간: 216ms
// 언어: Java 11
// 코드 길이: 298B
// 제출한 시간: 2021.11.08 22:09:21

import java.util.*;
import java.math.*;

class Main  {
    static int func(int n) {
        if(n <= 1) {
            return 1;
        }
        return func(n-1) + (int) (Math.pow(n, 2) + Math.pow(n-1, 2));
    } // 개수 구하기

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int level = 0, blocks = 0;

        while (blocks <= n) {
            blocks += Math.pow(level, 2) + Math.pow((level + 1), 2);
            level++;
        }

        System.out.println(level - 1);
    }
}
