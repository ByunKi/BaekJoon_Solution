/*
 * 제출 번호: 36669405
 * ID: adviate
 * 문제: 1252
 * 결과: 런타임 에러 (NumberFormat)
 * 메모리:  KB
 * 시간:   ms
 * 언어: Java 11
 * 코드 길이: 303 B
 */

import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String a = scanner.next();
		String b = scanner.next();

		System.out.println(Integer.toBinaryString(Integer.valueOf(a, 2) + Integer.valueOf(b, 2)));
		scanner.close();
	}
}
