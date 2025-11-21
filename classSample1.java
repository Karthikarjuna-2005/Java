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
 Sample obj1=new Sample();
System.out.println(Sample.x);
Sample.display();
obj1.z=30;
System.out.println(obj1.z);
   }
 } 