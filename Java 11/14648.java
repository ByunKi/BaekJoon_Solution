/*
 * 제출 번호: 40001378
 * ID: adviate
 * 문제: 14648
 * 결과: 맞았습니다!!
 * 메모리: 30644 KB
 * 시간: 500 ms
 * 언어: Java 11
 * 코드 길이: 1225 B
 */

import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		String[] input = reader.readLine().split(" ");
		int N = Integer.valueOf(input[0]), Q = Integer.valueOf(input[1]);
		
		int[] arr = new int[N];
		input = reader.readLine().split(" ");
		for(int i = 0; i < arr.length; i++) { arr[i] = Integer.valueOf(input[i]); }
		
		for(int i = 0; i < Q; i++) {
			input = reader.readLine().split(" ");
			String T = input[0];
			
			if(T.equals("1")) {
				int begin = Integer.valueOf(input[1]) - 1, end = Integer.valueOf(input[2]) - 1, tmp = 0;
				long sum = 0;
				for(int j = begin; j <= end; j++) { sum += arr[j]; }
				
				tmp = arr[begin];
				arr[begin] = arr[end];
				arr[end] = tmp;
				
				System.out.println(sum);
			}
			else {
				int begin1 = Integer.valueOf(input[1]), end1 = Integer.valueOf(input[2]), begin2 = Integer.valueOf(input[3]), end2 = Integer.valueOf(input[4]);
				long sum1 = 0, sum2 = 0;
				for(int j = (begin1 - 1); j < end1; j++) { sum1 += arr[j]; }
				for(int j = (begin2 - 1); j < end2; j++) { sum2 += arr[j]; }
				
				System.out.println(sum1 - sum2);
			}
		}
	}
}
