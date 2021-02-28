import java.util.Scanner;

public class Palindrome_String
{

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your string:");
		String original=sc.nextLine();
		String rev="";
		System.out.println("Original is :"+original);
		int len=original.length();
		
		for(int i=len-1;i>=0;i--)
		{
			rev=rev+ original.charAt(i);
		}
		
		System.out.println("Reverse is :"+rev);
		
		if(original.equals(rev))
		{
			System.out.println("Palindrome");
		}
		else
		{
			System.out.println("Not a Palindrome");
		}

		

	}

}
