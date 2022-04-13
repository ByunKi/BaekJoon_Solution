/*
 * 제출 번호: 41943077
 * ID: adviate
 * 문제: 24831
 * 결과: 맞았습니다!!
 * 메모리: 16356 KB
 * 시간: 208 ms
 * 언어: Java 11
 * 코드 길이: 571 B
 */

import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		int TC = Integer.valueOf(reader.readLine());
		for(int i = 0; i < TC; i++) {
			String[] input = reader.readLine().split(" ");
			int a = Integer.valueOf(input[0]), b = Integer.valueOf(input[1]), c = Integer.valueOf(input[2]), d = Integer.valueOf(input[3]);
			b -= a;
			c += d;
			
			if(b % c != 0 || c > b) { System.out.println(-1); }
			else { System.out.println(b / c); }
		}
	}
}
