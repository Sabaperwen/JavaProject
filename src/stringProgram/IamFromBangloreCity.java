package stringProgram;

public class IamFromBangloreCity {

	public static void main(String[] args) {
    String str="I am from banglore city";
    
//    op:-I ma morf erolgnab ytic
      String[] s = str.split(" ");
      for(int i=0;i<s.length;i++)
      {
    	  String ss = s[i];
        
             for(int j=ss.length();j<=0;j--)
             {
            	 System.out.println(ss.charAt(j));
             }
    	  
      }
      
	}

}
