/*
 * 제출 번호: 41010072
 * ID: adviate
 * 문제: 2523
 * 결과: 맞았습니다!!
 * 메모리: 15352 KB
 * 시간: 276 ms
 * 언어: Java 11
 * 코드 길이: 536 B
 */

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.valueOf(reader.readLine());
        for(int a = 1; a <= 2 * N - 1; a++) {
        	if(a <= N) {
            	for(int b = 1; b <= a; b++) { System.out.print("*"); }
        	} else {
        		for(int b = 2 * N - 1; b >= a; b--) { System.out.print("*"); }
        	}
        	System.out.println();
        }
    }
}
