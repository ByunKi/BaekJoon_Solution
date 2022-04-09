/*
 * 제출 번호: 41759503
 * ID: adviate
 * 문제: 1037
 * 결과: 맞았습니다!!
 * 메모리: 14316 KB
 * 시간: 128 ms
 * 언어: Java 11
 * 코드 길이: 496 B
 */

import java.io.*;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		int len = Integer.valueOf(reader.readLine());
		String[] input = reader.readLine().split(" ");
		reader.close();
		
		int[] arr = new int[len];
		for(int i = 0; i < len; i++) { arr[i] = Integer.valueOf(input[i]); }
		
		Arrays.sort(arr);
		System.out.println(arr[0] * arr[len - 1]);
	}
}
