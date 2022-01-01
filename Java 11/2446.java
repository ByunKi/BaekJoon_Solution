/*
 * 제출 번호: 36905785
 * ID: adviate
 * 문제: 2446
 * 결과: 맞았습니다!!
 * 메모리: 21196 KB
 * 시간: 488 ms
 * 언어: Java 11
 * 코드 길이: 549 B
 */

import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int n = scanner.nextInt();
		for (int i = 1; i <= n; i++) {
			for (int j = i-1; j > 0; j--) System.out.print(" ");
			for (int k=2*n-i*2+1; k > 0; k--) System.out.print("*");
			System.out.println();
		}

		for (int i = n-1; i > 0; i--) {
			for (int j = i-1; j > 0; j--) System.out.print(" ");
			for (int k = 2 * n - 2 * i+1; k > 0; k--) System.out.print("*");
			System.out.println();
		}	
		scanner.close();
	}
}
