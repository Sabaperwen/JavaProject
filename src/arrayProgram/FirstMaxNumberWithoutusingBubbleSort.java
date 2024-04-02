package arrayProgram;

public class FirstMaxNumberWithoutusingBubbleSort {

	public static void main(String[] args) {
    int a[]= {4,5,8,0,7,5,55};
    int maxNum=a[0];
    for(int i=0;i<a.length;i++)
    {
    	if(maxNum<a[i])
    	{
    		maxNum=a[i];
    	}
    }
    System.out.println(maxNum);
	}

}
