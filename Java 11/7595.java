/*
 * 제출 번호: 40747155
 * ID: adviate
 * 문제: 7595
 * 결과: 맞았습니다!!
 * 메모리: 39128 KB
 * 시간: 1784 ms
 * 언어: Java 11
 * 코드 길이: 477 B
 */

import java.io.*;
 
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        
        while(true) {
        	int N = Integer.valueOf(reader.readLine());
        	if(N < 1) { break; }
        	
        	for(int i = 0; i < N; i++) {
        		for(int j = 0; j <= i; j++) { System.out.print("*"); }
        		System.out.println();
        	}
        }
    }
}
