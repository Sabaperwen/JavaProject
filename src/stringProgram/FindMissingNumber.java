package stringProgram;

import java.util.ArrayList;

public class FindMissingNumber {

	public static void main(String[] args) {
     int a[]= {1,3,4,6,8,9};
     ArrayList<Integer> arr=new ArrayList<>();
   
     for(int i=0;i<a.length;i++)
     {
    	  arr.add(a[i]);
    	  
     }
     System.out.println( arr);
     for(int i=1;i<10;i++)
     {
    	 if(!(arr.contains(i)))
    	 {
    		 System.out.println(i);
    	 }
     }
	}

}
