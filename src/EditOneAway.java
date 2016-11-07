import java.util.*;
public class EditOneAway {
	
	
	
	public HashMap<Character,Integer> hashMapCharArray(char [] c)
	{
		HashMap<Character,Integer> cmap=new HashMap<Character,Integer>();
		for (char w:c)
		{
			if (cmap.containsKey(w))
			{
				int value=cmap.get(w);
				value=value+1;
				cmap.put(w, value);
			}
			else
			{
				cmap.put(w, 1);
			}
			
		}
		return cmap;
		
	}
	
	public boolean removeChar(String s1 ,String s2)
	{
		char [] c1=s1.toCharArray();
		char [] c2=s2.toCharArray();
		HashMap<Character,Integer> c1has=new HashMap<Character,Integer>();
		HashMap<Character,Integer> c2has=new HashMap<Character,Integer>();
		
		
		EditOneAway obj=new EditOneAway();
		c1has=obj.hashMapCharArray(c1);
		c2has=obj.hashMapCharArray(c2);
		
		int status=0;
		int length1=c1has.size();
		int length2=c2has.size();
		
		if (length1 > length2)
		{
			for (char key: c2has.keySet())
			{
				if (c1has.containsKey(key))
				{
					if (c1has.get(key)==c2has.get(key))
						status++;
				}
			}
			if (length1-status==1)
				return true;
			else 
				return false;
		}
		else
			return false;
	}
	
	
	public boolean replaceChar(String s1,String s2)
	{
		char[] c1 =s1.toCharArray();
		char[] c2=s2.toCharArray();
		HashMap<Character,Integer>c1has=new HashMap<Character,Integer>();
		HashMap<Character,Integer>c2has=new HashMap <Character,Integer>();
		EditOneAway obj=new EditOneAway();
		c1has=obj.hashMapCharArray(c1);
		c2has=obj.hashMapCharArray(c2);
		
		int length1=c1has.size();
		int length2=c2has.size();
		if (length1==length2)
		{
			int status=0;
			for (char c: c1has.keySet())
			{
				//System.out.println(c);
				if (c2has.containsKey(c))
				{
					if (c2has.get(c)==c1has.get(c))
					{
						status++;
					}
				}
				//System.out.println(status);
			}
		//	System.out.println(status);
			if (length1-status==1)
				return true;
			else
				return false;
				
			
		}
		else
			return false;
	}
	
	public boolean insertChar(String s1, String s2)
	{
		char [] c1=s1.toCharArray();
		char [] c2=s2.toCharArray();
		HashMap<Character,Integer>c1has=new HashMap<Character,Integer>();
		HashMap<Character,Integer>c2has=new HashMap<Character,Integer>();
		EditOneAway obj=new EditOneAway();
		c1has=obj.hashMapCharArray(c1);
		c2has=obj.hashMapCharArray(c2);
		
		int length1=c1has.size();
		int length2=c2has.size();
		
		if (length2-length1==1)
		{
			int status=0;
			for (char c:c1has.keySet())
			{
				if (c2has.containsKey(c))
				{
					if(c2has.get(c)==c1has.get(c))
					{
						status++;
					}
				}
			}
			if (length2-status==1)
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
		System.out.println("Enter two strings to find the edit distance");
		String s1=scan.nextLine();
		String s2=scan.nextLine();
		
		EditOneAway obj1=new EditOneAway();
		boolean status1=obj1.removeChar(s1,s2);
		boolean status2=obj1.replaceChar(s1, s2);
		boolean status3=obj1.insertChar(s1, s2);
		
		if (status1 || status2 ||status3)
		{
			if(status1)
			{
				System.out.println("Removing character");
			}
			else if (status2)
			{
				System.out.println("Replacing Character");
			}
			else
			{
				System.out.println("Inserting Charcter");
			}
		}
		else
		{
			System.out.println("No one edit operation found");
		}
		
		
		
	}

}
