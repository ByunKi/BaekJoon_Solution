/*
 * 제출 번호: 40747224
 * ID: adviate
 * 문제: 1929
 * 결과: 맞았습니다!!
 * 메모리: 18880 KB
 * 시간: 232 ms
 * 언어: Java 11
 * 코드 길이: 697 B
 */

import java.io.*;
 
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder ans = new StringBuilder();
        
        String[] input = reader.readLine().split(" ");
        int M = Integer.valueOf(input[0]), N = Integer.valueOf(input[1]);
        
        boolean[] primes = new boolean[N + 1];
        for(int i = 2; i <= N; i++) {
        	if(primes[i]) { continue; }
        	if(i >= M) { ans.append(i).append("\n"); }
        	
        	for(int j = (i + i); j <= N; j += i) { primes[j] = true; }
        }
        
        System.out.println(ans);
    }
}
