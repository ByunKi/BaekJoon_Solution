/*
 * 제출 번호: 46220769
 * ID: adviate
 * 문제: 17219
 * 결과: 맞았습니다!!
 * 메모리: 67972 KB
 * 시간: 816 ms
 * 언어: Java 11
 * 코드 길이: 805 B
 */

import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder ans = new StringBuilder();
		TreeMap<String, String> map = new TreeMap<>();
		
		String[] input = reader.readLine().split(" ");
		int N = Integer.valueOf(input[0]), M = Integer.valueOf(input[1]);
		for(int i = 0; i < N; i++) { 
			input = reader.readLine().split(" ");
			map.put(input[0], input[1]); 
		}
		
		for(int i = 0; i < M; i++) {
			input = reader.readLine().split(" ");
			ans.append(map.get(input[0])).append("\n");
		}
		writer.write(ans.toString());
		
		reader.close();
		writer.close();
	}
}
