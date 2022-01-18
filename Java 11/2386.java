/*
 * 제출 번호: 37746834
 * ID: adviate
 * 문제: 2386
 * 결과: 맞았습니다!!
 * 메모리: 18304 KB
 * 시간: 236 ms
 * 언어: Java 11
 * 코드 길이: 481 B
 */

import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			char ch = scanner.next().charAt(0);
			if(ch == '#') { break; }
			
			String input = scanner.nextLine();
			int cnt = 0;
			for(int i = 0; i < input.length(); i++) {
				if(input.charAt(i) == ch || input.charAt(i) == Character.toUpperCase(ch)) { cnt++; }
			}
			
			System.out.println(ch + " " + cnt);
		}	
		scanner.close();
	}
}
