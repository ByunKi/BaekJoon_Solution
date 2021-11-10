// 제출 번호: 35267213
// 아이디: adviate
// 문제: 4880
// 문제 제목: 다음수
// 결과: 맞았습니다!!
// 메모리: 22216KB
// 시간: 344ms
// 언어: Java 11
// 코드 길이: 756B
// 제출한 시간: 2021.11.10 11:22:20

import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[3];
        int rst = 0;

        while (true) {
            for (int i = 0; i < 3; i++) {
                arr[i] = scanner.nextInt();
            }

            if(arr[0] == 0 && arr[1] == 0 && arr[2] == 0) {
                break;
            }

            if((arr[0] + arr[2]) == arr[1] * 2) {
                rst = arr[2] + (arr[1] - arr[0]);
                System.out.println("AP " + rst);
            }
            else if(arr[1] * arr[1] == arr[2] * arr[0]) {
                rst = arr[2] * (arr[1] / arr[0]);
                System.out.println("GP " + rst);
            }
        }
    }
}
