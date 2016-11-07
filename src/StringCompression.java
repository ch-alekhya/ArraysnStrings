import java.util.*;
public class StringCompression {
	
	
	public String stringCom(String s1)
	{
		HashMap<Character,Integer> strmap=new HashMap<Character,Integer>();
				char [] c1=s1.toCharArray();
		for (char w: c1)
		{
			if (strmap.containsKey(w))
			{
				int value=strmap.get(w);
				value=value+1;
				strmap.put(w, value);
				
			}
			else
			{
				strmap.put(w, 1);
			}
		}
		
		
		boolean status=false;
		char [] mainchar=new char[2*strmap.size()];
		char x=' ';
		int i=0;
		for (char w: c1)
		{
			
			if(x==w)
			{
				status=true;
				continue;
			}
			else
			{
				status=false;
			}
			
			if (!status)
			{
				mainchar[i++]=w;
				int value=strmap.get(w);
				String str=""+value;
				mainchar[i++]=str.charAt(0);
				x=w;
				
			}
		}
		String mainAns=new String(mainchar);
		return mainAns;
	}
	
	public static void main(String[] args)
	{
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter the String for Compression");
		String s1=scan.nextLine();
		StringCompression obj=new StringCompression();
		String ans=obj.stringCom(s1);
		System.out.println(ans);
		scan.close();
	}

}
