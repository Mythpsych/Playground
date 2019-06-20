#include<stdio.h>
int main()
{
  int n;
  int a,b;
  scanf("%d",&n);
  a=n%100;
  b=a/10;
  printf("%d",b);
  return 0;
}