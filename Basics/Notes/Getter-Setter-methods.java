what is Method?
	method is just like a function in C language.

 Java Provides two types of methods.
	1. getter/ accessor methods.
	2. setter/ mutator methods.
-------------------------------
getter/accessor methods
   used to getting(reading) a value of a variable.

Syntax:
[modifier]   return_type getXxx()
   {
    return variable/value;
   }
Example:
defination
  private int number=800;

 public  int getNumber()
   {
    return number;	
   }

calling:
	int x=[object].getNumber();
   	********************
2. setter/mutator methods
 to change(write) a value of a variable

Syntax:
 void setXxx(type variable)
 {
 
 }
definition:
private int number=855;

 void setNumber(int no)
 {
   number=no;
 }
calling:
	 [object].setNumber(5000);
 ---------------
syntax:
   boolean isXxx();

definition:
boolean   isGreater(int x)
{
   if (x>500)
      return true;
   else
  	retrun false;
}

calling:
	boolean b=[object].isGreater(800);
isClosed(), isFirst(), isLast(), isConnected()
*********************************************************
__________________________________________
c		c++		java
---------------------------------------------------------------
variable	    data members		fields
function	   member functions		methods.
-	   parent/base class	     parent/base/super 
-	  child/derieved	     child/derieved/sub 
-------------------------------------------------------------------------