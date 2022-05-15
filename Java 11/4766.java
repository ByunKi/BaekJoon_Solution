/*
 * 제출 번호: 43352608
 * ID: adviate
 * 문제: 4766
 * 결과: 맞았습니다!!
 * 메모리: 14396 KB
 * 시간: 132 ms
 * 언어: Java 11
 * 코드 길이: 478 B
 */

import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder ans = new StringBuilder();
		
		String input;
		double prev = Double.valueOf(reader.readLine()), T;
		while(!(input = reader.readLine()).equals("999")) {
			T = Double.valueOf(input);
			ans.append(String.format("%.2f \n", T - prev));
			prev = T;
		}
		System.out.println(ans);
	}
}
