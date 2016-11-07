import java.util.Scanner;

public class RotateMatrix {
	
	
	public void rotateMat(int[][] matrix)
	{
		int rowcount=matrix.length;
		int colcount=matrix[0].length;
		
		int[][] trasMat=new int[colcount][rowcount];
		
		for (int i=0;i<colcount;i++)
		{
			for (int j=0;j<rowcount;j++)
			{
				trasMat[i][j]=matrix[j][i];
			}
		}
		for (int i=0;i<colcount;i++)
		{
			for (int j=0;j<rowcount;j++)
			{
				System.out.print(trasMat[i][j]+"\t");
			}
			System.out.println();
		}
		
		for (int i=0; i<colcount;i++)
		{
			for(int j=0;j<rowcount/2;j++)
			{
				int temp=trasMat[i][j];
				trasMat[i][j]=trasMat[i][rowcount-j-1];
				trasMat[i][rowcount-j-1]=temp;
			}
		}
		System.out.println("After rotation");
		for (int i=0;i<colcount;i++)
		{
			for (int j=0;j<rowcount;j++)
			{
				System.out.print(trasMat[i][j]+"\t");
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
		
		RotateMatrix obj=new RotateMatrix();
		obj.rotateMat(matrix);
	}

}
