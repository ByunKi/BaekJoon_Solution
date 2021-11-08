// 제출 번호: 35202361
// 아이디: adviate
// 문제: 1011
// 문제 제목: Fly me to the Alpha Centauri
// 결과: 맞았습니다!!
// 메모리: 17964KB
// 시간: 248ms
// 언어: Java 11
// 코드 길이: 945B
// 제출한 시간: 2021.11.08 17:15:53

import java.util.*;

class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cases = scanner.nextInt();

        while((cases--) > 0) {
            int start = scanner.nextInt();
            int end = scanner.nextInt();

            int dist = end - start;
            int weight = 1, cnt = 0;

            while (dist > 0) {
                if (dist >= (weight * 2)) {
                    dist -= (weight * 2);
                    cnt += 2;
                    weight += 1;
                }
                else {
                    if(dist - weight > 0) {
                        cnt += 2;
                    }
                    else {
                        cnt += 1;
                    }
                    break;
                }

            }

            System.out.println(cnt);
        }

        scanner.close();
    }
}
