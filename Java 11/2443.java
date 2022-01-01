/*
 * 제출 번호: 36904734
 * ID: adviate
 * 문제: 2443
 * 결과: 맞았습니다!!
 * 메모리: 23860 KB
 * 시간: 440 ms
 * 언어: Java 11
 * 코드 길이: 443 B
 */

import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int input = scanner.nextInt();
		int cnt = 2 * input - 1;
		int i,j,k = cnt,l;
		
		for(i = 0; i < input; i++) {
			for(j = k; j < i; j++) {
				System.out.print(" ");
			}
			
			for(k = cnt; k > 0; k--) {
				System.out.print("*");
			}
			
			System.out.println();
			cnt -= 2;
		}
		
		scanner.close();
	}
}
