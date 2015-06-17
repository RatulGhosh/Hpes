import java.util.Scanner;
//import MyException;
public class User_defined_exception
{
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		String st = sc.nextLine();
		for(int i = 0;i<st.length();i++)
		{
			if(!((st.charAt(i)>64&&st.charAt(i)<91)||(st.charAt(i)>96&&st.charAt(i)<123)))
			{
				MyException ae;
				String r = "InvalidCharacterFoundException";
				ae = new MyException(r);
				try{
				throw ae;
				}
				catch(Exception e) {
					System.out.println(e.getClass());
					System.out.println(e.getMessage());
					break;
				}
			}
		}
	}
}
			
				