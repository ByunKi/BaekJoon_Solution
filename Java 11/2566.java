// 제출 번호: 35266254
// 아이디: adviate
// 문제: 2566
// 문제 제목: 최댓값
// 결과: 맞았습니다!!
// 메모리: 18516KB
// 시간: 240ms
// 언어: Java 11
// 코드 길이: 660B
// 제출한 시간: 2021.11.10 10:48:30

import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] arr = new int[9][9];
        int row = 0,col = 0, max = arr[0][0];

        for (int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr[i].length; j++) {
                arr[i][j] = scanner.nextInt();

                if(max < arr[i][j]) {
                    max = arr[i][j];
                    row = i;
                    col = j;
                }
            }
        }

        System.out.println(max);
        System.out.println((row + 1) + " " + (col + 1));

        scanner.close();
    }
}
