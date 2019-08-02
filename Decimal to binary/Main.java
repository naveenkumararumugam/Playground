#include<stdio.h>
int main()
{
  //Type your code here
  int n,m[100],remcount=0,i;
  scanf("%d",&n);
  while(n!=0) 
  {
       m[remcount++] = n%2;
       n=n/2;
  }
  for(i=remcount-1;i>=0;i--)
  {

  printf("%d",m[i]);
  }
  return 0;
}