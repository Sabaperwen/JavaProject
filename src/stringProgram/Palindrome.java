package stringProgram;

public class Palindrome {

	public static void main(String[] args) {
    int n=121;
    int temp=n;
    int rev=0;
    int rem=0;
    
    while(n>0)
    {
    	rem=n%10;
    	rev=(rev*10)+rem;
    	n=n/10;
    }
    if(temp==rev)
    {
    	
    	System.out.println("the number is palindrome");
    }
    else {
    	
    	System.out.println("not palindrome");
    }
	}

}
