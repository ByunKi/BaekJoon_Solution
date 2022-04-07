/*
 * 제출 번호: 41670076
 * ID: adviate
 * 문제: 11170
 * 결과: 맞았습니다!!
 * 메모리: 296468 KB
 * 시간: 632 ms
 * 언어: Java 11
 * 코드 길이: 608 B
 */

import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		int TC = Integer.valueOf(reader.readLine());
		for(int i = 0; i < TC; i++) {
			String[] input = reader.readLine().split(" ");
			int begin = Integer.valueOf(input[0]), end = Integer.valueOf(input[1]), cnt = 0;
			
			for(int j = begin; j <= end; j++) {
				String tmp = Integer.toString(j);
				for(int k = 0; k < tmp.length(); k++) {
					if(tmp.charAt(k) == '0') { cnt++; }
				}
			}
			System.out.println(cnt);
		}
	}
}
