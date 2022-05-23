/*
 * 제출 번호: 43662795
 * ID: adviate
 * 문제: 11931
 * 결과: 맞았습니다!!
 * 메모리: 195232 KB
 * 시간: 2672 ms
 * 언어: Java 11
 * 코드 길이: 553 B
 */

import java.io.*;
import java.util.*;

public class Main {	
	public static void main(String[] args) throws IOException{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder ans = new StringBuilder();
		
		int TC = Integer.valueOf(reader.readLine());
		
		Integer[] arr = new Integer[TC];
		for(int i = 0; i < TC; i++) { arr[i] = Integer.valueOf(reader.readLine()); }
		Arrays.sort(arr, Collections.reverseOrder());
		
		for(int i = 0; i < TC; i++) { ans.append(arr[i] + "\n"); }
		System.out.println(ans);
	}
}
