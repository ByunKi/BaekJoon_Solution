/*
 * 제출 번호: 39808863
 * ID: adviate
 * 문제: 2476
 * 결과: 맞았습니다!!
 * 메모리: 15296 KB
 * 시간: 140 ms
 * 언어: Java 11
 * 코드 길이: 876 B
 */

import java.io.*;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		int TC = Integer.valueOf(reader.readLine()), sum[] = new int[TC];
		for(int i = 0; i < TC; i++) {
			int arr[] = new int[3], max = -1;
			
			String[] input = reader.readLine().split(" ");
			for(int j = 0; j < input.length; j++) { 
				int num = Integer.valueOf(input[j]);
				arr[j] = num;
				if(num > max) { max = num; }
			}
			
			if(arr[0] == arr[1] && arr[0] == arr[2]) { sum[i] = 10000 + arr[0] * 1000; }
			else if(arr[0] == arr[1] || arr[0] == arr[2]) { sum[i] = 1000 + arr[0] * 100; }
			else if(arr[1] == arr[2]) { sum[i] = 1000 + arr[1] * 100; }
			else { sum[i] = max * 100; }
		}
		
		Arrays.sort(sum);
		System.out.println(sum[sum.length - 1]);
	}
}
