#include <stdio.h>
int main() {
	int t, sum=0,remainder=0;
  scanf("%d",&t);
  while(t > 0)
  {
  remainder = t % 10;
    sum = sum + remainder;
    t = t / 10;
  }
  printf("%d",sum);
	return 0;
}