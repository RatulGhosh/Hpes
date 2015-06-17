import java.util.*;
import java.lang.*;
public class assignment
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    String st = sc.nextLine();
    System.out.println(getNumberOfWays(st));

  }
  public  static  long  getNumberOfWays(String st)
  {
    long  output1 = 0;
    String s1 = st.substring(1,st.length()-1);
    String [] s = s1.split(",");
    int b = Integer.parseInt(s[0]);
    int g = Integer.parseInt(s[1]);
    int p = Integer.parseInt(s[2]);
    System.out.println(p);
    /*int b = st.charAt(1)-48;
    int g = st.charAt(3)-48;
    int p = st.charAt(5)-48;*/
    if(b<4 && g<1 && p<5)
      return  0;
    else
    {
      for(int i = 4;i < p;i++)
      {
          output1 = output1 + (fact(b)/(fact(i)*fact(b-i)))*(fact(g)/(fact(p-i)*fact(g-(p-i))));
          System.out.println(output1);
      }
    }
    return output1;
  }
  public static long fact(int n)
  {
    int fact=1;
    if(n == 0)
      return 1;
    else
    {
      for(int i = 1;i <= n;i++)
      {
        fact=fact*i;
      }
      System.out.println(fact);
      return fact;
    }
  }
}
