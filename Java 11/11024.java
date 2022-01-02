/*
 * 제출 번호: 36938764
 * ID: adviate
 * 문제: 11024
 * 결과: 맞았습니다!!
 * 메모리: 18340 KB
 * 시간: 304 ms
 * 언어: Java 11
 * 코드 길이: 456 B
 */

import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int TC = scanner.nextInt();
		scanner.nextLine();
		
		for(int i = 0; i < TC; i++) {
			String input = scanner.nextLine();
			String[] tmp = input.split(" ");
			int sum = 0;
			
			for(int j = 0; j < tmp.length; j++) {
				sum += Integer.parseInt(tmp[j]);
			}
			
			System.out.println(sum);
		}
		
		scanner.close();
	}
}
