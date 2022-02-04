/*
 * 제출 번호: 38536514
 * ID: adviate
 * 문제: 2495
 * 결과: 맞았습니다!!
 * 메모리: 14172 KB
 * 시간: 116 ms
 * 언어: Java 11
 * 코드 길이: 588 B
 */

import java.io.*;

public class Main {
   public static void main(String[] args) throws IOException {
	   BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	   
	   for(int i = 0; i < 3; i++) {
		   char[] input = reader.readLine().toCharArray();
		   int cnt = 1, ans = 1; char ch = input[0];
		   
		   for(int j = 1; j < input.length; j++) {
			   if(ch == input[j]) { 
				   cnt++; 
			   } else {
				   ch = input[j];
				   cnt = 1;
			   }
			   
			   if(cnt >= ans) {
				   ans = cnt;
			   }
		   }
		   
		   System.out.println(ans);
	   }
   }
}
