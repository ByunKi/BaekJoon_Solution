/*
 * 제출 번호: 36886932
 * ID: adviate
 * 문제: 1408
 * 결과: 맞았습니다!!
 * 메모리: 17756 KB
 * 시간: 204 ms
 * 언어: Java 11
 * 코드 길이: 1265 B
 */

import java.util.*;

public class Main {
   public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      String input;
      int[][] time = new int[2][3];
      
      for(int i = 0; i < time.length; i++) {
    	  input = scanner.nextLine();
    	  
    	  String tmp[] = input.split(":");
    	  for(int j = 0; j < tmp.length; j++) {
    		  time[i][j] = Integer.parseInt(tmp[j]);
    	  }
      }
      
      if(time[0][0] >= time[1][0]) {
    	  time[1][0] += 24;
      }
      time[1][0] -= time[0][0];
      
      for(int i = 1; i < time[1].length; i++) {
    	  if(time[1][i] <= time[0][i]) {
    		  time[1][i-1]--;
    		  time[1][i] += 60;
    	  } 
    	  time[1][i] -= time[0][i];
      }
      
      if(time[1][2] >= 60) {
    	  time[1][2] -= 60;
    	  time[1][1]++;
      }
      if(time[1][1] >= 60) {
    	  time[1][1] -= 60;
    	  time[1][0]++;
      }
      if(time[1][0] >= 24) {
    	  time[1][0] -= 24;
      }
      
      System.out.printf("%02d:%02d:%02d", time[1][0], time[1][1], time[1][2]);
      scanner.close();
   }
}
