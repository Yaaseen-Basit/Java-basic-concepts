class Hello
{

 long factorial(int n)
{ 
if(n==0||n==1)
return 1;
else
 return n*factorial(n-1);

}
}

  class lab306
{
public static void main(String args[])
{
Hello h=new Hello( );
int n=4;
 long fac= h.factorial(n);
System.out.println(" Factorial is"+fac);

}


}    