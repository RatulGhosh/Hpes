package Lists;

import java.util.Scanner;

/**
 * Created by P045 on 21-06-2015.
 */

/*import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        List<Integer> list = new ArrayList<Integer>();
        int n = sc.nextInt();
        int p = sc.nextInt();
        int x = sc.nextInt();
        //int[]arr = new int[n];
        for (int i = 0; i < n; i++) {
            //arr[i]=sc.nextInt();
            list.add(sc.nextInt() * p);
            p = p - x;

        }
        int max = Collections.max(list);
        int c = 1;
        for (int i : list) {
            if (i == max)
                break;
            c++;
        }

        System.out.println(c);
    }
}*/

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.nextLine();
        String s = sc.nextLine();
        int c = 0;
        for (int i = 0; i < s.length(); i++) {
            /*for(int j = 0;j<s.length()-i-1;j++)
            {
                c = c+ x(s.substring(i,(s.length()-j)));
            }*/

           // c = c + x(i);
        }
        //System.out.print(c+s.length());


    }


}
    /*public static  int  x(int i)
    {
        /*if(s.charAt(0) == s.charAt(s.length()-1))
            return 1;
        else
            return 0;


    }
}*/
