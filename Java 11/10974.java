/*
 * 제출 번호: 86794071
 * ID: adviate
 * 문제: 10974
 * 결과: 맞았습니다!!
 * 메모리: 117236 KB
 * 시간: 526 ms
 * 언어: Java 11
 * 코드 길이: 1242 B
 */

import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder result = new StringBuilder();

        int capacity = Integer.parseInt(reader.readLine());

        int[] numbers = new int[capacity];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (i + 1);
        }

        permute(result, numbers, new boolean[numbers.length], new int[numbers.length], 0);
        System.out.println(result.deleteCharAt(result.length() - 1));

        reader.close();
    }

    public static void permute(StringBuilder result, int[] numbers, boolean[] visited, int[] output, int depth) {
        if (depth == numbers.length) {
            result.append(Arrays.toString(output).replaceAll("[\\[,\\]]", "").trim()).append("\n");
            return;
        }

        for (int i = 0; i < numbers.length; i++) {
            if (!visited[i]) {
                visited[i] = true;
                output[depth] = numbers[i];
                permute(result, numbers, visited, output, depth + 1);
                visited[i] = false;
            }
        }
    }
}
