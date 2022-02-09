/*
 * 제출 번호: 38790214
 * ID: adviate
 * 문제: 3448
 * 결과: 맞았습니다!!
 * 메모리: 16188 KB
 * 시간: 148 ms
 * 언어: Java 11
 * 코드 길이: 794 B
 */

import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		int TC = Integer.parseInt(reader.readLine());
		for(int i = 0; i < TC; i++) {
			String input = new String();
			double R = 0, A = 0;
			 
			 while((input = reader.readLine()) != null) {
				 if(input.length() < 1) { break; }
				 
				 for(int j = 0; j < input.length(); j++) {
					 if(input.charAt(j) == '#') { R++; }
				 }
				 A += input.length();
			 }
			 
			 double ans = Math.round((A-R)/A * 1000) / 1000.0 * 100;
			 if((int)ans == ans) { System.out.println("Efficiency ratio is "+ (int)ans + "%."); }
			 else { System.out.println(String.format("Efficiency ratio is %.1f", ans) + "%."); }
		}
	}
}
