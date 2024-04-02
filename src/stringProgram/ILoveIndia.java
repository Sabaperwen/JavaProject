package stringProgram;

public class ILoveIndia {

	public static void main(String[] args) {
    String s="I Love India";
    String s1 = s.replace(" " , "");//ILoveIndia 
    int count=s1.length()-1;
    for(int i=0;i<s.length();i++)
    {
    	if(s.charAt(i)==' ')
    	{
    		System.out.print(' ');
    	}
    	else {
    		System.out.print(s1.charAt(count));
    		count--;
    	}
    }
	}

}
