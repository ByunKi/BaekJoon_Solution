/*
 * 제출 번호: 39250608
 * ID: adviate
 * 문제: 1668
 * 결과: 맞았습니다!!
 * 메모리: 16052 KB
 * 시간: 152 ms
 * 언어: Java 11
 * 코드 길이: 668 B
 */

import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		int nums = Integer.valueOf(reader.readLine());
		int[] arr = new int[nums];
		for(int i = 0; i < nums; i++) { arr[i] = Integer.valueOf(reader.readLine()); }
		
		int left = 1, right = 1, max = arr[0];
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] > max) {
				max = arr[i];
				left++;
			}
		}
		
		max = arr[nums-1];
		for(int i = arr.length - 1; i >= 0; i--) {
			if(arr[i] > max) {
				max = arr[i];
				right++;
			}
		}
		
		System.out.println(left + "\n" + right);
	}
}
