#include<stdio.h>
int main()
{
  int n,sum=0,k=0;
  scanf("%d",&n);
  while(n>0)
  {
  k=n%10;
   sum=sum+k;
   n=n/10;
  }printf("%d",sum);
  return 0;
}