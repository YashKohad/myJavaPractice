

interface demoInterface
{
	 void abc();
	 void def();

}


abstract class demo implements  demoInterface
{
	public void abc()
	{
		System.out.println("Inside abc");
	}
	
	
}


class demo1 extends demo
{
	public void def()
	{
		System.out.println("Inside def");
	}
}


public class myInterface
{

	public static void main(String[] args) 
	{
		
      demo1 d=new demo1();
      d.abc();
      d.def();
	}

}
