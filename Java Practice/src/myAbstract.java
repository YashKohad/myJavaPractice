  abstract class Bank
{
 	int Emp;
 	void getname()
 	{
 		System.out.println("I am  in getname");
 	}
	abstract double ROI();
 	
}


class SBI extends Bank
{
	double ROI()
	{
		return 6;
	}
}

class HDFC extends Bank
{
	double ROI()
	{
		return 7;
	}
}


public class myAbstract 
{

	public static void main(String[] args)
	{
		Bank b=new SBI();
		System.out.println(b.ROI());
		
		b=new HDFC();
		System.out.println(b.ROI());
		

	}

}
