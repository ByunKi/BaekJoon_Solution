/*
 * 제출 번호: 37849934
 * ID: adviate
 * 문제: 4592
 * 결과: 맞았습니다!!
 * 메모리: 18472 KB
 * 시간: 240 ms
 * 언어: Java 11
 * 코드 길이: 498 B
 */

import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			int N = scanner.nextInt();
			if(N == 0) { break; }
			
			int[] arr = new int[N];
			arr[0] = scanner.nextInt();
			System.out.print(arr[0] + " ");
			for(int i = 1; i < N; i++) {
				int num = scanner.nextInt();
				if(arr[i-1] != num) { System.out.print(num + " "); }
				arr[i] = num;
			}
			System.out.println("$");
		}
		scanner.close();
	}
}
