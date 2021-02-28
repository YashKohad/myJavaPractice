

	class vehicle
	{
		void name()
		{
			System.out.println("I am in vehicle");
		}
	}
	
	class car extends vehicle
	{
		void name()
		{
			System.out.println("I am in car");
		}
	}
	
	class maruti extends car
	{
		void name()
		{
			System.out.println("I am in Maruti");
		}
	}
	
public class myOverriding 
{

	public static void main(String[] args)
	{
		
     vehicle x=new vehicle();
     x.name();
     x=new car();
     x.name();
     x=new maruti();
     x.name();
     
     car y=new car();
     y.name();
     y=new maruti();
     y.name();
     
     maruti z =new maruti();
     z.name();
     
     
	}

}
