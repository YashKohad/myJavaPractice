import java.util.Scanner;

public class myRevNumber
{

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		String myNum = sc.nextLine();
		
	System.out.println("You entered: "+myNum);
	
	int num= Integer.parseInt(myNum);
	System.out.println(num);
	
	String rev="";
	int len=myNum.length();
	
	for (int i=0;i<=len-1;i++)
	{
		int temp=num%10;
		rev=rev + String.valueOf(temp);
		num=num/10;
		
	}
	
	System.out.println(rev);

	}

}
