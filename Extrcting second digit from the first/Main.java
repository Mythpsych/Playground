#include <stdio.h>
int main() {
  int n,a=0;
  scanf("%d",&n);
  while(n>100)
  {
    n = n/10;
  }
  a = n % 10;
  printf("%d",a);
	return 0;
}