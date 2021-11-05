// 제출 번호: 35110549
// 아이디: adviate
// 문제: 1267
// 문제 제목: 핸드폰 요금
// 결과: 맞았습니다!!
// 메모리: 18224KB
// 시간: 228ms
// 언어: Java 11
// 코드 길이: 845B
// 제출한 시간: 2021.11.05 19:40:06

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // 선언 및 입력 부분
        Scanner scanner = new Scanner(System.in);
        int calls = scanner.nextInt();
        int[] callsArr = new int[calls];
        int[] charge = new int[2];
        
        // 계산 부분
        for (int i = 0; i < calls; i++) {
            callsArr[i] = scanner.nextInt();

            charge[0] += ((callsArr[i] / 30) + 1) * 10;
            charge[1] += ((callsArr[i] / 60) + 1) * 15;
        }

        // 출력 부분
        if (charge[0] > charge[1]) {
            System.out.println("M " + charge[1]);
        }
        else if (charge[0] == charge[1]) {
            System.out.println("Y " + "M " + charge[1]);
        }
        else {
            System.out.println("Y " + charge[0]);
        }
    }
}