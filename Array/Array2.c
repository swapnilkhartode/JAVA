#include<stdio.h>

int main()
{
    int a[5]={10,20,30,40,50};
    int *b;
    b=a;
    b[2]=200;
    printf("Display Array values");
    for(int i=0;i<5;i++)
    {
        printf("%d\t",a[i]);
    }

    return 0;

}