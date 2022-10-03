#include<stdio.h>

#include<string.h>

int DemCH(char s[],char ch[]) {

            int i,ok=1,dem=0;

            if(ch[0] >='a' && ch[0] <= 'z') {

                        for(i=0; i<strlen(s); i++) {

                                    if(s[i] == ch[0] || s[i] == ch[0] - 32) {

                                                dem++;

                                    }

                        }

            }

            if(ch[0] >='A' && ch[0] <= 'Z') {

                        for(i=0; i<strlen(s); i++) {

                                    if(s[i] == ch[0] || s[i] == ch[0] + 32) {

                                                dem++;

                                    }

                        }

            }

            printf("Ky tu: %c xuat hien %d lan trong chuoi: %s",ch[0],dem,s);

}

int main() {

            char s[100],ch[2];

            printf("Nhap chuoi ban dau: ");

            gets(s);

            fflush(stdin);

            printf("Nhap ky tu can dem: ");

            gets(ch);

            DemCH(s,ch);

            return 0;

}