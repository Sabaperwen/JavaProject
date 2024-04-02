package stringProgram;

public class CountVowel {

	public static void main(String[] args) {
    String s="India";
    String s2 = s.toLowerCase();
    char[] s1 = s2.toCharArray();
    int count=0;
    for(int i=0;i<s1.length;i++)
    {
    	if(s1[i]=='a'||s1[i]=='e'||s1[i]=='o'||s1[i]=='i'||s1[i]=='u')
    	{
    		count++;
    		System.out.print(s1[i]);
    	}
    }
    System.out.println(count);
	}

}
