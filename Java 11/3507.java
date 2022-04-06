/*
 * 제출 번호: 41571365
 * ID: adviate
 * 문제: 3507
 * 결과: 맞았습니다!!
 * 메모리: 14104 KB
 * 시간: 124 ms
 * 언어: Java 11
 * 코드 길이: 400 B
 */

import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.valueOf(reader.readLine()), cnt = 0;
		if(N <= 198) {
			for(int i = 1; i <= 99; i++) {
				for(int j = 1; j <= 99; j++) {
					if(i + j == N) { cnt++; }
				}
			}
		}
		System.out.println(cnt);
	}
}
