/*
 * 제출 번호: 38090397
 * ID: adviate
 * 문제: 2774
 * 결과: 맞았습니다!!
 * 메모리: 14012 KB
 * 시간: 128 ms
 * 언어: Java 11
 * 코드 길이: 497 B
 */

import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		int TC = Integer.parseInt(reader.readLine());
		for(int i = 0; i < TC; i++) {
			int cnt = 0, num = Integer.parseInt(reader.readLine());	
			boolean[] check = new boolean[10];
			while(num != 0) {
				if(!check[num % 10]) { check[num % 10] = true; cnt++; }
				num /= 10;
			}
			System.out.println(cnt);
		}
 	}
}
