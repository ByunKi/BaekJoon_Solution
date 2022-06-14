/*
 * 제출 번호: 44552477
 * ID: adviate
 * 문제: 11004
 * 결과: 맞았습니다!!
 * 메모리: 737164 KB
 * 시간: 3928 ms
 * 언어: Java 11
 * 코드 길이: 558 B
 */

import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		LinkedList<Integer> list = new LinkedList<>();
		
		String[] input = reader.readLine().split(" ");
		int N = Integer.valueOf(input[0]), idx = Integer.valueOf(input[1]) - 1;
		
		input = reader.readLine().split(" ");
		for(int i = 0; i < N; i++) { list.add(Integer.valueOf(input[i])); }
		Collections.sort(list);
		
		System.out.println(list.get(idx));
	}
}
