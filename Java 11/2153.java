/*
 * 제출 번호: 42832616
 * ID: adviate
 * 문제: 2153
 * 결과: 맞았습니다!!
 * 메모리: 14312 KB
 * 시간: 128 ms
 * 언어: Java 11
 * 코드 길이: 629 B
 */

import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		int sum = 0;
		boolean flag = false;
		String input = reader.readLine();
		for(int i = 0; i < input.length(); i++) {
			if(Character.isUpperCase(input.charAt(i))) { sum += (input.charAt(i) - 'A' + 27); }
			else { sum += (input.charAt(i) - 'a' + 1); }
		}

		for(int i = 2; i <= (sum / 2); i++) {
			if(sum % i == 0) {
				flag = true;
				break;
			}
		}
		
		System.out.println(!flag ? "It is a prime word." : "It is not a prime word.");
	}
}
