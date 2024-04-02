package stringProgram;

public class REmoveDuplicates {

	public static void main(String[] args) {
    String s1="India";
    String s = s1.toLowerCase();
    for(int i=0;i<s.length();i++)
    {
    	int count=0;
    	for(int j=0;j<s.length();j++)//t//1//2//3
    	{
    	  if(s.charAt(i)==s.charAt(j))//true
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
    	if(count==1)
    	System.out.println(s.charAt(i)+" "+count);
    }
	}


    }
	
