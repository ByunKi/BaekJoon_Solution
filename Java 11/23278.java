/*
 * 제출 번호: 39351507
 * ID: adviate
 * 문제: 23278
 * 결과: 맞았습니다!!
 * 메모리: 14420 KB
 * 시간: 132 ms
 * 언어: Java 11
 * 코드 길이: 667 B
 */

import java.io.*;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		String[] input = reader.readLine().split(" ");
		int N = Integer.parseInt(input[0]), L = Integer.parseInt(input[1]), H = Integer.parseInt(input[2]);
		
		input = reader.readLine().split(" ");
		int[] arr = new int[input.length];
		for(int i = 0; i < arr.length; i++) { arr[i] = Integer.parseInt(input[i]); }
		Arrays.sort(arr);
		
		double sum = 0;
		for(int i = L; i < arr.length - H; i++) { sum += arr[i]; }
		System.out.println(sum / (N - (L + H)));
	}
}
