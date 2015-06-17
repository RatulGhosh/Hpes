import java.util.Scanner;
import java.util.Date;
public class onerload_demo
{
    public int x;
	public static void main(String[] args)
    {
		long startTime = System.currentTimeMillis();

		System.out.println("Hello");
		main();
        long endTime   = System.currentTimeMillis();
        long totalTime = endTime - startTime;
        System.out.println(totalTime);
    }
    public static void main()
    {
		System.out.println("Hi");
    }
}
            