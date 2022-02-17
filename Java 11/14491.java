/*
 * 제출 번호: 39200861
 * ID: adviate
 * 문제: 14491
 * 결과: 맞았습니다!!
 * 메모리: 16120 KB
 * 시간: 168 ms
 * 언어: Java 11
 * 코드 길이: 346 B
 */

import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String ans = new String();
		
		int T = Integer.parseInt(reader.readLine());
		while(T > 0) {
			ans = (T % 9) + ans;
			T /= 9;
		}
		System.out.println(ans);
	}
}
