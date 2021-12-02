/*
 * 제출 번호: 35961248
 * ID: adviate
 * 문제: 14579
 * 결과: 맞았습니다!!
 * 메모리: 17648 KB
 * 시간:  216 ms
 * 언어: Java 11
 * 코드 길이: 432 B
 */

import java.util.*;

public class Main {	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		long rst = 1;
		
		for(int i = 1; i <= b; i++) {
			int sum = 0;
			if(a <= b) {
				for(int j = 1; j <= a; j++) {
					sum += j;
				}
				rst *= sum;
				rst %= 14579;
			}
			
			a++;
		}
		
		System.out.println(rst);
		scanner.close();
	}
}
