/*
 * 제출 번호: 38992997
 * ID: adviate
 * 문제: 11098
 * 결과: 맞았습니다!!
 * 메모리: 17936 KB
 * 시간: 192 ms
 * 언어: Java 11
 * 코드 길이: 712 B
 */

import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		int TC = Integer.parseInt(reader.readLine());
		for(int i = 0; i < TC; i++) {
			int nums = Integer.parseInt(reader.readLine());
			long[] prices = new long[nums];
			String[] names = new String[nums];
			
		    long max = -1;
			int idx = 0;
			for(int j = 0; j < nums; j++) {
				String[] input = reader.readLine().split(" ");
				prices[j] = Long.parseLong(input[0]);
				names[j] = new String(input[1]);
				
				if(max < prices[j]) {
					max = prices[j];
					idx = j;
				}
			}
			System.out.println(names[idx]);
		}
	}
}
