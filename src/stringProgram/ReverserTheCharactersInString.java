package stringProgram;

public class ReverserTheCharactersInString {

	public static void main(String[] args) {
  String s="Hi Hello Welcome to";// iH olleH emocleW ot
  String str="";
 
  for(int i=s.length()-1;i>=0;i--)
  {
	 str=str+s.charAt(i);
	}
  
//  System.out.println(str);
  String[] s2 = str.split(" ");
for(int j=s2.length-1;j>=0;j--)
{
	 System.out.print(s2[j]+" ");
}
	}
}
