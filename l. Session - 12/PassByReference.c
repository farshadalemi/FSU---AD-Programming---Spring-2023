#include <stdio.h>

void changeContent(int *x){
    printf("In changeContent function: x = %d\n", *x);
    *x = 10;
    printf("In chaneContent funtion: x = %d\n", *x);
}

int main(){

    int x;

    x = 5;
    printf("x = %d\n", x);

//I pass address of memory location by adding & before variable
    changeContent(&x);
    printf("x = %d\n", x);
    return 0; 
}