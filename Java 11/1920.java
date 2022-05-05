/*
 * 제출 번호: 42868824
 * ID: adviate
 * 문제: 1920
 * 결과: 맞았습니다!!
 * 메모리: 51672 KB
 * 시간: 560 ms
 * 언어: Java 11
 * 코드 길이: 685 B
 */

import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder ans = new StringBuilder();
		Set<Integer> set = new HashSet<>();
		
		int N = Integer.valueOf(reader.readLine());
		String[] input = reader.readLine().split(" ");
		for(int i = 0; i < N; i++) { set.add(Integer.valueOf(input[i])); }
		
		int M = Integer.valueOf(reader.readLine());
		input = reader.readLine().split(" ");
		for(int i = 0; i < M; i++) {
			ans.append(set.contains(Integer.valueOf(input[i])) ? (1 + "\n") : (0 + "\n"));
		}
		System.out.println(ans);
	}
}
