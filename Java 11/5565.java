/*
 * 제출 번호: 35808261
 * ID: adviate
 * 문제: 5565
 * 결과: 맞았습니다!!
 * 메모리: 17596KB
 * 시간:  212ms
 * 언어: Java 11
 * 코드 길이: 310B
 */

import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int totalPrice = scanner.nextInt();
		int sum = 0;
		for(int i = 0; i < 9; i++) {
			sum += scanner.nextInt();
		}
		
		System.out.println(totalPrice - sum);
		scanner.close();
	}
}
