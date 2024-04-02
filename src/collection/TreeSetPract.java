package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetPract {

	public static void main(String[] args) {
		 TreeSet<Integer> set=new TreeSet<Integer>();
		    set.add(123);
		    set.add(12);
		    set.add(65);
		    set.add(10);
		    
		    set.add(5);
		    System.out.println(set);
		    System.out.println(set.descendingSet());
		    
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


