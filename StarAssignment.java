import java.util.*;
public class StarAssignment
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int a,b,c,d,a1,b1,c1,d1;
		a=b=c=d=500;a1=b1=c1=d1=0;
		int total = 500*(1000+500+100+50);
		int amount=0;boolean flag = false;
		String amt;
		String s,s1;
		while(true)
		{
			flag = false;
			total =(1000*d+500*c+100*b+50*a);
			System.out.println("Enter amount : ");
			amt = sc.nextLine();
			for(int i =0;i<amt.length();i++)
			{
				if(!(amt.charAt(i)>=48&&amt.charAt(i)<=57))
				{
					System.out.println("Enter valid amount");
					flag = true;
					break;
				}
			}
			if(flag == true)
				continue;

			amount = Integer.parseInt(amt);
			if(amount%50 != 0)
			{
				System.out.println("Amount should be in multiples of 50");
				continue;
			}
			else if(amount > total)
			{
				System.out.println("Your amount is larger than currently available amount in ATM");
				continue;
			}
			else
			{
				if((d-((int)amount/1000))>=0)
				{
					
					d1 = (int)amount/1000;
					d=d-d1;
					amount = amount-(1000*d1);
				}
				else
				{
					d1 = d;
					d = 0;
					amount = amount-(1000*d1);
				}
				if((c-((int)amount/500))>=0)
				{
					
					c1 = (int)amount/500;
					c=c-c1;
					
					amount = amount-(500*c1);
				}
				else
				{
					c1 = c;
					c = 0;
					amount = amount-(500*c1);
				}
				
				if((b-((int)amount/100))>=0)
				{
					
					b1 = (int)amount/100;
					b=b-b1;
					amount = amount-(100*b1);
				}
				else
				{
					b1 = b;
					b = 0;
					amount = amount-(100*b1);
				}
	
				if((a-((int)amount/50))>=0)
				{
					
					
					a1 = (int)amount/50;
					a=a-a1;
					amount = amount-(50*a1);
				}
				else
				{
					a1 = a;
					a = 0;
					amount = amount-(50*a1);
				}
			}
			System.out.println("Do you want receipt");
			s1=sc.nextLine();
			if(s1.equals("Yes"))
			{
				System.out.println("1000 X "+d1+" = "+(1000*d1));
				System.out.println("500 X "+c1+" = "+(500*c1));
				System.out.println("100 X "+b1+" = "+(100*b1));
				System.out.println("50 X "+a1+" = "+(50*a1));
				System.out.println("Thank you ");
			}
			System.out.println("Do you want to continue(Yes/No) ");
			
			s = sc.nextLine();
			if(s.equals("No"))
				break;
		}

	}
}
			
				
				
				
				
			
			