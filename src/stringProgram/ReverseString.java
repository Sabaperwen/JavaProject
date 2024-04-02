package stringProgram;

public class ReverseString {

	public static void main(String[] args) {
//		1st way
//   String s="Banglore";
//   for(int i=s.length()-1;i>=0;i--)
//   {
//	  System.out.print(s.charAt(i));
//   }
//	}

//		2nd way
//		String s="Banglore";
//		String Rev="";
//		for(int i=s.length()-1;i>=0;i--)
//		{
//			Rev=Rev+s.charAt(i);
//		}
//		System.out.println(Rev);
//	}

//		3rd way
//		String s="Banglore";
//		StringBuffer st=new StringBuffer("Bnaglore");
//		System.out.println(st.reverse());
		
//		4th way
		String s="Banglore";
		char c []=s.toCharArray();
		for(int i=c.length-1;i>=0;i--)
		{
			System.out.println(c[i]);
		}
}
}
