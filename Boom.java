class Boom
{
public static void main(String []args)
{
int x= Integer.parseInt("")     //Desimal num ka by defoult System hai(because it's stsrted 1-10)

      Long x1= Long.valueOf("101110");
      //Integer x1= Integer.valueOf("10110",2);
long y= x1.longValue();         //We use wrap class to change premitive to non primitive data type (else) non primitive to primitive data type 
        
System.out.println(x);
System.out.println(y);

}
}