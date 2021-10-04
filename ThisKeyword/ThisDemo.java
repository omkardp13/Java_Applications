class ThisDemo
{
  public static void main(String arg[])
  {
	  Demo obj=new Demo(10,20);
  }

}
class Demo
{
	public int x,y;
	
	public Demo()
	{
		System.out.println("Default Contructor");
		
	}
	public Demo(int a,int b)
	{
		this(); //Use no 1
		System.out.println("Parameterised Constructor"); 
		this.x=a;
		this.y=b;
	}
	public void fun()
	{
		System.out.println("Inside Fun");
		System.out.println("Value of x:"+this.x); //Use no 2
	}
 
   public void gun()
   {
     System.out.println("Inside Gun"); 	
     this.fun();  //Use no 3
   }
}