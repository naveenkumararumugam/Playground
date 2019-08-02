#include<stdio.h>
int main()
{
	//type your code here
  int n,a,d,term1,term2,nthterm;
  scanf("%d",&n);
  if(n%2==1)
  {
  a=0, d=2;
    term1=(n+1)/2;
    nthterm=a+((term1-1)*d);
    printf("%d",nthterm);
  }
  else
  {
  a=0, d=1;
    term2=n/2;
    nthterm=a+((term2-1)*d);
    printf("%d",nthterm);
  }
  return 0;
}