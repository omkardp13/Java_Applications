import java.util.*;

class Command
{
	public static void main(String args[])
	{
	  System.out.println("Total Number Of Arguments:"+args.length);
      
      System.out.println("Command line arguments are:");
      for(int i=0;i<args.length;i++)
	  { 
         System.out.println(args[i]);
	  }		  
	}
}