package collection;

import java.util.ArrayList;
import java.util.Collections;

public class PracticeCollec {

	public static void main(String[] args) {
		ArrayList a=new ArrayList<>();
		a.add("saba");
		a.add(123);
		a.add("hi");
		a.add(null);
		a.add(0);
		
		System.out.println(a);
		System.out.println(a.size());
		System.out.println(a.contains(null));
		
		System.out.println(a.indexOf(123));
		System.out.println(a.remove(0));
		System.out.println(a);
		
		
		ArrayList list=new ArrayList();
		list.add(200);
		list.add(100);
		list.add(20);
		 Collections.sort(list);
		System.out.println(list);


		
		
	}
}
