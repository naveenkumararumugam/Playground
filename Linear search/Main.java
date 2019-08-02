#include<stdio.h>
int main()
{
  //Type your code here
   int size,search=0 ;
  scanf("%d",&size);
  int arr[size];
    
  for(int i=0;i<size;i++)
  {
    scanf("%d",&arr[i]);
  }
  scanf("%d",&search);
   for(int i=0;i<size;i++)
   {  
    if(search==arr[i])
    {
      printf("%d",i+1);
      return 0;
    }
  }
  printf("%d isn't present in the array.",search);
  
  return 0;
}