package stringProgram;

import java.util.Arrays;
 
public class Anagram {

	public static void main(String[] args) {
		String s = "top";
		String s1 = "pot";
		if (s.length() != s1.length()) {
			System.out.println("not Anagram");
		} else {
			char[] c1 = s.toCharArray();
//			System.out.println(c1);
			char[] c2 = s.toCharArray();
			Arrays.sort(c2);//top
			Arrays.sort(c1);//pot
			boolean flag = false;
			for (int i = 0; i < c1.length; i++)
			      {
				
					if (c1[i] == c2[i])
				     {
						flag = true;
					} else {
						flag = false;
						break;
					}
				}
				if (flag == true) {
					System.out.println("number is anagram");
				} else {
					System.out.println("number is not Anagram");
				}
			}

		}

	}


