/*
 * 제출 번호: 40682406
 * ID: adviate
 * 문제: 2061
 * 결과: 맞았습니다!!
 * 메모리: 46976 KB
 * 시간: 364 ms
 * 언어: Java 11
 * 코드 길이: 928 B
 */

import java.io.*;
import java.math.BigInteger;
 
public class Main {
 
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        
        String[] input = reader.readLine().split(" ");
        BigInteger k = new BigInteger(input[0]);
        int l = Integer.valueOf(input[1]);
        
        boolean[] primes = new boolean[l + 1];
        primes[1] = true;
              
        for(int i = 2 ; i < l ; i++) {
            if(primes[i]) { continue; }
            BigInteger now = new BigInteger(Integer.toString(i));
            
            if(k.mod(now).compareTo(BigInteger.ZERO) == 0) { 
                System.out.println("BAD " + now);
                return;
            }
            
            for(int j = i + i ; j <= l ; j += i) { primes[j] = true; }
        }
        
        System.out.println("GOOD");
    }
}
