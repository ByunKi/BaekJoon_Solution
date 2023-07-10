/*
 * 제출 번호: 63237806
 * ID: adviate
 * 문제: 4344
 * 결과: 맞았습니다!!
 * 메모리: 15892 KB
 * 시간: 168 ms
 * 언어: Java 11
 * 코드 길이: 956 B
 */

package Java;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.valueOf(reader.readLine());
        for (int i = 0; i < N; i++) {
            String[] inputValues = reader.readLine().split(" ");
            int[] tmp = new int[Integer.valueOf(inputValues[0])];
            for (int j = 0; j < tmp.length; j++) { tmp[j] = Integer.valueOf( inputValues[j+1]); }

            int cnt = 0, avg = getAvg(tmp);
            for (int n : tmp) {
                if (n > avg) { cnt++; }
            }
            System.out.println(String.format("%5.3f", (double)(cnt * 100f / tmp.length)) + "%");
        }

        reader.close();
    }

    public static int getAvg(int[] intArr) {
        int sum = 0;
        for (int i : intArr) {  sum += i; }
        return (sum / intArr.length);
    }
}
