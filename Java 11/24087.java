/*
 * 제출 번호: 38153801
 * ID: adviate
 * 문제: 24087
 * 결과: 맞았습니다!!
 * 메모리: 14240 KB
 * 시간: 132 ms
 * 언어: Java 11
 * 코드 길이: 415 B
 */

import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int S = Integer.parseInt(reader.readLine()), A = Integer.parseInt(reader.readLine()), B  = Integer.parseInt(reader.readLine());
		
		int price = 250;
		while(S > A) {
			A += B;
			price += 100;
		}
		System.out.println(price);
 	}
}
