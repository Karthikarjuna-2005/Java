class Sample
{
static int x=10;   //static variable
static void display()
{
int y=10;      //local variable
System.out.println("I am a local variable:"+y);
}
}
class ScopeOfVariables
{
public static void main(String args[])
{
System.out.println(Sample.x);
Sample.display();
}
}