/*
 * 제출 번호: 39487632
 * ID: adviate
 * 문제: 5218
 * 결과: 맞았습니다!!
 * 메모리: 14364 KB
 * 시간: 144 ms
 * 언어: Java 11
 * 코드 길이: 718 B
 */

import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		int TC = Integer.parseInt(reader.readLine());
		for(int i = 0; i < TC; i++) {
			String[] input = reader.readLine().split(" ");
			
			int[] distances = new int[input[0].length()];
			for(int j = 0; j < input[0].length(); j++) {
				distances[j] = input[1].charAt(j) - input[0].charAt(j);
				if(input[0].charAt(j) > input[1].charAt(j)) { distances[j] += 26; }
			}
			
			System.out.print("Distances: ");
			for(int j = 0; j < distances.length; j++) {
				System.out.print(distances[j] + " ");
			}
			System.out.println();
		}
	}
}
