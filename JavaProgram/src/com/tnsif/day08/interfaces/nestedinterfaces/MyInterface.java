//Nested Interface
package com.tnsif.day08.interfaces.nestedinterfaces;

public interface MyInterface {
	 void calculateArea();
	    interface MyInnerInterface {
	       int  id = 20;
	       void print();     
	    }
}