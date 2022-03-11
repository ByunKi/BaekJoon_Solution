/*
 * 제출 번호: 40281777
 * ID: adviate
 * 문제: 1145
 * 결과: 맞았습니다!!
 * 메모리: 14620 KB
 * 시간: 164 ms
 * 언어: Java 11
 * 코드 길이: 567 B
 */

import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		String[] input = reader.readLine().split(" ");

		int[] arr = new int[input.length];
		for(int i = 0; i < arr.length; i++) { arr[i] = Integer.valueOf(input[i]); }

		int ans = 1;
		while(true) {
			int cnt = 0;
			for(int i = 0; i < arr.length; i++) { 
				if(ans >= arr[i] && ans % arr[i] == 0) { cnt++; }
			}

			if(cnt >= 3) { System.out.println(ans); break; }
			ans++;
		}
	}
}
