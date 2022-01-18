/*
 * 제출 번호: 37743949
 * ID: adviate
 * 문제: 2145
 * 결과: 맞았습니다!!
 * 메모리: 17576 KB
 * 시간: 200 ms
 * 언어: Java 11
 * 코드 길이: 503 B
 */

import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			String input = scanner.next();
			if(input.equals("0")) { break; }
			
			while(input.length() > 1) {
				int sum = 0;
				String[] tmp = input.split("");
				for(int i = 0; i < tmp.length; i++) {
					sum += Integer.parseInt(tmp[i]);
				}
				input = Integer.toString(sum);
			}
			System.out.println(input);
		}
		scanner.close();
	}
}
