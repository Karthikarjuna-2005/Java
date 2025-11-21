class ScopeOfVariables
{
int instanceVar;
static int num=10;
public static void main(String args[])
{
ScopeOfVariables s1=new ScopeOfVariables();
ScopeOfVariables s2=new ScopeOfVariables();
s1.instanceVar=10;
s2.instanceVar=8;
System.out.println("The variable value from object1: "+s1.instanceVar);
System.out.println("The variable value from object2: "+s2.instanceVar);
System.out.println("The variable value from "+num);
}
}