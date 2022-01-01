/*
 * 제출 번호: 36905720
 * ID: adviate
 * 문제: 2445
 * 결과: 맞았습니다!!
 * 메모리: 23876 KB
 * 시간: 624 ms
 * 언어: Java 11
 * 코드 길이: 656 B
 */

import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int n = scanner.nextInt();
		for (int i = 1; i <= n; i++) {
			for (int j = i; j > 0; j--) System.out.print("*");
			for (int k = 2 * n - 2 * i; k > 0;k--) System.out.print(" ");
			for (int l = i; l > 0; l--) System.out.print("*");
			System.out.println();
		}

		for (int i = n-1; i > 0; i--) {
			for (int j = i; j > 0; j--) System.out.print("*");
			for (int k = 2 * n - 2 * i; k > 0; k--) System.out.print(" ");
			for (int l = i; l > 0; l--) System.out.print("*");
			System.out.println();
		}	
		scanner.close();
	}
}
