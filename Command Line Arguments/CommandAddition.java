import java.util.*;

class CommandAddition
{
	public static void main(String args[])
	{
	  if(args.length==2) 
	  {   
           int no1=Integer.parseInt(args[0]);
		   int no2=Integer.parseInt(args[1]);
          System.out.println("Addition is:"+(no1+no2));
	  }		  
	}
}