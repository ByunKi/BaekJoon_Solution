/*
 * 제출 번호: 40047476
 * ID: adviate
 * 문제: 5032
 * 결과: 맞았습니다!!
 * 메모리: 14100 KB
 * 시간: 120 ms
 * 언어: Java 11
 * 코드 길이: 452 B
 */

import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		String[] input = reader.readLine().split(" ");
		int E = Integer.valueOf(input[0]), F = Integer.valueOf(input[1]), C = Integer.valueOf(input[2]), S = E + F, ans = 0;
		
		while(S >= C) {
			ans += S / C;
			S = (S / C) + (S % C);
		}
	
		System.out.println(ans);
	}
}
