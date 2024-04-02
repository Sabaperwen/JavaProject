package arrayProgram;

public class PerfectRotation1 {

	public static void main(String[] args) {
    String str="I am from Banglore";//am from Banglore i
    String[] s=str.split(" ");      //from Banglore i am
    String frstIndex = s[0];        //Banglore i am from
    String lastIndex=s[s.length-1]; //i am from Banglore
    String temp=frstIndex;
    frstIndex=lastIndex;
    lastIndex=temp;
    for(int i=1;i<s.length;i++)
    {
    	for(int j=0;j<4;j++)
    	{
    	System.out.print(s[i]+" ");
     }
    System.out.println(lastIndex);
     
	}
}
}