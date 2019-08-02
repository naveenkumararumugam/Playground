#include<stdio.h>
int main()
{
  //Type your code here
  float opp,adj,hyp;
  scanf("%f\n%f",&opp,&adj);
  hyp=sqrt((opp*opp)+(adj*adj));
  printf("%0.2f",hyp);
  return 0;
  
}