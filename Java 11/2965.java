// 제출 번호: 35385306
// 아이디: adviate
// 문제: 2965
// 문제 제목: 캥거루 세마리
// 결과: 맞았습니다!!
// 메모리: 17812KB
// 시간: 208ms
// 언어: Java 11
// 코드 길이: 684B
// 제출한 시간: 2021.11.13 18:42:59

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[3];
        int rst = 0;

        for(int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
        Arrays.sort(arr);

        if((arr[1] - arr[0]) == 1 && (arr[2] - arr[1]) == 1) {
            rst = 0;
        }
        else {
            if(arr[1] - arr[0] > arr[2] - arr[1]) {
                rst = arr[1] - arr[0] - 1;
            }
            else {
                rst = arr[2] - arr[1] - 1;
            }
        }

        System.out.println(rst);
        scanner.close();
    }
}
