/*
 * 제출 번호: 37030084
 * ID: adviate
 * 문제: 3943
 * 결과: 맞았습니다!!
 * 메모리: 118028 KB
 * 시간: 2012 ms
 * 언어: Java 11
 * 코드 길이: 566 B
 */

import java.util.*;

public class Main {
   public static void main(String[] args) {
	   Scanner scanner = new Scanner(System.in);
	   int TC = scanner.nextInt();
	   
	   for(int i = 0; i < TC; i++) {
		   int input = scanner.nextInt();
		   int max = -1;
		   
		   while(true) {
			   if(max <= input) {
				   max = input;
			   }
			   
			   if(input == 1) {
				   System.out.println(max);
				   break;
			   }
			   
			   if(input % 2 == 0) {
				   input /= 2;
			   } else {
				   input = input * 3 + 1;
			   }
		   }
	   }
	   scanner.close();
    }
}
