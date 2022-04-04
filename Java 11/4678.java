/*
 * 제출 번호: 41507491
 * ID: adviate
 * 문제: 4678
 * 결과: 맞았습니다!!
 * 메모리: 14008 KB
 * 시간: 124 ms
 * 언어: Java 11
 * 코드 길이: 489 B
 */

import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		while(true) {
			String input = reader.readLine();
			if(input.equals("0")) { break; }
			
			long sum = 0, pow = (long) Math.pow(2, input.length());
			for(int i = 0; i < input.length(); i++) {
				sum += (input.charAt(i) - '0') * (pow - 1);
				pow = pow >>> 1;
			}
			System.out.println(sum);
		}
	}
}
