package Lists;

import java.util.*;

/**
 * Created by P045 on 20-06-2015.
 */
public class Map<I, S> {
    public static void main(String[] args)
    {
        TreeMap<Integer, String> m = new TreeMap<Integer,String>();

        m.put(101,"Amit");
        m.put(102,"Ajay");
        m.put(103,"Karan");
        m.put(104,"Avinash");
        m.put(105,"Rahul");
        System.out.println(m);
        System.out.println(m.get(102));

        Set<Integer> keys = m.keySet();
        for(Integer key : keys){
            Integer id = key;
            String name = m.get(key);
            name = name.toUpperCase();
            System.out.println("[" + key + " : " + name + "]");
                    }

    }


}
