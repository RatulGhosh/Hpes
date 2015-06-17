import java.util.Scanner;
import java.util.Date;
public class calc_initial
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
		int b = sc.nextInt();
		long startTime = System.currentTimeMillis();
		User_calc ob = new User_calc();
		System.out.println(ob.addition(a,b));
		System.out.println(ob.subtraction(a,b));
		System.out.println(ob.multiplication(a,b));
		System.out.println(ob.division(a,b));
		long endTime   = System.currentTimeMillis();
        long totalTime = endTime - startTime;
        System.out.println(totalTime);
	}
}