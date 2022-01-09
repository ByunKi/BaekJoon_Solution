/*
 * 제출 번호: 37282055
 * ID: adviate
 * 문제: 3058
 * 결과: 맞았습니다!!
 * 메모리: 27404 KB
 * 시간: 432 ms
 * 언어: Java 11
 * 코드 길이: 455 B
 */

import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int TC = scanner.nextInt();
		for(int i = 0; i < TC; i++) {
			int min = 101, sum = 0;
			
			for(int j = 0; j < 7; j++) {
				int input = scanner.nextInt();
				
				if(input % 2 == 0) {
					sum += input;
					if(min > input) { min = input; }
				}
			}
			System.out.println(sum + " " + min);
		}
		scanner.close();
	}
}
