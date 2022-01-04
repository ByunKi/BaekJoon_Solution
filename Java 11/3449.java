/*
 * 제출 번호: 37029715
 * ID: adviate
 * 문제: 3449
 * 결과: 맞았습니다!!
 * 메모리: 18308 KB
 * 시간: 224 ms
 * 언어: Java 11
 * 코드 길이: 508 B
 */

import java.util.*;

public class Main {
   public static void main(String[] args) {
	   Scanner scanner = new Scanner(System.in);
	   
	   int TC = scanner.nextInt();
	   for(int i = 0; i < TC; i++) {
		   int cnt = 0;
		   char[] a = scanner.next().toCharArray();
		   char[] b = scanner.next().toCharArray();
		   
		   for(int j = 0; j < b.length; j++) {
			   if(a[j] != b[j]) {
				   cnt++;
			   }
		   }
		   System.out.println("Hamming distance is " + cnt + ".");
	   }
	   scanner.close();
    }
}
