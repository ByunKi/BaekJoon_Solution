/*
 * 제출 번호: 38820676
 * ID: adviate
 * 문제: 22966
 * 결과: 맞았습니다!!
 * 메모리: 14164 KB
 * 시간: 120 ms
 * 언어: Java 11
 * 코드 길이: 599 B
 */

import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		int nums = Integer.parseInt(reader.readLine()), min = 5, idx = 0;
		int[] difficulty = new int[nums];
		String[] names = new String[nums];
		for(int i = 0; i < nums; i++) {
			String[] input = reader.readLine().split(" ");
			names[i] = input[0];
			difficulty[i] = Integer.parseInt(input[1]);
			
			if(min > difficulty[i]) { 
				idx = i;
				min = difficulty[i];
			}
		}
		
		System.out.println(names[idx]);
	}
}
