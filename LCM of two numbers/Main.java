#include<stdio.h>
int main()
{
  //Type your code here
    int n,m ,l,i,lcm;
    scanf("%d%d",&n,&m);
    i=n>m?m:n;
    for(;i>=1;i--)
   {
  	if((n%i==0) && (m%i==0))
    {
      l=i;
      break;
    }
  }
  lcm=(n*m)/l;
  printf("%d",lcm);
  return 0; 
}