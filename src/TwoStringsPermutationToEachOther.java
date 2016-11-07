import java.util.*;
public class TwoStringsPermutationToEachOther {
	
	
	public boolean checkPerm(String s1,String s2)
	{
		char[] c1=s1.toCharArray();
		char[] c2=s2.toCharArray();
		
		Arrays.sort(c1);
		Arrays.sort(c2);
		
		
		return (Arrays.equals(c1, c2));
	}
	
	public static void main(String[] args)
	{
		TwoStringsPermutationToEachOther obj=new TwoStringsPermutationToEachOther();
		Scanner scan =new Scanner(System.in);
		String s1=scan.nextLine();
		String s2=scan.nextLine();
		
		boolean status=obj.checkPerm(s1, s2);
		System.out.println(status);
		
				
		
	}

}
