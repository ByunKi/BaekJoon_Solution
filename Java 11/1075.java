/*
 * 제출 번호: 36668050
 * ID: adviate
 * 문제: 1075
 * 결과: 맞았습니다!!
 * 메모리: 17732 KB
 * 시간:  208 ms
 * 언어: Java 11
 * 코드 길이: 369 B
 */

import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int N = scanner.nextInt() / 100 * 100;
		int F = scanner.nextInt();
		int tmp = 0;
		
		for(int i = 0; i < 100; i++) {
			tmp = N;
			if((tmp += i) % F == 0) {
				System.out.printf("%02d", i);
				break;
			}
		}
		scanner.close();
	}
}
