/*
 * 제출 번호: 38588824
 * ID: adviate
 * 문제: 13410
 * 결과: 맞았습니다!!
 * 메모리: 14452 KB
 * 시간: 136 ms
 * 언어: Java 11
 * 코드 길이: 136 B
 */

import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		String[] input = reader.readLine().split(" ");
		int N = Integer.parseInt(input[0]), M = Integer.parseInt(input[1]), max = -1;
		
		for(int i = 1; i <= M; i++) {
			StringBuffer tmp = new StringBuffer(Integer.toString(N*i));
			int num = Integer.parseInt(tmp.reverse().toString());
			
			if(max < num) { max = num; }
		}
		System.out.println(max);
 	}
}
