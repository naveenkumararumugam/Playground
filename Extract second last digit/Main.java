#include<stdio.h>
int main()
{
  int n,s,t;
  scanf("%d",&n);
  s=n%100;
  t=s/10;
  printf("%d",t);
  return 0;
}