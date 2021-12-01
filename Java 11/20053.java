/*
 * 제출 번호: 35932990
 * ID: adviate
 * 문제: 20053
 * 결과: 맞았습니다!!
 * 메모리: 312152 KB
 * 시간:  2916 ms
 * 언어: Java 11
 * 코드 길이: 521 B
 */

import java.util.*;

public class Main {	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int testCases = scanner.nextInt();
		for(int i = 0; i < testCases; i++) {
			int num = scanner.nextInt();
			int max = -1000000, min = 1000000;
			for(int j = 0; j < num; j++) {
				int input = scanner.nextInt();
				if(input > max) {
					max = input;
				}
				if(input < min) {
					min = input;
				}
			}
			
			System.out.println(min + " " + max);
			
		}
		
		scanner.close();
	}
}
