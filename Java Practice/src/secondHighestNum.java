
public class secondHighestNum
{

	public static void main(String[] args) 
	{
		int arr[]= {166,3552,24,257,237,99,634};
		int max=0;
		int pos=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>max)
			{
			 max=arr[i];
			 pos=i;
			}
			
		}
		System.out.println("Max no. "+max+" is at position "+pos);
		int Sec_max=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>Sec_max && i!=pos)
			{
				max=arr[i];	
				pos=i;
			}
			
		}
		System.out.println("Second Max no. "+max+"  is at position "+pos );

	}

}
