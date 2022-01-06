/*
 * 제출 번호: 37161945
 * ID: adviate
 * 문제: 10474
 * 결과: 맞았습니다!!
 * 메모리: 23420 KB
 * 시간: 408 ms
 * 언어: Java 11
 * 코드 길이: 566 B
 */

import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int numerator = -1, denominator = -1;
		
		while(true) {
			numerator = scanner.nextInt();
			denominator = scanner.nextInt();
			if(numerator == 0 && denominator == 0) {
				break;
			}
			
			if(numerator >= denominator) {
				System.out.println(numerator/denominator + " " + numerator%denominator + " / " + denominator );
			} else {
				System.out.println(0 + " " + numerator + " / " + denominator );
			}
		}
		scanner.close();
	}
}
