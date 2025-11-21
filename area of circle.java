import java.util.Scanner;
class FormattedNumber
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
float pie=3.14f;
float r=sc.nextFloat();
float area=pie*(r*r);
System.out.println("The area of circle is :"+area);
}
}