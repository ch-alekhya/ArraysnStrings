import java.util.*;
public class PalindromePermutation {
	
	public static HashMap<Character, Integer> perms= new HashMap<Character,Integer>();
	
	public char[] charArray(String s1)
	{
		char[] c1= new char[s1.length()];
		
		int i=0,j=0;
		for (i=0 ;i<s1.length();i++)
		{
			//System.out.println(i);
			if (s1.charAt(i)!=' ')
			{
				c1[j++]=s1.charAt(i);
				
			}
		}
		return c1;
		
	}
	
	
	public boolean permute(String str)
	{
		System.out.println(str);
		char [] c=str.toCharArray();
		for (char w:c)
		{
			if (perms.containsKey(w))
			{
				int value=perms.get(w);
				value++;
				perms.put(w, value);
			}
			else
			{
				perms.put(w, 1);
			}
		}
	
		
		boolean checkodd=false;
		//System.out.println(perms.size());
		perms.remove('\0');
		
		for(char w:perms.keySet())
		{
				if (perms.get(w)%2==1)
				{
					if(checkodd)
					{
						return false;
					}
					checkodd=true;
				
				}
		}
		return true;
	}
	public static void main (String[] args)
	{
		
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter string");
		String s1=scan.nextLine();
		PalindromePermutation obj =new PalindromePermutation();
		char[] c1=obj.charArray(s1);
		//System.out.println(c1);
		String newStr=new String(c1);
		//System.out.println(newStr);
		System.out.println(obj.permute(newStr));
		//System.out.println("Printing contents in hashset");
		//obj.palindrome(s1);
		
	}

}
