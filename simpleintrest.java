class CommandLineArgument
{
public static void main(String args[])
{
 int principle =Integer.parseInt(args[0]);
 int time=Integer.parseInt(args[1]);
 int rate=Integer.parseInt(args[2]);
 int intrest=(principle*time*rate)/100;
int amount=principle+intrest;
System.out.println("intrest:"+intrest);
System.out.println("amount:"+amount);
}
} 

 