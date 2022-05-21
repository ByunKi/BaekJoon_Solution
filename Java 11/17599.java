/*
 * 제출 번호: 43601424
 * ID: adviate
 * 문제: 17599
 * 결과: 맞았습니다!!
 * 메모리: 32356 KB
 * 시간: 332 ms
 * 언어: Java 11
 * 코드 길이: 489 B
 */

import java.io.*;
import java.util.*;

public class Main {   
   public static void main(String[] args) throws IOException{
      BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
      HashSet<Integer> set = new HashSet<>();
      
      int N = Integer.valueOf(reader.readLine());
      String[] input = reader.readLine().split(" ");
      
      for(int i = 0; i < N; i++) { set.add(Integer.valueOf(input[i])); }
      System.out.println(set.size());
   }
}
