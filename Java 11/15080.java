// 제출 번호: 35126239
// 아이디: adviate
// 문제: 15080
// 문제 제목: Every Second Counts
// 결과: 맞았습니다!!
// 메모리: 17684KB
// 시간: 220ms
// 언어: Java 11
// 코드 길이: 772B
// 제출한 시간: 2021.11.06 11:49:27

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String begin = scanner.nextLine();
        String end = scanner.nextLine();

        String[][] time = new String[2][3];
        time[0] = begin.split(" : ");
        time[1] = end.split(" : ");

        int[][] tmp = new int[2][3];
        for (int i = 0; i < tmp.length; i++) {
            for (int j = 0; j < tmp[i].length; j++) {
                tmp[i][j] = Integer.parseInt(time[i][j]);
            }
        }

        int rst = ((tmp[1][0] - tmp[0][0]) * 3600) + ((tmp[1][1] - tmp[0][1]) * 60) + (tmp[1][2] - tmp[0][2]);

        System.out.println((rst >= 0) ? rst : rst + 24 * 60 * 60);
        scanner.close();
    }
}
