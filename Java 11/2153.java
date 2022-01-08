/*
 * 제출 번호: 37237691
 * ID: adviate
 * 문제: 2153
 * 결과: 맞았습니다!!
 * 메모리: 17576 KB
 * 시간: 196 ms
 * 언어: Java 11
 * 코드 길이: 703 B
 */

import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String input = scanner.next();
		int sum = 0;
		boolean flag = false;
		
		char[] inputAlpha = input.toCharArray();
		for(int i = 0; i < inputAlpha.length; i++) {
			if(Character.isUpperCase(inputAlpha[i])) {
				sum += ((int)(inputAlpha[i] - 'A') + 1);
			} else {
				sum += ((int)(inputAlpha[i] - 'a') + 1);
			}
		}
		
		for(int i = 2; i <= sum / 2; ++i) {
			if(sum % i == 0) {
				flag = true;
				break;
			}
		}
		
		if(!flag) {
			System.out.println("It is a prime word.");
		} else {
			System.out.println("It is not a prime word.");
		}
		
		scanner.close();
	}
}
