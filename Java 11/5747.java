/*
 * 제출 번호: 45347909
 * ID: adviate
 * 문제: 5747
 * 결과: 맞았습니다!!
 * 메모리: 14384 KB
 * 시간: 128 ms
 * 언어: Java 11
 * 코드 길이: 666 B
 */

import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		while(true) {
			int N = Integer.valueOf(reader.readLine());
			if(N == 0) { break; }
			
			int tmp, even = 0, odd = 0;
			String[] input = reader.readLine().split(" ");
			for(int i = 0; i < N; i++) {
				tmp = Integer.valueOf(input[i]);
				if(tmp % 2 == 0) { even++; }
			}
			
			input = reader.readLine().split(" ");
			for(int i = 0; i < N; i++) {
				tmp = Integer.valueOf(input[i]);
				if(tmp % 2 != 0) { odd++; }
			}
			System.out.println(Math.abs(odd - even));
		}
	}
}
