/*
 * 제출 번호: 39962503
 * ID: adviate
 * 문제: 23746
 * 결과: 맞았습니다!!
 * 메모리: 72588 KB
 * 시간: 424 ms
 * 언어: Java 11
 * 코드 길이: 813 B
 */

import java.io.*;
import java.util.*;


public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.valueOf(reader.readLine());
		
		HashMap<Character, String> map = new HashMap<>();
		for(int i = 0; i < N; i++) {
			String[] input = reader.readLine().split(" ");
			map.put(input[1].charAt(0), input[0]);
		}
		String ans = reader.readLine();
		String[] term = reader.readLine().split(" ");
		int begin = Integer.valueOf(term[0]) - 1, end = Integer.valueOf(term[1]);
		
		for(int i = 0; i < ans.length(); i++) {			
			if(map.containsKey(ans.charAt(i))) { ans = ans.replaceAll(String.valueOf(ans.charAt(i)), map.get(ans.charAt(i))); }
		}
		
		System.out.println(ans.substring(begin, end));
	}
}
