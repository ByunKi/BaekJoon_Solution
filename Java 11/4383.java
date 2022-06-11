/*
 * 제출 번호: 44428951
 * ID: adviate
 * 문제: 4383
 * 결과: 맞았습니다!!
 * 메모리: 17108 KB
 * 시간: 160 ms
 * 언어: Java 11
 * 코드 길이: 963 B
 */

import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String str = "";
		
		while((str = br.readLine()) != null){
			StringTokenizer st = new StringTokenizer(str);
			int n = Integer.parseInt(st.nextToken());
			
			if(n == 1) { sb.append("Jolly"); }
			else {
				int[] arr = new int[n];
				for(int i = 0; i < n; i++) { arr[i] = Integer.parseInt(st.nextToken()); }
				sb.append(solve(arr));
			}
			sb.append("\n");
		}
		System.out.print(sb);
	}
	
	public static String solve(int[] arr) {
		int[] cost = new int[arr.length - 1];
		for(int i = 0; i < arr.length - 1; i++) {
			cost[i] = Math.abs(arr[i] - arr[i + 1]);
		}
		Arrays.sort(cost);
        
		for(int i = 0; i < cost.length; i++) {
			if(cost[i] != i + 1) {
				return "Not jolly";
			}
		}
		return "Jolly";
	}
}
