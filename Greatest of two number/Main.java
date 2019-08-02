#include<stdio.h>
int main()
{
  int n1=6,n2=8;
  scanf("%d%d",&n1,&n2);
  if(n1>n2)
    printf("num1 is the greatest");
  else if(n1<n2)
    printf("num2 is the greatest");
  else
    printf("Both number Equal");
  return 0;
}