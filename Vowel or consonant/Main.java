#include<stdio.h>
int main()
{
  //type your code here
 char h;
  scanf("%c",&h);
  if(h=='A' || h=='E' || h=='I' || h=='O' || h=='U' || h=='a' || h=='e' || h=='i' || h=='o' || h=='u')
  	printf("Vowel");
  else
    printf("Consonant");
  return 0;
}