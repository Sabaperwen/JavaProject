package arrayProgram;

public class PerfectRotation {

	public static void main(String[] args) {
    String str="I am from Banglore";
    String[] s = str.split(" ");
    String lastIndex1=s[0];
    for(int i=1;i<s.length;i++)
    {
    	System.out.print(s[i]+" ");
    }
    System.out.println(lastIndex1);
    
    
    String s1="am from Banglore I";
    String[] st = s1.split(" ");
    String lastIndex2=st[0];
    for(int i=1;i<st.length;i++)
    {
    	System.out.print(st[i]+" ");
    }
    System.out.println(lastIndex2);
	
	
	
	
	String ss="from Banglore I am";
    String[] stt = ss.split(" ");
   
    String lastIndex3=stt[0];
       
    for(int i=1;i<stt.length;i++)
    {
    	System.out.print(stt[i]+" ");
    }
    System.out.println(lastIndex3);
	}
}

	
	

