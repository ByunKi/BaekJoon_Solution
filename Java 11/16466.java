/*
 * 제출 번호: 43016288
 * ID: adviate
 * 문제: 16466
 * 결과: 맞았습니다!!
 * 메모리: 118972 KB
 * 시간: 572 ms
 * 언어: Java 11
 * 코드 길이: 578 B
 */

import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.valueOf(reader.readLine()), ans = 0;
		String[] input = reader.readLine().split(" ");
		
		int[] arr = new int[N];
		for(int i = 0; i < N; i++) { arr[i] = Integer.valueOf(input[i]); }
		Arrays.sort(arr);
		
		for(int i = 0; i < N; i++) { 
			if(arr[i] != (i + 1)) {
				ans = i + 1;
				break;
			}
		}
		
		System.out.println(ans == 0 ? (N + 1) : ans);
	}
}
