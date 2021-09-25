class StaticBlock
{    
    static
	{
		System.out.println("Static Block Of Main");
		
	}
	public static void main(String args[])
	{ 
	   System.out.println("Inside Main");
	   //System.out.println(Demo.x);
	 //  Demo obj;
	     Demo obj1=new Demo();
		 Demo obj2=new Demo();
	}
}

class Demo
{
	public int i,j;
	public static int x,y;
	
	static
	{
		System.out.println("Inside Static Block");
		x=10;
		y=20;
	}
	
	public Demo()
	{
		System.out.println("Inside Constructor");
		i=10;
                j=20;		
	}
}