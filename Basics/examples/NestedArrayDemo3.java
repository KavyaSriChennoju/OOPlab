
public class NestedArrayDemo3
{
 public static void main(String[] args) 
 {
		String subjects[][]={
				{"asp","jsp","php"},
				{"c","c++","java","smalltalk"},
				{"bdps","aptech"},
				{"html","xml","wml","sgml","xsl","css"}
        };	
		
		for(String rows[]:subjects)
		{
			for(String cols:rows)
			{
				System.out.print(cols+"\t");
			}
			System.out.println();
		}
}
}
