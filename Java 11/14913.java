/*
 * 제출 번호: 37170776
 * ID: adviate
 * 문제: 14913
 * 결과: 맞았습니다!!
 * 메모리: 17732 KB
 * 시간: 204 ms
 * 언어: Java 11
 * 코드 길이: 362 B
 */

import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt(), d = scanner.nextInt(), k = scanner.nextInt();
		
		if((k - a) % d  !=  0 || ((k - a) / d) < 0) {
			System.out.println("X");
		} else {
			System.out.println((k - a) / d + 1);
		}
		
		scanner.close();
	}
}
