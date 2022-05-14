/*
 * 제출 번호: 43313496
 * ID: adviate
 * 문제: 14912
 * 결과: 맞았습니다!!
 * 메모리: 20420 KB
 * 시간: 192 ms
 * 언어: Java 11
 * 코드 길이: 499 B
 */

import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		String[] input = reader.readLine().split(" ");
		int N = Integer.valueOf(input[0]), cnt = 0;
		char K = input[1].charAt(0);
		
		for(int i = 1; i <= N; i++) {
			String str = String.valueOf(i);
			for(int j = 0; j < str.length(); j++) {
				if(str.charAt(j) == K) { cnt++; }
			}
		}
		System.out.println(cnt);
	}
}
