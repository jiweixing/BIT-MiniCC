#include "stdio.h"
#include "conio.h"
int main()
{
  int i,j,k;
  printf("\n");
  for(i=1;i<5;i++) /*xxx*/
    for(j=1;j<5;j++)
      for (k=1;k<5;k++)
      {
        if (i!=k&&i!=j&&j!=k) /*ddssdd*/
        printf("%d,%d,%d\n",i,j,k);
      }
}