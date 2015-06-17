
public class User_calc implements Calculator
{
	public int addition(int a,int b)
	{
		return (a+b);
	}
	public int subtraction(int a,int b)
	{
		return (a-b);
	}     
	public int multiplication(int a,int b)
	{
		return (a*b);
	}     
	
	public int division(int a,int b)
	{
		try{
			return (a/b);
			}
		catch(Exception e){
			System.out.println("Error : "+e.getClass());
			System.out.println("Reason : "+e.getMessage());
			return 0;
		}
	} 
}
		