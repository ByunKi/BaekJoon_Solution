/*
 * 제출 번호: 40614981
 * ID: adviate
 * 문제: 24736
 * 결과: 맞았습니다!!
 * 메모리: 15956 KB
 * 시간: 152 ms
 * 언어: Java 11
 * 코드 길이: 600 B
 */

import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		int[] scores = new int[2];
		for(int i = 0; i < 2; i++) {
			String[] input = reader.readLine().split(" ");
			scores[i] += (Integer.valueOf(input[0]) * 6);
			scores[i] += (Integer.valueOf(input[1]) * 3);
			scores[i] += (Integer.valueOf(input[2]) * 2);
			scores[i] += (Integer.valueOf(input[3]) * 1);
			scores[i] += (Integer.valueOf(input[4]) * 2);
		}
		
		System.out.println(scores[0] + " " + scores[1]);
	}
}
