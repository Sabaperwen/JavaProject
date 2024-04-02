package stringProgram;

public class OccuranceOfWOrds {

	public static void main(String[] args) {
    String s="Hi i am saba i am from jharkhand";
    String[] str=s.split(" ");
    for(int i=0;i<str.length;i++)
    {
    	int count=0;
    	for(int j=0;j<str.length;j++)
    	{
    		if(str[i].equals(str[j]))
    		{
    			if(i>j)
    			{
    				break;
    			}
    			else {
    				count++;
    			}
    		}
    	}
    	if(count>=1)
    	{
    		System.out.println(str[i]+" "+count);
    	}
    }
	}

}
