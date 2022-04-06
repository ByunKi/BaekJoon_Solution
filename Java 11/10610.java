/*
 * 제출 번호: 41616965
 * ID: adviate
 * 문제: 10610
 * 결과: 맞았습니다!!
 * 메모리: 31248 KB
 * 시간: 884 ms
 * 언어: Java 11
 * 코드 길이: 636 B
 */

import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		String input = reader.readLine();
		int sum = 0;
		
		Integer[] arr = new Integer[input.length()];
		for(int i = 0; i < input.length(); i++) { 
			int num = input.charAt(i) - '0';
			arr[i] = num;
			sum += num; 
		}
		
		if(sum % 3 != 0 || !input.contains("0")) { System.out.println(-1); } 
		else {
			Arrays.sort(arr, Collections.reverseOrder());
			for(int i = 0; i < input.length(); i++) {  System.out.print(arr[i]); }
		}
	}
}
