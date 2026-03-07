//How to find out Average By Using of for loop. 

class Ishq
{
public static void main(String []args)
{
int i,s=0;  
                 //We are creating here memory for create Average program.
for(i=0;i<args.length;i++)     
                //it is use for run the line N number of time.
{
s=s+Integer.parseInt(args[i]);
}
//System.out.println(s/4);
System.out.println("Average is "+s/args.length);


//System.out.println(Integer.parseInt(args[i]));
//Integer paeseInt use for print integer type of data.

   //System.out.println(args[0]);
   //System.out.println(args[1]);
   //System.out.println(args[2]);
   //System.out.println(args[3]);
   //System.out.println(args[4]);
}
}




