// INCLUDE HEADER FILES NEEDED BY YOUR PROGRAM
// SOME LIBRARY FUNCTIONALITY MAY BE RESTRICTED
// DEFINE ANY FUNCTION NEEDED
// FUNCTION SIGNATURE BEGINS, THIS FUNCTION IS REQUIRED
#include <stdio.h>
int main()
{ 
   int n,m,g,i;
   scanf("%d\n%d",&n,&m);
   g = n>m? m : n;
   for(i=g;i>=1;i--)
  {
   	if((n%i==0)&&(m%i==0))
    {
      printf("%d",i);
    break;
    }
  }

   return 0;
}