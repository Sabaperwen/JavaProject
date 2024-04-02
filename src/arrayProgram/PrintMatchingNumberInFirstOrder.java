package arrayProgram;

public class PrintMatchingNumberInFirstOrder {

	public static void main(String[] args) {
     int a[]= {0,4,0,2,0,6};//0 0 0 4 2 6
     for(int i=0;i<a.length;i++)
     {
    	if(a[0]==a[i])
    	{
    		int allZero=a[i];
    		System.out.println(allZero);
    	}
    	
     }
     for(int i=0;i<a.length;i++)
     {
    	 if(a[i]!=0)
    	 {
    		 System.out.println(a[i]);
    	 }
     }
     
	}

}
