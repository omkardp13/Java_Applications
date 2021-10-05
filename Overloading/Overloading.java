import java.lang.*;

class Demo
{
	//Overloading By Changing The Data Type
      public int Add(int No1,int No2)
	  {
                  System.out.println("Inside First Add");
				  return No1+No2;
	  }	
      public float Add(float No1,float No2)
	  {
                  System.out.println("Inside Second Add");
				  return No1+No2;
	  }	
//Overloading By Changing The Number Of Argument
      public int Add(int No1,int No2,int No3)
	  {
                  System.out.println("Inside Third Add");
				  return No1+No2+No3;
	  }	
//Overloading By Changing The Sequence Of Argument
      public void Fun(int i,float j)
	  {
                  System.out.println("Inside First Fun");
				  
	  }		  
	  //Overloading By Changing The Sequence Of Argument
      public void Fun(float i,int j)
	  {
                  System.out.println("Inside Second Fun");
				  
	  }		  
}
class Overloading
{
	public static void main(String args[])
	{
		System.out.println("Inside Main");
		Demo obj;
		obj=new Demo();
		System.out.println("Addition Of Two Integers:"+obj.Add(10,30));
		System.out.println("Addition Of Two Integers:"+obj.Add(10.1f,30.1f));
		System.out.println("Addition Of Three Integers:"+obj.Add(10,20,30));
		obj.Fun(12,2.3f);
		obj.Fun(3.4f,14);
	}
	
	
}