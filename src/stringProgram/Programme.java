package stringProgram;


public class Programme {

	public static void main(String[] args) {
   String[] s= {"ab" , "abc", "abcd","cd","cdfg"};//ab cd
//   for(int i=0;i<s.length;i++)
//   {
////	   System.out.println(s[i]);
//	 if(s[i].length()==2)
//	 {
//		 System.out.println(s[i]);
//	 }
//************Sir Program***************
   
   String minLength=s[0];//ab
   for(int i=0;i<s.length;i++)
   {
	   if(s[i].length()<minLength.length())
	   {
		   minLength=s[i];
	   }
	   
	}
   for(int i=0;i<s.length;i++)
   {
	   if(s[i].length()==minLength.length())
	   {
		   System.out.println(s[i]);
	   }
   }
	}
}
