package practicePackage;

import java.util.HashMap;

public class REmoveDuplicate {

	public static void main(String[] args) {
    String s="saba";
    HashMap<Character, Integer> map=new HashMap<>();
    for(int i=0;i<s.length();i++)
    {
    	map.put(s.charAt(i), 1);
	}
    System.out.println(map);
    
	}
}
