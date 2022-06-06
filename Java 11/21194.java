/*
 * 제출 번호: 44209851
 * ID: adviate
 * 문제: 21194
 * 결과: 맞았습니다!!
 * 메모리: 27420 KB
 * 시간: 340 ms
 * 언어: Java 11
 * 코드 길이: 577 B
 */

import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		String[] input = reader.readLine().split(" ");
		int N = Integer.valueOf(input[0]), K = Integer.valueOf(input[1]), cnt = 0;
		long sum = 0;
		
		int[] arr = new int[N];
		for(int i = 0; i < N; i++) { arr[i] = Integer.valueOf(reader.readLine()); }
		Arrays.sort(arr);
		
		for(int i = (N - 1); i >= 0 && K != cnt; i--, cnt++) { sum += arr[i]; }
		System.out.print(sum);
	}
}
