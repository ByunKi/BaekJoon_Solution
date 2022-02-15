/*
 * 제출 번호: 39091288
 * ID: adviate
 * 문제: 10807
 * 결과: 맞았습니다!!
 * 메모리: 14228 KB
 * 시간: 124 ms
 * 언어: Java 11
 * 코드 길이: 475 B
 */

import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		int nums = Integer.parseInt(reader.readLine());
		String[] tmp = reader.readLine().split(" ");
		int target = Integer.parseInt(reader.readLine());
		
		int cnt = 0;
		for(int i = 0; i < nums; i++) {
			if(target == Integer.parseInt(tmp[i])) { cnt++; }
		}
		
		System.out.println(cnt);
	}
}
