/*
 * 제출 번호: 36755336
 * ID: adviate
 * 문제: 1598
 * 결과: 맞았습니다!!
 * 메모리: 17676 KB
 * 시간: 200 ms
 * 언어: Java 11
 * 코드 길이: 300 B
 */

import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		
		System.out.println(Math.abs(((a-1)/4) - ((b-1)/4)) + Math.abs(((a-1)%4) - ((b-1)%4)));
		scanner.close();
	}
}
