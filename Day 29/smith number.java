/*Given a number n, the task is to find out whether this number is a Smith number or not. A Smith number is a composite number whose sum of digits is equal to the sum of digits of its prime factors.

Example 1:

Input:
n = 4
Output:
1
Explanation:
The sum of the digits of 4 is 4, and the sum of the digits of its prime factors is 2 + 2 = 4.*/
//method 1
class Solution {
    static int smithNum(int n) {
        // code here
        int t=n;
        int sumdigit=0;
        int sumprime=0;
        if(n<=2) return 0;
        //sum of digits
        while(t>0){
             sumdigit += t % 10;
            t=t/10;
        }
        //sum of prime number
        int count =0;
        int i=2;
            while(n>1){
                if(n%i==0){
                    sumprime+=i;
                    n=n/i;
                    count++;
                }
                else{
                    i++;
                }
            }
          if(count==1) return 0; //prime number
            //smith number
            if(sumdigit==sumprime) return 1;
            else return 0;
    }
}

//method 2
class Solution {
    static int smithNum(int n) {
        if (n <=2)
            return 0;

        int sum = digitSum(n);
     
        int sumprime=prime(n);
        if(sum==sumprime)
        return 1;
        return 0;
    }

    // Helper function to calculate the sum of digits
    private static int digitSum(int num) {
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }
  public static int prime(int n)
    {

int sum=0;
int temp=n;
if(n%2==0)
{
   int count=0;
    while(n>0&&n%2==0)
    {
        n=n/2;
    count=count+2;
    }
    sum+=count;
}
int tempn=n;
int i=3;
while(n>0&&i<=(tempn/2))
{
    if(n%i==0)
    {
        int a=0;
        while(n>0&&n%i==0)
        {
            n=n/i;
            a++; //power of prime fcator
        }
        int call=digitSum(i);//finding the sum of digits of prime factors
        
        sum=sum+(call*a);
    }
    //System.out.print(a);
    i=i+2;
}
int j=0;
//System.out.print(n);
if(n!=1&&n!=temp)
{
j=digitSum(n);
}
//System.out.print(j);
sum+=j;
        
        return sum;
    }
    
    }
