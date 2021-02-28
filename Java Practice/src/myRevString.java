import java.util.Scanner;

public class myRevString 
{

	public static void main(String[] args)
	{
	 Scanner sc=new Scanner(System.in);
     System.out.println("Enter your string");
     String str=sc.nextLine();
     System.out.println("You entered: "+str);
     String rev="";
     int len=str.length();
     
     for(int i=len-1;i>=0;i--)
     {
    	 rev=rev+ str.charAt(i);
     }
     
     System.out.println("Reverse String is:"+ rev);
	}

}
