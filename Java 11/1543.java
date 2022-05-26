/*
 * 제출 번호: 43831091
 * ID: adviate
 * 문제: 1543
 * 결과: 맞았습니다!!
 * 메모리: 14260 KB
 * 시간: 124 ms
 * 언어: Java 11
 * 코드 길이: 497 B
 */

import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		String input = reader.readLine(), str = reader.readLine();
		int size = str.length(), cnt = 0;
		
		for(int i = 0; i < input.length(); i++) {
			try {
				if(input.substring(i, i + size).equals(str)) { cnt++; i += (size - 1); }
			} catch (StringIndexOutOfBoundsException e) {}
		}
		System.out.println(cnt);
	}
}
