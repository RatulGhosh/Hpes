import java.util.Scanner;
public class Occurence
{
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		String st = sc.nextLine();
		int c = 0;
		for(int i = 0;i < 26;i++)
		{
			c=0;
			for(int j = 0;j < st.length();j++)
			{
				if((char)(65+i) == st.charAt(j)||((char)(97+i) == st.charAt(j)))
				{
					if(c == 0)
					{
						System.out.print(st.charAt(j)+" = "+(j));
						c++;
					}
					else
						System.out.print(" , "+(j));
				}
			}
			if(c!=0)
				System.out.println();
		}
	}
}