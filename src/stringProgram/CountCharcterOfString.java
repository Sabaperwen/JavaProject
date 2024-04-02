package stringProgram;

public class CountCharcterOfString {

	public static void main(String[] args) {
    String  s=" Bang a lore";//9
    int count =0;
    for(int i=0;i<s.length();i++)
    {
    	if(s.charAt(i)!=' ')
    		
    	{
    		count++;
    	}
    }
    System.out.println(count);
	}

}
