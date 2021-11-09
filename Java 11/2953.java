// 제출 번호: 35232245
// 아이디: adviate
// 문제: 2953
// 문제 제목: 나는 요리사다
// 결과: 맞았습니다!!
// 메모리: 18376KB
// 시간: 236ms
// 언어: Java 11
// 코드 길이: 701B
// 제출한 시간: 2021.11.09 13:12:37

import java.util.*;

class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] arr = new int[5][4];
        int[] scores = new int[5];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = scanner.nextInt();
                scores[i] += arr[i][j];
            }
        }

        int max = scores[0];
        int winner = 0;
        for (int k = 0; k < scores.length; k++) {
            if(max < scores[k]) {
                max = scores[k];
                winner = k;
            }
        }

        System.out.println((winner + 1) + " " + max);
    }
}
