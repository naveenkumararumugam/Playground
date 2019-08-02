#include <stdio.h>
int main()
{
  	//Your code here   
   int b,p,s=1;
  scanf("%d\n%d",&b,&p);
 if(p>=0)
 {
   for(int i=1;i<=p;i++)
   {
    s=s*b;
   }
   printf("%d",s);
 }
  else
  {
  printf("Wrong input");
  }

    return 0;
}