/*
 * 제출 번호: 44708827
 * ID: adviate
 * 문제: 10816
 * 결과: 맞았습니다!!
 * 메모리: 152932 KB
 * 시간: 1068 ms
 * 언어: Java 11
 * 코드 길이: 770 B
 */

import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		HashMap<String, Integer> map = new HashMap<>();
		StringBuilder ans = new StringBuilder();
		
		int N = Integer.valueOf(reader.readLine()), M;
		String[] input = reader.readLine().split(" ");
		for(int i = 0; i < N; i++) {
			if(map.containsKey(input[i])) { map.put(input[i], map.get(input[i]) + 1); }
			else { map.put(input[i], 1); }
		}
		
		M = Integer.valueOf(reader.readLine());
		input = reader.readLine().split(" ");
		for(int i = 0; i < M; i++) { ans.append(map.containsKey(input[i]) ? map.get(input[i]) : 0).append(" "); }
		
		System.out.println(ans);		
	}
}
