class Unamed
{
	public static void main(String args[])
	{
		Demo obj1=new Demo();
		Demo obj2=new Demo(11,21);
	}
}

class Demo
{
	public int i,j;
	public static int x,y;
	{
		System.out.println("Inside unnamed");
		i=10;
		j=20;
		//Common Logic
	}
	public Demo()
	{
		System.out.println("Inside default conctructor");
	}
	public Demo(int a,int b)
	{
		System.out.println("Inside parameterised conctructor");
	}
	static
	{
		System.out.println("Inside static block");
	}
}