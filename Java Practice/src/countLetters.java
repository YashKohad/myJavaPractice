public class countLetters
{
	public static void main(String[] args) 
	{
		String s="Pune Pune Pune";
		int p_cnt=0;
		int u_cnt=0;
		int n_cnt=0;
		int e_cnt=0;
		int oth_cnt=0; 
		int len=s.length();
		for(int i=0;i<len;i++)
		{
			if(s.charAt(i)=='P')
			{
				p_cnt++;
			}
			else if(s.charAt(i)=='u')
			{
				u_cnt++;
			}
			
			else if(s.charAt(i)=='n')
			{
				n_cnt++;
			}
			else if(s.charAt(i)=='e')
			{
				e_cnt++;
			}
			else
			{
				oth_cnt++;
			}
		}
		
        System.out.println("P= "+p_cnt+" U= "+u_cnt+" N= "+n_cnt+" E= "+e_cnt+" Other= "+oth_cnt);
	}

}
