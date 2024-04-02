package stringProgram;

public class IAmSelenium {

	public static void main(String[] args) {
    String s="I am selenium";//m ui nelesmaI
    String s1=s.replace(" ", "");
    int size=s1.length()-1;
    for(int i=0;i<s.length();i++)
    {
    	if(s.charAt(i)!=' ')
    	{
    		System.out.print(s1.charAt(size--));
    	}
    	else {
			System.out.print(s.charAt(i));
		}
    }
    

	}

}
