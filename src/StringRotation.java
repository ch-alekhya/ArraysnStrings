import java.util.*;
public class StringRotation {
	
	
	public boolean rotationCheck(String s1,String s2)
	{
		char[] c1=s1.toCharArray();
		char [] c2=s2.toCharArray();
		HashMap<Character,Integer>map1=new HashMap<Character,Integer>();
		HashMap<Character,Integer>map2=new HashMap<Character,Integer>();
		if (map1.equals(map2))
		{
			char c=s1.charAt(0);
			int index=s2.indexOf(c);
			int eff_len=s1.length()-(index);
			
			String small=s1.substring(0, eff_len);
			String big=s1.substring(eff_len);
			String comp=big+small;
			if (comp.equals(s2))
				return true;
			else
				return false;
		}
		
		else
			return false;
		
		
	}
	
	public static void main(String[] args)
	{
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter the two strings");
		String s1=scan.nextLine();
		String s2=scan.nextLine();
		
		StringRotation obj=new StringRotation();
		System.out.println(obj.rotationCheck(s1,s2));
		scan.close();
		
		
	}

}
