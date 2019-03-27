	JFC(Java Foundatation Classes)
	  JFC is used build GUI based application.
 JFC includes the following APIs.
   1.AWT
   2.Swing
   3.Accessability
   4.Drag and Drop (dNd)
   5.Image I/O
   6.Printing Services
   7.Java 2D API.

Abstract Window Toolkit (AWT)

The Abstract Window Toolkit (AWT) supports Graphical User Interface (GUI) programming. AWT features include: 

->a rich set of user interface components; 
->a robust event-handling model; 
->graphics and imaging tools, including shape, color, and font classes; 
->layout managers, for flexible window layouts that don't depend on a particular window size or screen resolution; 
->data transfer classes, for cut-and-paste through the native platform clipboard. 

The AWT is part of the Java Foundation Classes (JFC).

Package java.awt
    Contains all of the classes for creating user interfaces and for painting graphics and images
	
	Awt Contains 
			->components
			->containers
			->layouts

	component:A user interface object such as a button or a scrollbar is called, in AWT terminology, a component. The Component class is the root of all AWT components.  
	
	components are:Button,List,Scrollbar,..
	
	container:A container is a component that can contain components and other containers. A con tainer can also have a layout manager that controls the visual placement of components in the container
	
	container example:Frame,Panel,Dialog
	
	layouts:layout manager that controls the visual placement of components in the container. The AWT package contains several layout manager classes and an interface for building your own layout manager
	  
	  layouts managers are:
	  	BorderLayout,FlowLayout,GridLayout.