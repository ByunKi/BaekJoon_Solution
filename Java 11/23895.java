/*
 * 제출 번호: 43595333
 * ID: adviate
 * 문제: 23895
 * 결과: 맞았습니다!!
 * 메모리: 305396 KB
 * 시간: 1716 ms
 * 언어: Java 11
 * 코드 길이: 820 B
 */

import java.io.*;
import java.util.*;

public class Main {	
	public static void main(String[] args) throws IOException{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder ans = new StringBuilder();
		
		int T = Integer.valueOf(reader.readLine());
		for(int i = 0; i < T; i++) {
			String[] input = reader.readLine().split(" ");
			int N = Integer.valueOf(input[0]), B = Integer.valueOf(input[1]);
			
			input = reader.readLine().split(" ");
			int[] arr = new int[N];
			for(int j = 0; j < N; j++) { arr[j] = Integer.valueOf(input[j]); }
			Arrays.sort(arr);
			
			int cnt = 0;
			for(int j = 0; j < N; j++) {
				if(B >= 0 && B < arr[j]) { break; }
				B -= arr[j];
				cnt++;
			}
			ans.append("Case #" + (i + 1) + ": " + cnt + "\n");
		}
		System.out.println(ans);
	}
}
