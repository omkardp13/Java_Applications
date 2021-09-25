interface Hello
{
   int i=10;
   void fun();
      	
}
class Demo
{
   public void gun()
   {
	   System.out.println("Inside Demo gun");
	}
}
class Marvellous extends Demo implements Hello
{
   
   public void fun()
   {
	   System.out.println("Inside fun");
   }
}	

class ClassInterface
{
   public static void main(String args[])
   {
      Marvellous obj=new Marvellous();
	  obj.fun();
	  obj.gun();  
   }
}
