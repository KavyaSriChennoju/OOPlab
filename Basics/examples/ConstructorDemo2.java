class Rectangle
{
	private int x,y,width,height;
	
	//non param constructor
	public Rectangle()
	{
		x=50;
		y=50;
		width=100;
		height=100;
	}
	
	//param constructor
	public Rectangle(int w,int h)
	{
		x=50;
		y=50;
		width=w;		height=h;
	}
	public Rectangle(int x,int y,int width,int height)
	{
		this.x=x;
		this.y=y;
		this.width=width;
		this.height=height;		
	}
	//copy constructor
	public Rectangle(Rectangle r1)
	{
		x=r1.x;
		y=r1.y;
		width=r1.width;
		height=r1.height;
	}	
	public void printRectangle()
	{
		System.out.println("X value is..."+x);
		System.out.println("Y Value is.."+y);
		System.out.println("Width is..."+width);
		System.out.println("Height is..."+height);
		System.out.println();
	}	
} 
public class ConstructorDemo2 
{
 public static void main(String[] args) 
 {
	 //invoking non-param constructor
	 Rectangle r=new Rectangle();
	 r.printRectangle();
	 
	 //invoking param constructor
	 Rectangle r1=new Rectangle(500,200);
	 r1.printRectangle();
	 
	 //invoking param constructor 
	 Rectangle r2=new  Rectangle(50,75,100,200);
	 r2.printRectangle();
	 
	 //invoking copy constructor
	 Rectangle r3=new Rectangle(r2);
	//Rectangle r3=new Rectangle(new Rectangle(500,300));
	 r3.printRectangle();
 }  
}
