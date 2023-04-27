
static  boolean isPrime(int inputArgument)
{
    if(inputArgument<=1)
    {
        return false;
    }
    for(int i=2;i<=inputArgument/2;i++)
    {
        if((inputArgument%i)==0)
            return  false;
    }
    return true;
}