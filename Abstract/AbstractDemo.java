class AbstractDemo
{
	public static void main(String args[])
	{
	 // Demo obj=new Demo();  Error	
	 Demo obj; //Allowed
	 obj=new Hello(); //Upcasting
	 obj.fun(); //fun of Hello
	 obj.gun(); // Demo
	 obj.sun();  //Hello
	 System.out.println(obj.i); //10
	 System.out.println(obj.j); //20
	}
}
abstract class Demo
{
	public int i,j;
	public Demo()
	{
		System.out.println("Inside constructor of demo");
		i=10;
		j=20;
	}
	public void fun()
	{
		System.out.println("Inside fun of demo");
	}
	public void gun()
	{
		System.out.println("Inside gun of demo");
	}
	public abstract void sun();  //virtual void sun()=0	
}

class Hello extends Demo
{
	public int x,y;
	public Hello()
	{
		System.out.println("Inside constructor of hello");
		x=10;
		y=20;
	}
	public void fun()  //Overridng
	{
		System.out.println("Inside fun of hello");
	}
	public void sun()
	{
		System.out.println("Inside sun of hello");
	}
}