package arrayProgram;

public class SortUsingBubbleShort {

	public static void main(String[] args) {
   int a[]= {4,2,0,1};
   int length=a.length;
   for(int i=0;i<length;i++)
   {
	   for(int j=i+1;j<length;j++)
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
   
