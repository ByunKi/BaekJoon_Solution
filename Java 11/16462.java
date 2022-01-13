/*
 * 제출 번호: 37487126
 * ID: adviate
 * 문제: 16462
 * 결과: 맞았습니다!!
 * 메모리: 20096 KB
 * 시간: 300 ms
 * 언어: Java 11
 * 코드 길이: 507 B
 */

import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int TC = scanner.nextInt(), sum = 0;
		scanner.nextLine();
		
		for(int i = 0; i < TC; i++) {
			String input = scanner.next();
			input = input.replaceAll("0", "9");	input = input.replaceAll("6", "9");
			if(Integer.parseInt(input) > 100) {	input = "100"; }
			sum += Integer.parseInt(input);
		}
		scanner.close();
		System.out.println((int) Math.round((double) sum/TC));
	}
}
