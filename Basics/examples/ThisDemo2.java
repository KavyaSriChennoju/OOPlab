class Rectangle
{
	private int x,y,width,height;
	
	public Rectangle()
	{
		this(0,0,0,0);
		//this(50,50,100,100);		
	}
	public Rectangle(int width,int height)
	{
		this(50,50,width,height);
	}
	
	public Rectangle(int x,int y,int width,int height)
	{
		this.x=x;
		this.y=y;
		this.width=width;
		this.height=height;				
	}
	
	public void printRectangle()
	{
		System.out.println("x......"+x);
		System.out.println("Y......."+y);
		System.out.println("width......"+width);
		System.out.println("Height......."+height);
	}
	
}
public class ThisDemo2 
{
 public static void main(String[] args) 
 {
	 Rectangle r=new Rectangle();
	 r.printRectangle();
	 
	 Rectangle r1=new Rectangle(100,100);
	 r1.printRectangle();
	 
	 Rectangle r2=new  Rectangle(50,50,200,400);
	 r2.printRectangle();
}
}
