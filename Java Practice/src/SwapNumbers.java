import java.util.Scanner;

public class SwapNumbers
{

	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter first number:");
		int a=sc.nextInt();
		System.out.println("Enter second number:");
		int b=sc.nextInt();
		
		System.out.println("First no. is :"+a);
		System.out.println("Second no. is :"+b);
		
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("First no. is :"+a);
		System.out.println("Second no. is :"+b);
				
		
	}

}
