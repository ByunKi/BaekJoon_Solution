/*
 * 제출 번호: 38903319
 * ID: adviate
 * 문제: 4619
 * 결과: 맞았습니다!!
 * 메모리: 14040 KB
 * 시간: 484 ms
 * 언어: Java 11
 * 코드 길이: 597 B
 */

import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		while(true) {
			String[] input = reader.readLine().split(" ");
			int B = Integer.parseInt(input[0]), N = Integer.parseInt(input[1]);
			
			if(B == 0 && N == 0) { break; }
			
			int diff, min = 1000000, ans = 0;
			for(int i = 0; Math.pow(i, N) < 2000000; i++) {
				diff = (int) Math.abs(Math.pow(i, N) - B);
				if(diff < min) {
					min = diff;
					ans = i;
				}
			}
			System.out.println(ans);
		}
	}
}
