/*
 * 제출 번호: 42593085
 * ID: adviate
 * 문제: 2822
 * 결과: 맞았습니다!!
 * 메모리: 14672 KB
 * 시간: 144 ms
 * 언어: Java 11
 * 코드 길이: 875 B
 */

import java.io.*;
import java.util.*;

public class Main {
   public static void main(String[] args) throws IOException {
      BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
      TreeMap<Integer, Integer> map = new TreeMap<>();
      
      Object arr[] = new Object[8];
      int[] problems = new int[5];
      for(int i = 1; i <= 8; i++) { 
         arr[i - 1] = Integer.valueOf(reader.readLine());
         map.put((int) arr[i - 1], i); 
      }
      
      Set<Integer> set = map.keySet();
      arr = set.toArray();
      
      int sum = 0, j = 0;
      for(int i = 7; i >= 3; i--) { 
         sum += (int) arr[i];
         problems[j++] = map.get(arr[i]);
      } 
      
      Arrays.sort(problems);
      
      System.out.println(sum);
      for(int i = 0; i < problems.length; i++) { System.out.print(problems[i] + " "); }
   }
}
