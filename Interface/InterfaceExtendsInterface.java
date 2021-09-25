interface Base
{
   
   void fun();
      	
}
interface Derived extends Base
{
	void gun();
}

class Marvellous implements Derived
{
   
   public void fun()
   {
	   System.out.println("Inside fun");
   }
   public void gun()
   {
	   System.out.println("Inside gun");
   }
}	

class InterfaceExtendsInterface
{
   public static void main(String args[])
   {
      Marvellous obj=new Marvellous();
	  obj.fun();
	  obj.gun();  
   }
}

