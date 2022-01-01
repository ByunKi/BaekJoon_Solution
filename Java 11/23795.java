/*
 * 제출 번호: 36916506
 * ID: adviate
 * 문제: 23795
 * 결과: 맞았습니다!!
 * 메모리: 21492 KB
 * 시간: 280 ms
 * 언어: Java 11
 * 코드 길이: 306 B
 */

import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int sum = 0;
		
		while(true) {
			int input = scanner.nextInt();
			if(input < 0) {
				break;
			}
	
			sum += input;
		}
		
		System.out.println(sum);
		scanner.close();
	}
}
