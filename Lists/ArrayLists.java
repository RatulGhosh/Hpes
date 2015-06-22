package Lists;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by P045 on 18-06-2015.
 */
public class ArrayLists {
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        List<String> list1 = new ArrayList<String>();
        for(int i = 0;i<3;i++)
            list1.add(sc.nextLine());
        for(int i =0;i<3;i++)
            System.out.println(list1.get(i));
        for(int i = 0;i<3;i++)
            list1.add(sc.nextLine());
        for(int i =0;i<3;i++)
            System.out.println(list1.get(i));

    }

}
