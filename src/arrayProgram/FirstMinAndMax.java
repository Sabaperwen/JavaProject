package arrayProgram;

import java.util.LinkedHashSet;

public class FirstMinAndMax {

	public static void main(String[] args) {
    int a[]= {4,0,5,1,0,3,5,3};
    int temp;
    for(int i=0;i<a.length;i++)
    {
    	
    	for(int j=i;j<a.length;j++)
    	{
    		if(a[i]>a[j])
    		{
    			temp=a[i];
    			a[i]=a[j];
    			a[j]=temp;
    		}
    	}
//    	System.out.print(a[i]);
    	
    }
    LinkedHashSet<Integer > l=new LinkedHashSet<>();
    for(int i=0;i<a.length;i++)
    {
    	l.add(a[i]);
    }
    System.out.println("first two min num");
    int firstMin=l.size()-5;
    int secndMin=l.size()-4;
   System.out.println("First 2 min num"+" "+firstMin+", "+secndMin);
   int frstMax=l.size()-1;
   int scndMax=l.size()-2;
   System.out.println("first 2 max num"+" "+frstMax+", "+scndMax);
	}
}
