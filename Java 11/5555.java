/*
 * 제출 번호: 44480158
 * ID: adviate
 * 문제: 5555
 * 결과: 맞았습니다!!
 * 메모리: 14056 KB
 * 시간: 124 ms
 * 언어: Java 11
 * 코드 길이: 431 B
 */

import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		String str = reader.readLine();
		int N = Integer.valueOf(reader.readLine()), cnt = 0;
		for(int i = 0; i < N; i++) {
			String input = reader.readLine();
			input += input;
			if(input.contains(str)) { cnt++; }
		}
		System.out.println(cnt);
	}
}
