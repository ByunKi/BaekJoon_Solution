/*
 * 제출 번호: 44285972
 * ID: adviate
 * 문제: 10815
 * 결과: 맞았습니다!!
 * 메모리: 151668 KB
 * 시간: 956 ms
 * 언어: Java 11
 * 코드 길이: 669 B
 */

import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder ans = new StringBuilder();
		HashSet<Integer> set = new HashSet<>();

		int N = Integer.valueOf(reader.readLine()), M; 
		String[] input = reader.readLine().split(" ");
		for(int i = 0; i < N; i++) { set.add(Integer.valueOf(input[i])); }
		
		M = Integer.valueOf(reader.readLine());
		input = reader.readLine().split(" ");
		for(int i = 0; i < M; i++) { ans.append(set.contains(Integer.valueOf(input[i])) ? "1 " : "0 "); }
		System.out.println(ans);
	}
}
