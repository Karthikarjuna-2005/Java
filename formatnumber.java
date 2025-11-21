class FormattedNumber 
{
public static void main(String args[])
{
float f=38.45456927f;
String s=String.format("%.4f",f);
System.out.println(s);
System.out.println("%.2f",f);
System.out.println("%.4f",f);
}
}
