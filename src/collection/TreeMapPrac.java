package collection;

import java.util.TreeMap;
import java.util.Map.Entry;

public class TreeMapPrac{

	public static void main(String[] args) {
    TreeMap<Integer, Object> tree=new  TreeMap<Integer, Object>();
    tree.put(10, 'A');
    tree.put(40,"hi");
//  tree.put(null, 'B');key cannot be null but value can be null
    tree.put(30, null);
//    tree.put(null, 20);
    tree.put(90, null);
    
    System.out.println(tree);
    System.out.println(tree.containsKey(40));
    System.out.println(tree.containsValue(null));
    System.out.println(tree.replace(10,"saba"));

    for(Entry<Integer,Object> m:tree.entrySet())
    {
 	   System.out.println(m.getKey()+" "+m.getValue());
    }
 	}

	}


