/*
 * 제출 번호: 36896771
 * ID: adviate
 * 문제: 18247
 * 결과: 맞았습니다!!
 * 메모리: 17756 KB
 * 시간: 220 ms
 * 언어: Java 11
 * 코드 길이: 464 B
 */

import java.util.*;

public class Main {
   public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      
      int testCases = scanner.nextInt();
      for(int i = 0; i < testCases; i++) {
    	  int N = scanner.nextInt();
    	  int M = scanner.nextInt();
    	  
    	  if(N < 12 || M < 4) {
    		  System.out.println(-1);
    	  } else {
    		  System.out.println(11 * M + 4);
    	  }
      } 
      scanner.close();
   }
}
