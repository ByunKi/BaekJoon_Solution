/*
 * 제출 번호: 35933376
 * ID: adviate
 * 문제: 11320
 * 결과: 맞았습니다!!
 * 메모리: 17868 KB
 * 시간:  228 ms
 * 언어: Java 11
 * 코드 길이: 335 B
 */

import java.util.*;

public class Main {	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int testCases = scanner.nextInt();
		for(int i = 0; i < testCases; i++) {
			int a = scanner.nextInt();
			int b = scanner.nextInt();
			System.out.println((a*a) / (b*b));
		}
		
		scanner.close();
	}
}
