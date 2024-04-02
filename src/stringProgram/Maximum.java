package stringProgram;

public class Maximum {

	public static void main(String[] args) {
		String[] s= {"ab" , "abc", "abcd","cd","cdfg","abcdeg"};//abcdeg
		  String max=s[0];//ab
		   for(int i=0;i<s.length;i++)
		   {
			   if(s[i].length()>max.length())
			   {
//				   System.out.println(max.length());
//				   System.out.println(s.length);
				   max=s[i];
			   }
			   
			}
		   for(int i=0;i<s.length;i++)
		   {
			   if(s[i].length()==max.length())
			   {
				   System.out.println(s[i]);
			   }
		   }
			}
	}

 
