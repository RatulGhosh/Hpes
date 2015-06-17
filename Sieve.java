import java.util.Scanner;
import java.util.Date;
public class Sieve
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int arr[];
        int n = sc.nextInt();
		long startTime = System.currentTimeMillis();
        arr = new int[n];
        for(int i = 1;i<n;i++)
        {
            if(arr[i] == 0)
            {
                System.out.println(i+1);
                func(arr,i+1);
            }
        }
        long endTime   = System.currentTimeMillis();
        long totalTime = endTime - startTime;
        System.out.println(totalTime);
    }
    public static void func(int arr[],int a)
    {
        int i = 2;int t = 0;
        while((i*a) <= arr.length)
        {
            t = i*a;
            arr[t-1] = 1;
            i++;
        }
    }
}
            
        
        