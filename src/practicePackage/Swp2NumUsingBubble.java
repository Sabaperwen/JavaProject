package practicePackage;

public class Swp2NumUsingBubble {

	public static void main(String[] args) {
    int a[]= {5,8,9,2,5,2};
    for(int i=0;i<a.length;i++)
    {
    	for(int j=i+1;j<a.length;j++)
    	{
    		if(a[i]>a[j])
    		{
    			int temp=a[i];
    			a[i]=a[j];
    			a[j]=temp;
    		}
    	}
    	
    	System.out.println(a[i]);
    }
	}

}
