/*
 * 제출 번호: 40664605
 * ID: adviate
 * 문제: 11721
 * 결과: 맞았습니다!!
 * 메모리: 14288 KB
 * 시간: 128 ms
 * 언어: Java 11
 * 코드 길이: 390 B
 */

import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		char[] input = reader.readLine().toCharArray();
		int cnt = 0;
		for(int i = 0; i < input.length; i++, cnt++) {
			if(cnt % 10 == 0 && i != 0) { System.out.println(); }
			System.out.print(input[i]);
		}
	}
}
