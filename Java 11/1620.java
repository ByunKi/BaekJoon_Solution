/*
 * 제출 번호: 43354319
 * ID: adviate
 * 문제: 1620
 * 결과: 맞았습니다!!
 * 메모리: 58748 KB
 * 시간: 616 ms
 * 언어: Java 11
 * 코드 길이: 696 B
 */

import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder ans = new StringBuilder();
		HashMap<String, String> map = new HashMap<>();
		
		String[] input = reader.readLine().split(" ");
		int N = Integer.valueOf(input[0]), M = Integer.valueOf(input[1]);

		for(int i = 0; i < N; i++) {
			input[0] = reader.readLine();
			input[1] = Integer.toString(i + 1);
			map.put(input[0], input[1]);
			map.put(input[1], input[0]);
		}
		
		for(int i = 0; i < M; i++) { ans.append(map.get(reader.readLine()) + "\n"); }
		System.out.println(ans);
	}
}
