package stringProgram;

public class SpecialChara {

	public static void main(String[] args) {
    String s="h2$e3#el4$l/o";//reverse everything should be reverse but special character should be in the same place
   String s1=s.replaceAll("[^A-Za-z0-9]", "");
   System.out.println(s1);
   int c=s1.length()-1;
    for(int i=0;i<s.length();i++)
    {
    	if(s.charAt(i)>='a' && s.charAt(i)<='z' || s.charAt(i)>='0' && s.charAt(i)<='9') 
    	{
    		System.out.print(s1.charAt(c--));
    	}
    	else {
    		System.out.print(s.charAt(i));
    	}
    }
    
	}

}
