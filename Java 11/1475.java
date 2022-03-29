/*
 * 제출 번호: 41189944
 * ID: adviate
 * 문제: 1475
 * 결과: 맞았습니다!!
 * 메모리: 14260 KB
 * 시간: 128 ms
 * 언어: Java 11
 * 코드 길이: 535 B
 */

import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String input = reader.readLine();
		
		int[] set = new int[10];
		for(int i = 0; i < input.length(); i++) { set[input.charAt(i) - '0']++; }
		
		int ans = 0;
		for(int i = 0; i < set.length; i++) {
			if(i == 6 || i == 9) { continue; }
			else { ans = Math.max(ans, set[i]); }
		}
		
		System.out.println(Math.max(ans, ((set[6] + set[9] + 1) / 2)));
	}
}
