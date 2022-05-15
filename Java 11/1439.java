/*
 * 제출 번호: 43317805
 * ID: adviate
 * 문제: 1439
 * 결과: 맞았습니다!!
 * 메모리: 14268 KB
 * 시간: 124 ms
 * 언어: Java 11
 * 코드 길이: 549 B
 */

import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		String input = reader.readLine();
		int one = 0, zero = 0;
		
		char prev = input.charAt(0);
		if(prev == '1') { one++; }
		else { zero++; }
		
		for(int i = 0; i < input.length(); i++) {
			char now = input.charAt(i);
			if(now != prev) {
				if(now == '1') { one++; }
				else { zero++; }
			}
			prev = now;
		}
		
		System.out.println(Math.min(one, zero));
	}
}
