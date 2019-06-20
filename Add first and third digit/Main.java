#include<stdio.h>
int main()
{
  int n;
  scanf("%d",&n);
  int f,l,sum;
  f=n/100;
  l=n%10;
  sum=f+l;
  printf("%d",sum);
  return 0;
}