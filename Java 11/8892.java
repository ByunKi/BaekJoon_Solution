/*
 * 제출 번호: 44669111
 * ID: adviate
 * 문제: 8892
 * 결과: 맞았습니다!!
 * 메모리: 140328 KB
 * 시간: 624 ms
 * 언어: Java 11
 * 코드 길이: 878 B
 */

import java.io.*;

public class Main {	    
	public static void main(String[] args) throws IOException{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder ans = new StringBuilder();
		
		int TC = Integer.valueOf(reader.readLine());
		for(int i = 0; i < TC; i++) {
			String output = "0";
			int N = Integer.valueOf(reader.readLine());
			
			String[] arr = new String[N];
			for(int j = 0; j < N; j++) { arr[j] = reader.readLine(); }
			
			for(int j = 0; j < N; j++) { 
				for(int k = 0; k < N; k++) { 
					if(arr[j] != arr[k] && isPalindrome(arr[j] + arr[k])) {  output = arr[j] + arr[k];  break; }
				}
			}
			ans.append(output + "\n");
		}
		System.out.println(ans);
	}
	
	public static boolean isPalindrome(String str) {
		StringBuffer reverse = new StringBuffer(str).reverse();
		return str.equals(reverse.toString());
	}
}
