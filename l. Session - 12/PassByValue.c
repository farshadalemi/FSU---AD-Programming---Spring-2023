#include <stdio.h>

void changeContent(int x){
    printf("In changeContent function: x = %d\n", x);
    x = 10;
    printf("In changeContent function: x = %d\n", x);
}

int main(){
    int x;

    x = 5;
    printf("x = %d\n", x);

    changeContent(x);
    printf("x = %d\n", x);

    return 0;
}