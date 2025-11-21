class Sum
{
 public static void main(String args[])
{
 int number=1234567;
int sum=0;
while(number!=0)
{
 sum+=number%10;
number/=10;
}
System.out.println("Sum of individual digits of a number is :"+sum);
 }
}