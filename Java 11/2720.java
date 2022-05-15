/*
 * 제출 번호: 43318082
 * ID: adviate
 * 문제: 2720
 * 결과: 맞았습니다!!
 * 메모리: 14560 KB
 * 시간: 152 ms
 * 언어: Java 11
 * 코드 길이: 533 B
 */

import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder ans = new StringBuilder();
		
		int TC = Integer.valueOf(reader.readLine());
		for(int i = 0; i < TC; i++) {
			int N = Integer.valueOf(reader.readLine());
			
			ans.append((N / 25) + " "); N %= 25;
			ans.append((N / 10) + " "); N %= 10;
			ans.append((N / 5) + " "); N %= 5;
			ans.append(N + "\n");
		}
		System.out.println(ans);
	}
}
