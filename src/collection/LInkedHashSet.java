package collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class LInkedHashSet {

	public static void main(String[] args) {
		LinkedHashSet<Object> set=new LinkedHashSet<Object>();
		    set.add("saba");
		    set.add(123);
		    set.add('s');
		    set.add(10);
		    set.add(null);
		    set.add(null);
		    set.add('s');
		    System.out.println(set);
		    
		    ArrayList<Object> list =new ArrayList<Object>(set);
		    list.add('A');
		    list.add(null);
		    
		    Iterator<Object> i=list.iterator();
		    while(i.hasNext())
		    {
		    	System.out.println(i.next());
		    }
		    
			}

	}


