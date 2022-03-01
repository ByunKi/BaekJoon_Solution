/*
 * 제출 번호: 39764861
 * ID: adviate
 * 문제: 11005
 * 결과: 맞았습니다!!
 * 메모리: 16776 KB
 * 시간: 192 ms
 * 언어: Java 11
 * 코드 길이: 487 B
 */

import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String ans = new String();
		
		String[] input = reader.readLine().split(" ");
		long N = Long.valueOf(input[0]);
		int B = Integer.valueOf(input[1]);
		
		while(N != 0) {
			if(N % B >= 10) { ans = (char)(N % B + 55) + ans; }
			else { ans = (N % B) + ans; }
			N /= B;
		}
		System.out.println(ans);
	}
}
