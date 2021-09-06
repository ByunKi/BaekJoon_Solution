/*
1. 첫째 줄에 알파벳 대소문자로 이루어진 단어가 주어진다. 주어지는 단어의 길이는 1,000,000을 넘지 않는다.
2. 첫째 줄에 이 단어에서 가장 많이 사용된 알파벳을 대문자로 출력한다.
3. 가장 많이 사용된 알파벳이 여러 개 존재하는 경우에는 ?를 출력한다.
A = 65, a = 97
*/

#include <stdio.h>
#include <string.h>

int main() {
    char str[1000000];
    int alphabets[26] = {0, }; // a~z를 인덱스로 구분한다.
    int max = -1, length, tmp1, tmp2 = -1;

    scanf("%s",str);
    length = strlen(str);

    for(int i = 0; i < length; i++) {
        if(str[i] < 'a') {
            alphabets[str[i] - 65]++;
        } // 대문자
        else {
            alphabets[str[i] - 97]++;
        } // 소문자
    }

    for(int i = 0; i < 26; i++) {
        // printf("%d \n",alphabets[i]);
        
        if(alphabets[i] > max) {
            max = alphabets[i];
            tmp1 = i;
        }
        else if(alphabets[i] == max) {
            tmp1 = i;
            tmp2 = i;
        }
    }

    if(tmp1 == tmp2) {
        printf("?");
    }
    else {
        printf("%c", 65 + tmp1);
    }

    return 0;
}
