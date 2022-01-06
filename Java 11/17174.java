/*
 * 제출 번호: 37164253
 * ID: adviate
 * 문제: 17174
 * 결과: 맞았습니다!!
 * 메모리: 17672 KB
 * 시간: 208 ms
 * 언어: Java 11
 * 코드 길이: 290 B
 */

import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt(), b = scanner.nextInt(), sum = a;
		
		while(a >= b) {
			a /= b;
			sum += a;
		}
		
		System.out.println(sum);
		scanner.close();
	}
}
