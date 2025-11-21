import java.util.Scanner;
class InputReader
{
 public static void main(String args[])
{
 Scanner sc=new Scanner(System.in);
System.out.println("Enter a number");
byte b=sc.nextByte();
short s=sc.nextShort();
int a =sc.nextInt();
long l=sc.nextLong();

System.out.println("Entered byte value is:"+b");
System.out.println("Entered short value is:"+s");
System.out.println("Entered int value is:"+a");
System.out.println("Entered long value is:"+l");
}
}




