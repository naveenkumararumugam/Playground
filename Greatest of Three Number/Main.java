#include <stdio.h>

int main()
{ 
    // type your code here
  int q,w,e;
  scanf("%d,%d,%d",&q,&w,&e);
   if((q>w)&&(q>e))
   {
       printf("%d",q);
   }
   else if(w>e)
   {
       printf("%d",w);
   }
   else
   {
       printf("%d",e);
   }
      return 0;
}