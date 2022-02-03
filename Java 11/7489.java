/*
 * 제출 번호: 38487867
 * ID: adviate
 * 문제: 7489
 * 결과: 맞았습니다!!
 * 메모리: 14156 KB
 * 시간: 120 ms
 * 언어: Java 11
 * 코드 길이: 524 B
 */

import java.io.*;

public class Main {
   public static void main(String[] args) throws IOException {
	   BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	   
	   int TC = Integer.parseInt(reader.readLine());
	   for(int i = 0; i < TC; i++) {
		   int num = Integer.parseInt(reader.readLine());
		   long ans = 1;
		   for(int j = 2; j <= num; j++) { 
			   ans *= j;
			   while(ans % 10 == 0) { ans /= 10; }
			   ans = ans % 1000000000;
		   }
		   System.out.println(ans % 10);
	   }
   }
}
