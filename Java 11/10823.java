/*
 * 제출 번호: 39293576
 * ID: adviate
 * 문제: 10823
 * 결과: 맞았습니다!!
 * 메모리: 14632 KB
 * 시간: 132 ms
 * 언어: Java 11
 * 코드 길이: 493 B
 */

import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String input = new String();
		StringBuilder ans = new StringBuilder();
		
		long sum = 0;
		while((input = reader.readLine()) != null) { ans.append(input); }
		
		String[] arr = ans.toString().split(",");
		for(int i = 0; i < arr.length; i++) { sum += Integer.valueOf(arr[i]); }
		System.out.println(sum);
	}
}
