/*
 * 제출 번호: 35898301
 * ID: adviate
 * 문제: 9094
 * 결과: 맞았습니다!!
 * 메모리: 49272 KB
 * 시간:  940 ms
 * 언어: Java 11
 * 코드 길이: 481 B
 */

import java.util.*;

public class Main {	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int testCase = scanner.nextInt();
		
		for(int i = 0; i < testCase; i++) {
			int cnt = 0;
			int n = scanner.nextInt();
			int m = scanner.nextInt();
			
			for(int a = 1; a < n; a++) {
				for(int b = a+1; b < n; b++) {
					if((a*a+b*b+m) % (a*b) == 0) {
						cnt++;
					}
				}
			}
			
			System.out.println(cnt);
		}
		
		scanner.close();
	}
}
