#include<stdio.h>
int main()
{
	//your code here
  long int n,f=1;
  scanf("%ld",&n);
  for(int i=1;i<=n;i++)
  {
    f=f*i;
  }
  printf("%ld",f);
  return 0;
}