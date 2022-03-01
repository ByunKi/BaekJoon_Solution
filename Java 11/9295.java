/*
 * 제출 번호: 39764648
 * ID: adviate
 * 문제: 9295
 * 결과: 맞았습니다!!
 * 메모리: 16568 KB
 * 시간: 248 ms
 * 언어: Java 11
 * 코드 길이: 473 B
 */
 
 import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        
  	    int TC = Integer.valueOf(reader.readLine());
	    for(int i = 0; i < TC; i++) {
		    String[] input = reader.readLine().split(" ");
		    int A = Integer.valueOf(input[0]), B = Integer.valueOf(input[1]);
		    System.out.println("Case " + (i + 1) + ": " + (A + B));
	    }
	}
}
