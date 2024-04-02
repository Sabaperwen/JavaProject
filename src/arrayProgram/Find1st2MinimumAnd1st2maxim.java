package arrayProgram;

import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Find1st2MinimumAnd1st2maxim {

	public static void main(String[] args) {
    int a[]= {4,0,5,1,0,3,5};
    TreeSet<Integer > set=new TreeSet();
    for(int i=0;i<a.length;i++)
    {
    	set.add(a[i]);
    }
    for(Integer e:set)
    {
    	System.out.println(e);
    }
    
	}
}