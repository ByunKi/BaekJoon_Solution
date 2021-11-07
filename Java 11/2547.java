// 제출 번호: 35138718
// 아이디: adviate
// 문제: 2547
// 문제 제목: 사탕 선생 고창영
// 결과: 맞았습니다!!
// 메모리: 42640KB
// 시간: 584ms
// 언어: Java 11
// 코드 길이: 765B
// 제출한 시간: 2021.11.06 19:10:13

import java.math.BigInteger;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();

        for (int i = 0; i < size; i++) {
            var sum = BigInteger.ZERO;

            int students = scanner.nextInt();
            var sturdentsNum = new BigInteger(String.valueOf(students));

            for (int j = 0; j < students; j++) {
                sum = sum.add(scanner.nextBigInteger());
            }

            if (sum.mod(sturdentsNum).equals(BigInteger.ZERO)) {
                System.out.println("YES");
            }
            else {
                System.out.println("NO");
            }
        }

        scanner.close();
    }
}
