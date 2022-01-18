/*
 * 제출 번호: 37751168
 * ID: adviate
 * 문제: 2744
 * 결과: 맞았습니다!!
 * 메모리: 17640 KB
 * 시간: 208 ms
 * 언어: Java 11
 * 코드 길이: 423 B
 */

import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String input = scanner.next();
		scanner.close();
		
		for(int i = 0; i < input.length(); i++) {
			if(Character.isLowerCase(input.charAt(i))) {
				System.out.print(Character.toUpperCase(input.charAt(i)));
			} else {
				System.out.print(Character.toLowerCase(input.charAt(i)));
			}
		}
	}
}
