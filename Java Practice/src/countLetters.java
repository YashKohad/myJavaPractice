
public class countLetters
{

	public static void main(String[] args) 
	{
		String s="Pune Pune  Pune";
		int p=0;
		int u=0;
		int n=0;
		int e=0;
		int oth=0;
		int len=s.length();
		for(int i=0;i<len;i++)
		{
			if(s.charAt(i)=='P')
			{
				p++;
			}
			else if(s.charAt(i)=='u')
			{
				u++;
			}
			
			else if(s.charAt(i)=='n')
			{
				n++;
			}
			else if(s.charAt(i)=='e')
			{
				e++;
			}
			else
			{
				oth++;
			}
		}
		
        System.out.println("P= "+p+" U= "+u+" N= "+n+" E= "+e+" Other= "+oth);
	}

}
