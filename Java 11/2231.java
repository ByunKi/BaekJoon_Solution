/*
 * 제출 번호: 40952017
 * ID: adviate
 * 문제: 2231
 * 결과: 맞았습니다!!
 * 메모리: 14216 KB
 * 시간: 124 ms
 * 언어: Java 11
 * 코드 길이: 486 B
 */

import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		String input = reader.readLine();
		int N = Integer.valueOf(input), length = input.length(), ans = 0;
		for(int i = (N - length * 9); i < N; i++) {
			int tmp = i, sum = 0;
			while(tmp != 0) { sum += (tmp % 10); tmp /= 10; }
			if(sum + i == N) { ans = i; break; }
		}
		System.out.println(ans);
	}
}
