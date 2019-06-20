#include <stdio.h>
int main() {
  int n;
  int temp = 0;
  scanf("%d",&n);
  int last = n%10, first = n;
   while(n >= 10)
    {
        n = n / 10;
    }
    first = n;
    temp = last + first;
    printf("%d",temp);
		return 0;
}