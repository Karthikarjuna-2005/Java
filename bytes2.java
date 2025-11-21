import java.util.Scanner;
class InputReader
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
  
System.out.println("Enter a number");
byte b=sc.nextByte();
short sh=sc.nextShort();
int a=sc.nextInt();
long l=sc.nextLong();

char c=sc.next().charAt(0);

String s=sc.next();
sc.nextLine();
String ss=sc.nextLine();

 System.out.println("entered byte value is:"+b);
 System.out.println("entered short value is:"+sh);
 System.out.println("entered int value is:"+a);
 System.out.println("entered long value is:"+l);
 System.out.println("entered character value is:"+c);
 System.out.println("entered string value is:"+s);
 System.out.println("entered String entire line value is:"+ss);
}
}
