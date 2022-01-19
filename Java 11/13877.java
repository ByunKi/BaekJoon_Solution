/*
 * 제출 번호: 37795295
 * ID: adviate
 * 문제: 13877
 * 결과: 맞았습니다!!
 * 메모리: 18656 KB
 * 시간: 256 ms
 * 언어: Java 11
 * 코드 길이: 631 B
 */

import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int T = scanner.nextInt();
		
		for(int i = 0; i < T; i++) {
			int K = scanner.nextInt();
			String input = scanner.next();
			
			boolean isDisplay = true;
			if(input.contains("8") || input.contains("9")) { isDisplay = false; }
			System.out.print((K) + " ");
			if(!isDisplay) {
				System.out.print(0 + " ");
			} else {
				System.out.print(Integer.parseInt(input, 8) + " ");
			}
			
			System.out.println(Integer.parseInt(input) + " " + Integer.parseInt(input, 16));
		}
		scanner.close();
	}
}
