/*
 * 제출 번호: 39962782
 * ID: adviate
 * 문제: 23746
 * 결과: 맞았습니다!!
 * 메모리: 18520 KB
 * 시간: 196 ms
 * 언어: Java 11
 * 코드 길이: 775 B
 */

import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.valueOf(reader.readLine());
		
		HashMap<String, String> map = new HashMap<>();
		for(int i = 0; i < N; i++) {
			String[] input = reader.readLine().split(" ");
			map.put(input[1], input[0]);
		}
		String input = reader.readLine();
		String[] term = reader.readLine().split(" ");
		int begin = Integer.valueOf(term[0]) - 1, end = Integer.valueOf(term[1]);
		
		StringBuffer ans = new StringBuffer();
		for(int i = 0; i < input.length(); i++) { ans.append(map.get(String.valueOf(input.charAt(i))));	}
		
		System.out.println(ans.substring(begin, end));
	}
}
