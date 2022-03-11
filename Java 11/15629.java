/*
 * 제출 번호: 40294048
 * ID: adviate
 * 문제: 15629
 * 결과: 맞았습니다!!
 * 메모리: 17720 KB
 * 시간: 208 ms
 * 언어: Java 11
 * 코드 길이: 1737 B
 */

import java.util.Scanner;

class Main
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int cost = 0;
        boolean SAexists = false;
        boolean ZIexists = false;
        boolean ZAexists = false;
        String plan;

        for(int i = 0 ; i < N ; i++)
        {
            plan = sc.next();
            switch (plan)
            {
                case "botswana" :
                    cost += 0;
                    break;

                case "ethiopia" :
                    cost += 50;
                    break;

                case "kenya" :
                    cost += 50;
                    break;

                case "namibia" :
                    if(SAexists) cost += 40;
                    else cost += 140; //대행사 $140
                    break;

                case "south-africa" :
                    SAexists = true;
                    cost += 0;
                    break;

                case "tanzania" :
                    cost += 50;
                    break;

                case "zambia" :
                    ZAexists = true;
                    if(ZIexists)
                        cost += 20 + 0;
                    else cost += 50;
                    break;

                case "zimbabwe" :
                    ZIexists = true;
                    if(ZAexists)
                        cost += 0;
                    else cost += 30;
                    break;
            }

            if(!plan.equals("zambia") && !plan.equals("zimbabwe"))
            {
                ZAexists = false;
                ZIexists = false;
            }

        }

        System.out.println(cost);

    }
}
