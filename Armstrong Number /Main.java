#include <stdio.h>
#include<math.h>
int main() {
int n,sum = 0,lastdigit=0,expo=0,count=0;
  scanf("%d",&n);
  int t = n;
  while(t>0)
  {
    count++;
    t = t/10;
  }
  t=n;
  while(t>0)
  {
    lastdigit=t%10;
    expo = pow(lastdigit,count);
    sum=sum+expo;
    
    t = t/10;
  }
  if(sum == n)
  {
    printf("Armstrong Number");
  }
  else{
    printf("Not an Armstrong Number");
  }
  
	return 0;
}