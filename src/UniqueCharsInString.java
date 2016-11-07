import java.util.*;



public class UniqueCharsInString {
	
	
	public static void main(String[] args)
	{
		
		HashMap<Character,Integer> map=new HashMap<Character,Integer>();
		
		Scanner scan=new Scanner(System.in);
		String s=scan.nextLine();
		char[] chars=s.toCharArray();
		boolean status= false;
		
		for (char w: chars)
		{
			if (map.containsKey(w))
			{
				status=true;
				break;
			}
			else
			{
				map.put(w, 1);
			}
			if (status)
				break;
			
			
		}
		
		if (status)
			System.out.println("The string doesnot have unique characters");
		else
			System.out.println("The string has unique characters");
		
		
		
	}

}
