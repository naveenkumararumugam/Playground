#include <stdio.h>
int main()
{

  char var;
  scanf("%c",&var);
  if(var>='a' && var<='z')
    printf("%c",var-32);
  else if((var>='A') && (var<='Z'))
    printf("%c",var+32);
	return 0;
}