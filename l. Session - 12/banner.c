#include <stdio.h>

int main(){

    char Hletter[] = "*******\n   *   \n   *   \n   *   \n*******\n\n";
    char Eletter[] = "*******\n*  *  *\n*  *  *\n*  *  *\n*  *  *\n\n";
    char Lletter[] = "*******\n*\n*\n*\n*\n\n";
    char Oletter[] = "*******\n*     *\n*     *\n*     *\n*******\n\n";
    char Rletter[] = "*******\n   *  *\n   ** *\n * ****\n*\n\n";
    char Wletter[] = "*******\n*     \n***    \n*      \n*******\n\n";
    char Dletter[] = "*******\n*     *\n*     *\n *   * \n  ***  \n\n";
    
    // “Hello World” 
    printf("%s%s%s%s%s", Hletter, Eletter, Lletter, Lletter, Oletter);
    printf("\n\n\n%s%s%s%s%s", Wletter, Oletter,Rletter, Lletter, Dletter);
    return 0;
}