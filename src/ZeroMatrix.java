import java.util.*;
public class ZeroMatrix {
	
	
	public int[][] zeroMat(int[][] matrix)
	{
		int rowcount=matrix.length;
		int colcount=matrix[0].length;
		boolean [] rows=new boolean[rowcount];
		boolean[] cols=new boolean[colcount];
		for (int i=0 ;i<rowcount;i++)
		{
			for(int j=0 ;j<colcount;j++)
			{
				if(matrix[i][j]==0)
				{
					rows[i]=true;
					cols[j]=true;
				}
			}
			
		}
		
		for (int i=0;i<rowcount;i++)
		{
			if(rows[i])
			{
				for(int j=0; j<colcount;j++)
				{
					matrix[i][j]=0;
				}
			}
		}
		
		for (int j=0;j<colcount;j++)
		{
			if(cols[j])
			{
				for (int i=0;i<rowcount;i++)
				{
					matrix[i][j]=0;
				}
			}
		}
		
		return matrix;
	}
	
	public void printMatrix(int[][] matrix)
	{
		
		int rowcount=matrix.length;
		int colcount=matrix[0].length;
		for (int i=0 ;i<rowcount;i++)
		{
			for (int j=0;j<colcount;j++)
			{
				System.out.print(matrix[i][j]+"\t");
			}
			System.out.println();
		}
		
	}
	
	public static void main(String[] args)
	{
		Scanner scan =new Scanner(System.in);
		System.out.println("enbtr the number of rows");
		int rowcount=scan.nextInt();
		System.out.println("Enter the number of colmns");
		int colcount=scan.nextInt();
		int[][] matrix=new int[rowcount][colcount];
		System.out.println("Enter Matrix contents");
		
		for (int i=0; i<rowcount;i++)
		{
			for (int j=0; j<colcount;j++)
			{
				matrix[i][j]=scan.nextInt();
			}
		}
		
		ZeroMatrix obj=new ZeroMatrix();
		obj.printMatrix(matrix);
		matrix=obj.zeroMat(matrix);
		System.out.println("Printing zero Matrix");
		obj.printMatrix(matrix);
		
		
		
		
	}

}
