package stringProgram;

public class Abbbabc {

	public static void main(String[] args) {
     String s="aabbabc";//aa
                        //bb
                        //a
                        //b
                        //c
     for(int i=0;i<s.length()-1;i++)
     {
    	 if(s.charAt(i)==s.charAt(i+1))
    	 {
    		 System.out.print(s.charAt(i));
    	 }
    	 else {
    		 System.out.println(s.charAt(i));
    	 }
     }
     System.out.println(s.charAt(s.length()-1));
	}

}
