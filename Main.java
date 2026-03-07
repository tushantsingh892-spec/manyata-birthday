class Max
{
double x;       //I'm try to use for circel different types of dimentation this variables.
double y;
double z;
double a;
double b;
double c;
double d;

void cs1()
{
System.out.println("Draw a Heart The size of heart is=30mm");
}
void cs2()
{
System.out.println("In middle of heart draw A circle with Hard red colour with circle diameter is 10mm ");
}
void cs3()
{
System.out.println("Write a name under the Circle with[i remember that day's]");
}
void cs4()
{
System.out.println("That is very Short time but i miss to Much In my hole life");
}
}
class Main
{
public static void main(String []args)
{
System.out.println("m1.x+m1.z-m1.c*m1.b");

    Max m1 = new Max();
    m1.cs1();
    m1.cs2();
    m1.cs3();
    m1.cs4();
Max m2 = new Max();
m2.x=10;
m2.y=12;
m2.z=14;
m2.a=15;
m2.b=16;
m2.c=19;
System.out.println(m2.c*m2.b+m2.x-m2.z);

}
}