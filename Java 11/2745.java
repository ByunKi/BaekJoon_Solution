/*
 * 제출 번호: 39746401
 * ID: adviate
 * 문제: 2745
 * 결과: 맞았습니다!!
 * 메모리: 14320 KB
 * 시간: 128 ms
 * 언어: Java 11
 * 코드 길이: 506 B
 */

import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		String[] input = reader.readLine().split(" ");
		String N = input[0];
		int B = Integer.valueOf(input[1]);
		long ans = 0;
		
		for(int i = 0; i < N.length(); i++) {
			if(N.charAt(i) - '0' >= 10) { ans =  ans * B + (N.charAt(i) - 55); }
			else { ans = ans * B + (N.charAt(i) - '0'); }
		}
		System.out.println(ans);
	}
}
