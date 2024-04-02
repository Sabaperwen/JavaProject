package arrayProgram;

public class FirstMinNumWithoutUsingBubbleShot
{
	public static void main(String[] args) {
		 int a[]= {6,3,7,5,8,99};
		  int fmin=a[0];
		 for(int i=0;i<a.length;i++)
		 {
			 if(fmin>a[i])
			 {
				 fmin=a[i];
			 }
		 }
		 System.out.println(fmin);
		}
	}
 