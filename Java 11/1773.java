/*
 * 제출 번호: 37257436
 * ID: adviate
 * 문제: 1773
 * 결과: 맞았습니다!!
 * 메모리: 18748 KB
 * 시간: 744 ms
 * 언어: Java 11
 * 코드 길이: 694 B
 */

import java.util.*;

public class Main {
    public static void main(String[] args) {
    	Scanner scanner = new Scanner(System.in);
    	int N = scanner.nextInt();
    	int C = scanner.nextInt();
    	
    	int[] arr = new int[N];
    	for(int i = 0; i < N; i++) {
    		arr[i] = scanner.nextInt();
    	}
    	scanner.close();
    	
        int count = 0;
        for (int i = 1; i <= C; i++) {
            boolean isBomb = false;
            for (int j = 0; j < N; j++) {
                if (i % arr[j] == 0) {
                    isBomb = true;
                    break;
                }
            }
            
            if (isBomb) count++;
        }
        System.out.println(count);
    }
}
