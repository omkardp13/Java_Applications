import java.util.*;

class Exception2
{
	public static void main(String args[])
	{
		int no1=0,no2=0;
		float result=0.0f;
		
		Scanner sobj=new Scanner(System.in);
		System.out.println("Enter First Number:");
		no1=sobj.nextInt();
		System.out.println("Enter Second Number:");
		no2=sobj.nextInt();
		try
		{
		result=no1/no2;
		System.out.println("Division is:"+result);
		}
		catch(ArithmeticException obj)
		{
			System.out.println("Arithmatic Exception Occured");
			
		}catch(ArrayIndexOutOfBoundsException obj)
		{
			System.out.println("Array index Exception Occured");
		}
		catch(Exception obj) //Generic catch block
		{
			System.out.println("Exception Occured");
		}
		finally
		{
			System.out.println("Inside Finally");
		}
		
	}
	
}