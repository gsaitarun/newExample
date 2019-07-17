package com.in;

import java.io.Serializable;

public class Students implements Serializable
{
	 String name;
	  int id;
	  Students(String name,int id)
	  {
		 this.name = name;
		 this.id=id;
	  }
	public void readObject() 
	{
		
	}
}
