/*
 * 제출 번호: 38633049
 * ID: adviate
 * 문제: 4998
 * 결과: 맞았습니다!!
 * 메모리: 14684 KB
 * 시간: 164 ms
 * 언어: Java 11
 * 코드 길이: 523 B
 */

import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		String input = new String();
		while((input = reader.readLine()) != null) {
			String[] tmp = input.split(" ");
			double N = Double.parseDouble(tmp[0]), B = Double.parseDouble(tmp[1]) / 100, M = Double.parseDouble(tmp[2]);
			int cnt = 0;
			
			while(N <= M) {
				N += (N * B);
				cnt++;
			}
			
			System.out.println(cnt);
		}
 	}
}
