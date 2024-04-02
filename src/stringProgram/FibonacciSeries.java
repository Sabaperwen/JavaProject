package stringProgram;

public class FibonacciSeries {

	public static void main(String[] args) {
    int n1=1;//1, 1,2,3,5,8,13
    int n2=1;//2
    int n=10;
    int sum=0;
    
    for(int i=1;i<=n;i++)
    {
    	sum=n1+n2;
    	System.out.print(n1+"  ");//1
    	n1=n2;
    	n2=sum;
    }
  }

}
