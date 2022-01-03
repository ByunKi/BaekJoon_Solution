/*
 * 제출 번호: 37001729
 * ID: adviate
 * 문제: 11365
 * 결과: 맞았습니다!!
 * 메모리: 17684 KB
 * 시간: 216 ms
 * 언어: Java 11
 * 코드 길이: 531 B
 */

import java.util.*;

public class Main {
   public static void main(String[] args) {
	   Scanner scanner = new Scanner(System.in);
	   StringBuffer buffer = new StringBuffer();
	   String output = "";
	   
	   while(true) {
		   String input = scanner.nextLine();
		   if(input.equals("END")) {
			   break;
		   }
		   
		   buffer.append(input).reverse();
		   output = output.concat(buffer.toString() + "\n");
		   buffer.replace(0, buffer.capacity(), "");
	   }
	   
	   System.out.println(output);
	   scanner.close();
    }
}
