/*
 * 제출 번호: 38540662
 * ID: adviate
 * 문제: 10808
 * 결과: 맞았습니다!!
 * 메모리: 15892 KB
 * 시간: 144 ms
 * 언어: Java 11
 * 코드 길이: 412 B
 */

import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int[] alphabets = new int[26];
		
		String input = reader.readLine();
		for(int i = 0; i < input.length(); i++) { alphabets[input.charAt(i) - 97]++; }
		
		for(int i = 0; i < 26; i++) { System.out.print(alphabets[i] + " "); }
	}
}
