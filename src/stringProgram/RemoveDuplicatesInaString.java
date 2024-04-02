package stringProgram;

import java.util.LinkedHashSet;

public class RemoveDuplicatesInaString {

	public static void main(String[] args) {
    String str="Tester";
    String s=str.toLowerCase();
    LinkedHashSet<Character> set=new LinkedHashSet<>();
    for(int i=0;i<s.length();i++)
    {
    	set.add(s.charAt(i));
    }
    for(Character c:set)
    {
    	System.out.println(c);
    }
    
	}

}
