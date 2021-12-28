/*
 * 제출 번호: 36748285
 * ID: adviate
 * 문제: 1233
 * 결과: 맞았습니다!!
 * 메모리: 17648 KB
 * 시간: 204 ms
 * 언어: Java 11
 * 코드 길이: 575 B
 */

import java.util.*;

public class Main {
	public static void main(String[] args) {
		int[] arr = new int [81];
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();
		
		for(int i = 1; i <= a; i++) {
			for(int j = 1; j <= b; j++) {
				for(int k = 1; k <= c; k++) {
					arr[i+j+k]++; 
				}
			}
		}
		
		int maxIdx = 0, max = arr[0];
		for(int i = 0; i < arr.length; i++) {
			if(max < arr[i]) {
				max = arr[i];
				maxIdx = i;
			}
		}
		
		System.out.println(maxIdx);
		scanner.close();
	}
}
