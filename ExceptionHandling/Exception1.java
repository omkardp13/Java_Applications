import java.util.*;

class Exception1
{
	public static void main(String args[])
	{
		int Arr[]=new int[5];
		Arr[0]=10;Arr[1]=20;Arr[2]=30;Arr[3]=40;Arr[4]=50;
		int index=0;
		
		Scanner sobj=new Scanner(System.in);
		System.out.println("Enter Index Of Array:");
		index=sobj.nextInt();
		try
		{
		    System.out.println("Data is:"+Arr[index]);
	        }
		catch(ArrayIndexOutOfBoundsException obj)
		{
	        System.out.println("Exception Occured:"+obj);
		}
		finally
		{
			System.out.println("Application Gets Terminated");
		}
		System.out.println("End Of Main");
	}
	
}