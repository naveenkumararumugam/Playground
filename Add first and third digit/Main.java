#include<stdio.h>
int main()
{
  int n,l,f,sum;
  scanf("%d",&n);
  l=n%10;
  f=n/100;
  sum=l+f;
  printf("%d",sum);
  return 0;
}