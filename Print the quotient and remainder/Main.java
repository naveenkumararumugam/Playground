#include<stdio.h>
int main()
{
  int n=365,r,q;
  q=n/4;
  r=n%4;
  printf("Quotient: %d\nRemainder: %d",q,r);
  return 0;
}