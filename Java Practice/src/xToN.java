import java.util.Scanner;

public class xToN 
{
   
	static int MaxIter(int N)
	{
		int res=0;
		int x=0;
		while(x<N)
		{
		  if(x==0)
		  {
			x=x+1;
			res++;
		  }
		  else if(x!=0 && x%2==0)
		  {
			x=x*2;
			res++;
		  }
		  else if(x!=0 && x%2!=0)
		  {
			 x=x+1;
			 res++;
		  }
		 }
				return res;
		
	}
		
	public static void main(String[] args)
	{      
		System.out.println("Enter the value of N:");
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		
		int Max= MaxIter(N);
		
		System.out.println("Max no. of iterations to reach "+N+" is: "+Max);
		
	}

}
