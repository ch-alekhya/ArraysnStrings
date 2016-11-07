import java.util.*;
public class SpaceReplaceByper20{
	
	
	public String replaceFunction(String s1)
	{
		
		return s1.replaceAll(" ", "%20");
	}
	
	public String replace2(String s1)
	{
		char[] c1= s1.toCharArray();
		int count =0;
		for (char c:c1)
		{
			if (c==' ')
				 count++;
			
		}
		
		int totalcount=s1.length()+count*2;

		char[] f1=new char[totalcount];
		int index=totalcount-1;
		for (int i=s1.length()-1;i>=0;i--)
		{
			if (c1[i]==' ')
			{
				f1[index]='0';
				f1[index-1]='2';
				f1[index-2]='%';
				index=index-3;
			}
			else
			{
				f1[index]=c1[i];
				index=index-1;
			}
		}
		return new String(f1);
		
	}
	
	public static void main (String[] args)
	{
		Scanner scan =new Scanner(System.in);
		System.out.print("Enter new string\n");
		String s1=scan.nextLine();
		
		SpaceReplaceByper20 obj =new SpaceReplaceByper20();
		System.out.println(obj.replaceFunction(s1));
		System.out.println(obj.replace2(s1));
		
		
		
				
	}

}
