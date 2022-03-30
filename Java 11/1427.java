/*
 * 제출 번호: 41244801
 * ID: adviate
 * 문제: 1427
 * 결과: 맞았습니다!!
 * 메모리: 14212 KB
 * 시간: 128 ms
 * 언어: Java 11
 * 코드 길이: 428 B
 */

import java.io.*;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder ans = new StringBuilder();
		
		char[] input = reader.readLine().toCharArray();
		Arrays.sort(input);
		
		for(int i = input.length - 1; i >= 0; i--) { ans.append(input[i]); }
		System.out.println(ans);
	}
}
