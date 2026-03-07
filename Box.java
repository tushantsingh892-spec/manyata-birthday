class Sanu     //#Sanu is a User define Data type.
{
int x;    //it's called memory //instance(Object)member Variable
int y;    //it's a type of memory
int z;    //it's also a type of memory

void cs1()    //it's a type of instance(Object)member Function
{
System.out.println("Rigester");  //it's use for Printing a String which written under this ("").
}
void cs2()
{
System.out.println("Sighin");
}
void cs3()
{
System.out.println("Aj bhoj me Kon Kon jayda khana khya hai!!");
}
}

class Box     //This is main class (or) we called as a Master class.
{
public static void main(String []args)   //
{
System.out.println("Nidhi Budbak Hai Kab Usko Diamg aayega!!");

Sanu m1 = new Sanu();      //it's a type of Object 
    m1.cs1();
    m1.cs2();
  m1.x=10;
  m1.y=15;
  m1.z=20;
{
System.out.println(m1.x*m1.y+m1.z);
System.out.println(m1.z*m1.x);
}

m1 = new Sanu();       //it's a Object. A object work as a store an number of program.
      m1.cs3();
}
}
