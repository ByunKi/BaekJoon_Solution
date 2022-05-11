/*
 * 제출 번호: 43130201
 * ID: adviate
 * 문제: 15556
 * 결과: 맞았습니다!!
 * 메모리: 422828 KB
 * 시간: 28 ms
 * 언어: Java 11
 * 코드 길이: 152 B
 */

public class Test {
    long sum(int[] a) {
        long ans = 0;
        for(int i = 0; i < a.length; i++) { ans += a[i]; }
        
        return ans;
    }
}
