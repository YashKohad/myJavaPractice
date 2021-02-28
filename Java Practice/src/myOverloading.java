
public class myOverloading
{

 static float area(float x)
 {
	System.out.println("1 executed");
	return x*x;
 }

static double area(double x,double y)
{
	System.out.println("2 executed");
	return x*y;
}

static int area(int x,int y )
{
	System.out.println("3 executed");
	return x*y;
}

	public static void main(String[] args)
    {
		System.out.println(area(5.0,6.0));

	}

}
