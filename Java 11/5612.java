// 제출 번호: 35441953
// 아이디: adviate
// 문제: 5612
// 문제 제목: 터널의 입구와 출구
// 결과: 맞았습니다!!
// 메모리: 36632KB
// 시간: 444ms
// 언어: Java 11
// 코드 길이: 743B
// 제출한 시간: 2021.11.15 17:35:17

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean m = false;
        int cases = scanner.nextInt();
        int cars = scanner.nextInt();
        int max = cars;

        for(int i = 0; i < cases; i++) {
            int in = scanner.nextInt();
            int out = scanner.nextInt();
            cars += in;
            cars -= out;

            if(cars < 0) {
                m = true;
            }

            if(max < cars) {
                max = cars;
            }

        }

        if(m) {
            System.out.println(0);
        }
        else {
            System.out.println(max);
        }
        scanner.close();
    }
}
