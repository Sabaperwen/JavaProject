package stringProgram;

public class PrintDuplicateWithCount {

	public static void main(String[] args) {
		 String s="Tester";
		    String str=s.toLowerCase();
		    
		   
		    for(int i=0;i<s.length();i++)//t
		    {
		    	 int count=0;
		    	for(int j=0;j<s.length();j++)//t//1//2//3
		    	{
		    	  if(str.charAt(i)==str.charAt(j))//true
		    	  {
		    		  if(i>j)//f
		    		  {
		    			break;  
		    		  }
		    		  else {
		    			  count++;
		    		  }
		    	  }
		    	}
		    	if(count>1)
		    	System.out.println(str.charAt(i)+" "+count);
		    }
			}

	}


