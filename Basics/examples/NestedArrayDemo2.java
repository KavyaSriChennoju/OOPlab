public class NestedArrayDemo2 
{
	public static void main(String[] args) 
	{
		String subjects[][]={
							{"asp","jsp","php"},
							{"c","c++","java","smalltalk"},
							{"bdps","aptech"},
							{"html","xml","wml","sgml","xsl","css"}
			        };	
		
		int rows=subjects.length;
		System.out.println("Total Rows..."+rows);
		for(int i=0;i<rows;i++)
		{
			 int cols=subjects[i].length;
			 System.out.println("cols "+cols+" in Row..."+i);
			 
			for(int j=0;j<cols;j++)
			{
				System.out.print(subjects[i][j]+"\t");
			}
			System.out.println();
		}
	}
}
