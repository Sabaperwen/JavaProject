package collection;

import java.util.HashMap;
import java.util.Map.Entry;

public class HashMapPract {

	public static void main(String[] args) {
   HashMap<Integer, Object> map=new HashMap<Integer,Object>();
   map.put(10, 'A');
   map.put(40,"hi");
   map.put(null, 'B');
   map.put(30, null);
   map.put(null, 20);
   map.put(90, null);
   
   System.out.println(map);
   System.out.println(map.containsKey(40));
   System.out.println(map.containsValue(null));
   System.out.println(map.replace(10,"saba"));

   for(Entry<Integer,Object> m:map.entrySet())
   {
	   System.out.println(m.getKey()+" "+m.getValue());
   }
	}

}
