/*
 * 제출 번호: 43353286
 * ID: adviate
 * 문제: 15881
 * 결과: 맞았습니다!!
 * 메모리: 63308 KB
 * 시간: 296 ms
 * 언어: Java 11
 * 코드 길이: 417 B
 */

import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.valueOf(reader.readLine()), cnt = 0;
		String input = reader.readLine();
		
		for(int i = 0; i < (N - 3); i++) {
			if(input.subSequence(i, i + 4).equals("pPAp")) { cnt++; i += 3; }
		}
		System.out.println(cnt);
	}
}
