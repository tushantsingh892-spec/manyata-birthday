class Mukesh
{
void box1()      //instant(Object)member function
{
double x=7.30;
double y=5.25;
double diff=x-y; 
System.out.println(diff);
}
void box2()     //instant(Object)member function
{
int n=0;
System.out.println("value of n");
}
int x;         //instant(Object)member variable
int y;      //instant(Object)member variable
}
class Maya
{
public static void main(String []args)
{
int a= 10;
int b=20;
int sum = a+b;

System.out.println(a+"+"+b+"="+sum);
Mukesh m1=new Mukesh();
}
}