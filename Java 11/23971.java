/*
 * 제출 번호: 37160485
 * ID: adviate
 * 문제: 23971
 * 결과: 맞았습니다!!
 * 메모리: 17684 KB
 * 시간: 204 ms
 * 언어: Java 11
 * 코드 길이: 343 B
 */

import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		long H = scanner.nextLong(), W = scanner.nextLong(), N = scanner.nextLong(), M = scanner.nextLong();
		System.out.println((int)(Math.ceil((double)H / (N+1)) * Math.ceil((double)W / (M+1))));
		scanner.close();
	}
}
