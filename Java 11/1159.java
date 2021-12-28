/*
 * 제출 번호: 36744198
 * ID: adviate
 * 문제: 1159
 * 결과: 맞았습니다!!
 * 메모리: 18548 KB
 * 시간: 240 ms
 * 언어: Java 11
 * 코드 길이: 611 B
 */

import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] alphabetNum = new int[26];
		
		int testCases = scanner.nextInt();
		for(int i = 0; i < testCases; i++) {
			String firstName = scanner.next();
			char c = firstName.charAt(0);
			alphabetNum[c - 97]++;
		}
		
		String rst = "";
		for(int i = 0; i < 26; i++) {
			if(alphabetNum[i] >= 5) {
				rst = new String(rst + (char) ('a' + i));
			}
		}
		
		if(rst.length() > 0) {
			System.out.println(rst);
		} else {
			System.out.println("PREDAJA");
		}
		
		scanner.close();
	}
}
