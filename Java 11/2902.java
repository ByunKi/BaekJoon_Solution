/*
 * 제출 번호: 37029442
 * ID: adviate
 * 문제: 2902
 * 결과: 맞았습니다!!
 * 메모리: 17540 KB
 * 시간: 204 ms
 * 언어: Java 11
 * 코드 길이: 335 B
 */

import java.util.*;

public class Main {
   public static void main(String[] args) {
	   Scanner scanner = new Scanner(System.in);
	   String input = scanner.next();
	   
	   String[] tmp = input.split("-");
	   for(int i = 0; i < tmp.length; i++) {
		   System.out.print(tmp[i].substring(0,1));
	   }
	   
	   scanner.close();
    }
}
