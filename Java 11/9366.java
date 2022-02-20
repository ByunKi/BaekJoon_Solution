/*
 * 제출 번호: 39333896
 * ID: adviate
 * 문제: 9366
 * 결과: 맞았습니다!!
 * 메모리: 14440 KB
 * 시간: 148 ms
 * 언어: Java 11
 * 코드 길이: 1029 B
 */

import java.io.*;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		int TC = Integer.parseInt(reader.readLine());
		for(int i = 0; i < TC; i++) {
			String[] input = reader.readLine().split(" ");
			
			int arr[] = new int[input.length];
			for(int j = 0; j < arr.length; j++) { arr[j] = Integer.parseInt(input[j]); }
			Arrays.sort(arr);
			
			if(arr[0] == arr[1] && arr[1] == arr[2]) {
				System.out.println("Case #" + (i+1) + ": equilateral");
			} else if(arr[0] == arr[1] || arr[1] == arr[2] || arr[0] == arr[2]) {
				if(arr[0] + arr[1] > arr[2]) {
					System.out.println("Case #" + (i+1) + ": isosceles");
				} else {
					System.out.println("Case #" + (i+1) + ": invalid!");
				}
			} else {
				if(arr[0] + arr[1] > arr[2]) {
					System.out.println("Case #" + (i+1) + ": scalene");
				} else {
					System.out.println("Case #" + (i+1) + ": invalid!");
				}
			}
		}
	}
}
