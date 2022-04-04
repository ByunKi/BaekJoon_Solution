/*
 * 제출 번호: 41507545
 * ID: adviate
 * 문제: 4673
 * 결과: 맞았습니다!!
 * 메모리: 14592 KB
 * 시간: 148 ms
 * 언어: Java 11
 * 코드 길이: 608 B
 */

import java.io.*;

public class Main {
	public static int func(int N) {
		int sum = N;
		while(N != 0) {
			sum += (N % 10);
			N /= 10;
		}
		return sum;
	}
	
	public static void main(String[] args) throws IOException{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder ans = new StringBuilder();
		boolean[] checks = new boolean[10001];
		
		for(int i = 1; i < 10001; i++) {
			int num = func(i);
			if(num < 10001) { checks[num] = true; }
		}
		
		for(int i = 1; i < 10001; i++) {
			if(!checks[i]) { ans.append(i + "\n"); }
		}
		System.out.println(ans);
	}
}
