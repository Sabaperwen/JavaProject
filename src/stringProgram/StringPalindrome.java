package stringProgram;

public class StringPalindrome {

	public static void main(String[] args) {
    String s="madam";
    
    String rev="";
    for(int i=s.length()-1;i>=0;i--)
    { 
    	rev=rev+s.charAt(i);
    }
    if(s.equals(rev))
    {
    	System.out.println("it is palindrome number");
    }
    else {
    	System.out.println("not palindrome number");
    }
	}

}
