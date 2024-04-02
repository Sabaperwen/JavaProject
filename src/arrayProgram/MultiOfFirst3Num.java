package arrayProgram;

public class MultiOfFirst3Num {

	public static void main(String[] args) {
		int a[]= {4,3,1,2};
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
	   
	    }
	    int Multi=1;
	    for(int i=0;i<3;i++)
	    {
	    	Multi=Multi*a[i];
	    }
	    System.out.println(Multi);
	}


	}


