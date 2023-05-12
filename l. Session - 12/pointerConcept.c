#include <stdio.h>

int main()
{
    int v1;
    int *p1;
    int *p2;
    int p3;
    int *p4;


    v1 = 0;
    p1 = &v1;
    *p1 = 42;
    p2 = p1;
    p4 = &p3;


    printf("v1   = %d\n", v1);
    printf("*p1  = %d\n", *p1);
    printf("*p2  = %d\n", *p2 );
    printf("*p3  = %d\n", *p4);

    printf("address of v1  = %p\n", &v1);
    printf("p1 pointer to  = %p\n", p1);
    printf("p2 pointer to  = %p\n", p2);
    printf("p2 pointer to  = %p\n", *p4);


    return 0;
}