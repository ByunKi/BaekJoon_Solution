// 제출 번호: 35127745
// 아이디: adviate
// 문제: 2501
// 문제 제목: 약수 구하기
// 결과: 맞았습니다!!
// 메모리: 17820KB
// 시간: 232ms
// 언어: Java 11
// 코드 길이: 466B
// 제출한 시간: 2021.11.06 13:10:14

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int idx = scanner.nextInt();

        int[] arr = new int[num];
        int c = 0;

        for(int i = 1; i <= num; i++) {
            if((num % i) == 0) {
                arr[c++] = i;
            }
        }

        System.out.println(arr[idx - 1]);
        scanner.close();
    }
}
