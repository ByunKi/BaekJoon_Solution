// 제출 번호: 35231921
// 아이디: adviate
// 문제: 2783
// 문제 제목: 삼각 김밥
// 결과: 맞았습니다!!
// 메모리: 17948KB
// 시간: 220ms
// 언어: Java 11
// 코드 길이: 589B
// 제출한 시간: 2021.11.09 12:59:06

import java.util.*;

class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int gram = scanner.nextInt();
        int price = scanner.nextInt();

        int n = scanner.nextInt();
        double[] arr = new double[n + 1];

        arr[0] = (double) gram / price;

        for (int i = 0; i < n; i++) {
            int _gram = scanner.nextInt();
            int _price = scanner.nextInt();

            arr[i+1] = (double) _gram / _price;
        }
        Arrays.sort(arr);
        System.out.println(arr[0] * 1000);

    }
}
