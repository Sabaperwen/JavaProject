package stringProgram;

public class ReverseWords {

	public static void main(String[] args) {
//    String s="Hi Hello Welcome to";
//    for(int i=s.length()-1;i>0;i--)
//    {
//    	System.out.print(s.charAt(i));
//    }
//    
    
    String s1="Hi Hello Welcome to";
    String[] str = s1.split(" ");
    for(int i=str.length-1;i>=0;i--)
    {
    	System.out.print(str[i]+" ");
    }
	}

}
