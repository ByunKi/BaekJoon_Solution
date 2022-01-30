/*
 * 제출 번호: 38342383
 * ID: adviate
 * 문제: 3047
 * 결과: 맞았습니다!!
 * 메모리: 14308 KB
 * 시간: 128 ms
 * 언어: Java 11
 * 코드 길이: 608 B
 */

import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder str = new StringBuilder();
		
		String[] input = reader.readLine().split(" "); int[] arr = new int[input.length];
		for(int i = 0; i < arr.length; i++) { arr[i] = Integer.parseInt(input[i]); }
		Arrays.sort(arr);
		
		input[0] = reader.readLine();
		for(int i = 0; i < arr.length; i++) { str.append(arr[input[0].charAt(i) - 'A']); str.append(" ");}
		System.out.println(str.toString());
 	}
}
