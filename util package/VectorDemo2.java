import java.util.*;
public class VectorDemo2 
{
	public static void main(String[] args) 
	{
	Vector<Object> list=new Vector<Object>();
		
		list.add(new Date());
		list.add(new Integer(1000));
		list.add("bdps");
		list.add(new Float(43040.39));
		list.add("bdps");
		list.add(new Float(43040.39));
		
		for(int i=0;i<list.size();i++)
		{
		System.out.println(list.elementAt(i));
		}
	Enumeration<Object> enu=list.elements();
		while(enu.hasMoreElements())
		{
		System.out.println(enu.nextElement());
		}
	}
}
