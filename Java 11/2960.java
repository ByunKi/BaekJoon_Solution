/*
 * 제출 번호: 41841728
 * ID: adviate
 * 문제: 2960
 * 결과: 맞았습니다!!
 * 메모리: 16220 KB
 * 시간: 160 ms
 * 언어: Java 11
 * 코드 길이: 585 B
 */

import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		String[] input = reader.readLine().split(" ");
		int N = Integer.valueOf(input[0]), K =  Integer.valueOf(input[1]), cnt = 0;
		
		boolean[] prime = new boolean[N + 1];
		for(int i = 2; i <= N; i++) {
			if(prime[i]) { continue; }
			for(int j = i; j <= N; j += i) {
				if(!prime[j]) { 
					cnt++;
					prime[j] = true;
				}
				if(cnt == K) { System.out.println(j); System.exit(0); }
			}
		}
	}
}
