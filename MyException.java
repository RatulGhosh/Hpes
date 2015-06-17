class MyException extends Exception
{
	String reason = "";
	MyException(){}
	MyException(String r)
	{
		reason = r;
	}
	
	public String getMessage()
	{
		return reason;
	}
}
		