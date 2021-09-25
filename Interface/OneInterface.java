import java.util.*;

interface Circle
{
   float PI=3.14f; //public static final
   float area(float radius); //public abstract
   float circumferance(float radius);   
}

class Demo implements Circle
{
    public float area(float radius)
	{
		float Res=0.00f;
		Res=PI*radius*radius;
		return Res;
		
	}  
    public float circumferance(float radius)
	{
		float Res=0;
		Res=2*PI*radius;
		return Res;
	}
	
}

class OneInterface
{
	public static void main(String args[])
	{
		Scanner sobj=new Scanner(System.in);
		System.out.println("Enter Radius:");
		float value=sobj.nextFloat();
		Demo obj=new Demo();
		float fRet=obj.area(value);
		System.out.println("Area Is:"+fRet);
		fRet=obj.circumferance(value);
		System.out.println("Circumference Is:"+fRet);
		System.out.println("Value Of PI Is:"+Circle.PI); //Circle class member public and static
	  //  Circle.PI=2.13f; //Error-Circle class member final 
	}
}