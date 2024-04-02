package stringProgram;

public class A1b2c3d {

	public static void main(String[] args) {
    String s="a1b2c3";//6
//    String number="";
    int sum=0;
    for(int i=0;i<s.length();i++)
    {
    	char c=s.charAt(i);
    	if(c>='0' && c<='9')
    	{

	
    	int n = c-48;//as key value of 0=48, 1=49,50=2,51=3,52=4,55=5
    	sum=sum+n;
	  	System.out.println(n);
    	}
    }
    System.out.println(sum);
	}

//	2nd ways:-
//	 String s="a1b2c3";
//     int sum=0;
//     for(int i=0;i<s.length();i++)
//     {
//         
//         if(s.charAt(i)>='0' && s.charAt(i)<='9')
//         {
//             int n=Integer.parseInt(String.valueOf(s.charAt(i)));
//             //  System.out.println(s.charAt(i));
//             sum=sum+n;
//         } 
//     }
//     System.out.println(sum);
// }
	
	
}
