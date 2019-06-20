#include <stdio.h>
int main() {
	//Type your code
  int n,sum=0;
  scanf("%d",&n);
  int t=n;
  while(t>0)
  {
    int l=t%10;
    int fact=1;
    for(int i=1;i<=l;i++)
    {
      fact=fact*i;
    }
    t=t/10;
    sum=sum+fact;
  }
  if(sum==n)
    printf("Yes");
  else
    printf("No");
	return 0;
}