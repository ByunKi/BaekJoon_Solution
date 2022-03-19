/*
 * 제출 번호: 40701796
 * ID: adviate
 * 문제: 1978
 * 결과: 맞았습니다!!
 * 메모리: 14240 KB
 * 시간: 124 ms
 * 언어: Java 11
 * 코드 길이: 668 B
 */

import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.valueOf(reader.readLine()), primes = 0;
		String[] input = reader.readLine().split(" ");
		
		int[] arr = new int[N];
		for(int i = 0; i < arr.length; i++) { arr[i] = Integer.valueOf(input[i]); }
		
		for(int i = 0; i < arr.length; i++) {
			boolean isPrime = true;
			if(arr[i] == 1) { continue; }
			
			for(int j = 2; j < arr[i]; j++) {
				if(arr[i] % j == 0) { isPrime = false; break;}
			}
			
			if(isPrime) { primes++; }
		}
		System.out.println(primes);
	}
}
