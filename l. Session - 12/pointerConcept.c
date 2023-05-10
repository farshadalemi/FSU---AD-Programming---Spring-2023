#include <stdio.h>

int main()
{
    int v1;
    int *p1;

    v1 = 0;
    p1 = &v1;
    *p1 = 42;

    printf("v1   = %d\n", v1);
    printf("*p1  =%d\n", *p1);
    return 0;
}