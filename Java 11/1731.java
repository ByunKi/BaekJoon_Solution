/*
 * 제출 번호: 37239793
 * ID: adviate
 * 문제: 1731
 * 결과: 맞았습니다!!
 * 메모리: 17724 KB
 * 시간: 212 ms
 * 언어: Java 11
 * 코드 길이: 471 B
 */

import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		int[] arr = new int[N];
		
		for(int i = 0; i < N; i++) {
			arr[i] = scanner.nextInt();
		}
		
		if(arr[2] == arr[1] + (arr[1] - arr[0])) {
			System.out.println(arr[arr.length - 1] + (arr[1] - arr[0]));
		} else {
			System.out.println(arr[arr.length - 1] * (arr[1] / arr[0]));
		}
		
		scanner.close();
	}
}
