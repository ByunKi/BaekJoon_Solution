/*
 * 제출 번호: 40663285
 * ID: adviate
 * 문제: 24830
 * 결과: 맞았습니다!!
 * 메모리: 15536 KB
 * 시간: 196 ms
 * 언어: Java 11
 * 코드 길이: 705 B
 */

import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		int TC = Integer.valueOf(reader.readLine());
		long prev = 1;
		for(int i = 0; i < TC; i++) {
			String[] input = reader.readLine().split(" ");
			int A = Integer.valueOf(input[0]), B = Integer.valueOf(input[2]);
			long ans = 0;
			
			switch(input[1]) {
				case "+": ans = (A + B) - prev; break;
				case "-": ans = (A - B) * prev; break;
				case "*": ans = (long) Math.pow(A * B, 2); break;
				case "/": ans = (A % 2 == 0) ? (A / 2) : ((A + 1) / 2); break;
			}
			
			System.out.println(ans);
			prev = ans;
		}
	}
}
