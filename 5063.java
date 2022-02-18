/*
 * 제출 번호: 39250321
 * ID: adviate
 * 문제: 5063
 * 결과: 맞았습니다!!
 * 메모리: 14048 KB
 * 시간: 128 ms
 * 언어: Java 11
 * 코드 길이: 596 B
 */

import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		int TC = Integer.valueOf(reader.readLine());
		for(int i = 0; i < TC; i++) {
			String[] input = reader.readLine().split(" ");
			int r = Integer.valueOf(input[0]), e = Integer.valueOf(input[1]), c = Integer.valueOf(input[2]);
			
			if(r < e - c) { System.out.println("advertise"); }
			else if(r == e - c) { System.out.println("does not matter"); }
			else { System.out.println("do not advertise"); }
		}
	}
}
