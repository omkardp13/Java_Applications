interface Hello
{
   int i=10;
   void fun();
   void gun();   	
}
interface Demo
{
   int i=20;
   void fun(int no);
}
class Marvellous implements Hello,Demo
{
   public void fun()
   {
	   System.out.println("Inside fun");
   }
   public void fun(int no)
   {
	   System.out.println("Inside fun with integer");
   }
   public void gun()
   {
	   System.out.println("Inside gun");
   }
}	

class ManyInterface
{
   public static void main(String args[])
   {
      Marvellous obj=new Marvellous();
	  obj.fun();
	  obj.gun();
	  obj.fun(11);
	  System.out.println("Value of i from Hello:"+Hello.i);
	  System.out.println("Value of i from Demo:"+Demo.i);
	  //System.out.println("Value of i from Hello:"+obj.i);
   }
}
