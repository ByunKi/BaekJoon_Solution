// 제출 번호: 35436542
// 아이디: adviate
// 문제: 4493
// 문제 제목: 가위 바위 보?
// 결과: 맞았습니다!!
// 메모리: 63720KB
// 시간: 664ms
// 언어: Java 11
// 코드 길이: 1501B
// 제출한 시간: 2021.11.15 15:28:30

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cases = scanner.nextInt();

        for(int i = 0; i < cases; i++) {
            int times = scanner.nextInt();
            int rp1 = 0, rp2 = 0;
            for(int j = 0; j < times; j++) {
                String p1 = scanner.next();
                String p2 = scanner.next();

                if (p1.equals("R")) {
                    if(p2.equals("P")) {
                        rp2++;
                    }
                    else if(p2.equals("S")) {
                        rp1++;
                    }
                }
                else if (p1.equals("P")) {
                    if(p2.equals("S")) {
                        rp2++;
                    }
                    else if(p2.equals("R")) {
                        rp1++;
                    }
                }
                if (p1.equals("S")) {
                    if(p2.equals("R")) {
                        rp2++;
                    }
                    else if(p2.equals("P")) {
                        rp1++;
                    }
                }
            }

            if(rp1 > rp2) {
                System.out.println("Player 1");
            }
            else if (rp1 == rp2) {
                System.out.println("TIE");
            }
            else {
                System.out.println("Player 2");
            }
        }

        scanner.close();
    }
}
