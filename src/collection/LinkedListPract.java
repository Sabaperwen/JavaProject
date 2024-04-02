package collection;

import java.util.LinkedList;

public class LinkedListPract {

	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.add(123);
		list.add("saba");
		list.add("number");
		list.add(200);
		list.add(null);
		list.add(0);
		list.add(null);

		System.out.println(list);
		System.out.println(list.size());
		System.out.println(list.contains("saba"));
		System.out.println(list.indexOf("number"));
		list.remove(0);

		System.out.println(list);

		list.addFirst(500);
		list.addLast(1000);
		System.out.println(list);
		System.out.println(list.getFirst());
		System.out.println(list.getLast());
		for (Object obj : list) {
			System.out.println(obj);
		}

		list.removeFirst();
		list.removeLast();
		System.out.println(list.getFirst());
		System.out.println(list.getLast());
	}

}
