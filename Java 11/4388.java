// 제출 번호: 35460107
// 아이디: adviate
// 문제: 4388
// 문제 제목: 받아올림
// 결과: 맞았습니다!!
// 메모리: 17368KB
// 시간: 212ms
// 언어: Java 11
// 코드 길이: 1345B
// 제출한 시간: 2021.11.16 02:59:47

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[][] tmp = new String[2][10];
        int[][] arr = new int[2][];

        while (true) {
            int cnt = 0;
            int carry = 0;
            tmp[0][0] = scanner.next();
            tmp[1][0] = scanner.next();

            if(tmp[0][0].equals("0") && tmp[1][0].equals("0")) {
                break;
            }

            tmp[0] = tmp[0][0].split("");
            arr[0] = new int[10];
            tmp[1] = tmp[1][0].split("");
            arr[1] = new int[10];

            int a = 0, b = 0;
            for (int i = 9; i >= 0; i--) {
                if(i < tmp[0].length) {
                    arr[0][i] = Integer.parseInt(tmp[0][a]);
                    a++;
                }
                if(i < tmp[1].length) {
                    arr[1][i] = Integer.parseInt(tmp[1][b]);
                    b++;
                }
            }

            for(int i = 0; i < 9; i++) {
                if(arr[0][i] + arr[1][i] + carry >= 10) {
                    cnt++;
                    carry = 1;
                }
                else {
                    carry = 0;
                }
            }
            System.out.println(cnt);
        }
        scanner.close();
    }
}
