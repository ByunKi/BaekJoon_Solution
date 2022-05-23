/*
 * 제출 번호: 43692506
 * ID: adviate
 * 문제: 9625
 * 결과: 맞았습니다!!
 * 메모리: 16032 KB
 * 시간: 148 ms
 * 언어: Java 11
 * 코드 길이: 592 B
 */

import java.io.*;

public class Main {	    
	public static void main(String[] args) throws IOException{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        
		int K = Integer.valueOf(reader.readLine());
        int[][] arr = new int[K + 1][2];
        arr[0][0] = 1; arr[0][1] = 0;
        arr[1][0] = 0; arr[1][1] = 1;
        
        for(int i = 2; i < arr.length; i++) {
            arr[i][0] = arr[i - 1][0] + arr[i - 2][0];
            arr[i][1] = arr[i - 1][1] + arr[i - 2][1];
        }

        System.out.println(arr[K][0] + " " + arr[K][1]);
	}
}
