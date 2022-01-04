/*
 * 제출 번호: 37030178
 * ID: adviate
 * 문제: 10817
 * 결과: 맞았습니다!!
 * 메모리: 17824 KB
 * 시간: 208 ms
 * 언어: Java 11
 * 코드 길이: 332 B
 */

import java.util.*;

public class Main {
   public static void main(String[] args) {
	   Scanner scanner = new Scanner(System.in);
	   
	   int[] arr = new int[3];
	   for(int i = 0; i < arr.length; i++) {
		   arr[i] = scanner.nextInt();
	   }
	   Arrays.sort(arr);
	   
	   System.out.println(arr[1]);
	   scanner.close();
    }
}
