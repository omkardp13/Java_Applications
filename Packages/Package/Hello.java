import Marvellous.PPA.Mathematics;
import Marvellous.Python.Demo;
class Hello
{
	public static void main(String args[])
	{
       Mathematics mobj=new Mathematics();
       Demo pobj=new Demo();
        	
       int iRet=mobj.Add(10,11);
       System.out.println("Addition is:"+iRet);
	   pobj.fun();
	}
	
}