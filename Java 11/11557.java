/*
 * 제출 번호: 40791450
 * ID: adviate
 * 문제: 11557
 * 결과: 맞았습니다!!
 * 메모리: 14080 KB
 * 시간: 112 ms
 * 언어: Java 11
 * 코드 길이: 682 B
 */

import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		int TC = Integer.valueOf(reader.readLine());
		for(int i = 0; i < TC; i++) {
			int N = Integer.valueOf(reader.readLine());
			int[] drinks = new int[N];
			String[] schools = new String[N];
			
			int max = -1, idx = 0;
			for(int j = 0; j < N; j++) {
				String[] input = reader.readLine().split(" ");
				drinks[j] = Integer.valueOf(input[1]);
				schools[j] = input[0];
				
				if(drinks[j] > max) {
					max = drinks[j];
					idx = j;
				}
			}
			
			System.out.println(schools[idx]);
		}
	}
}
