#include <stdio.h>

int main(){

    int input;
    int *InputPointer;
    int farshad;
    double mapsa;

    input = 100;
    InputPointer = &input;
    *InputPointer = 101;
    farshad = farshad;
    mapsa = mapsa;

    printf("input  == %d\n", input);
    printf("input  == %d\n", InputPointer);
    printf("input  == %d\n", farshad);
    printf("input  == %d\n", mapsa);

}

/*
OUTPUT:

input  == 101
input  == 6422284
input  == 3633152
input  == 4200848

*/