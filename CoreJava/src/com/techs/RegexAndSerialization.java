package com.techs;
import java.lang.*;
import java.io.*;

public class RegexAndSerialization extends Getter implements Runnable
{
	
	//public class Annotations  extends FiveSec implements Runnable

	  
		public void run()
		{
		System.out.println("its gonna take some time to open NotePad");
		}
	  public static void main(String[] args) throws Exception
	  {
		  Runtime r = Runtime.getRuntime();
			//r.addShutdownHook(new FiveSec());
		  RegexAndSerialization a = new RegexAndSerialization();
		  FiveSec b = new FiveSec();
		  FourSec c = new FourSec();
		  ThreeSec d = new ThreeSec();
		  TwoSec g = new TwoSec();
		  try
		  {
			  a.sleep(1000);
			  a.setName("5 Secs to go.......");
			 System.out.println( a.getName());
			 // System.out.println(Thread.currentThread().getName());
			  
			//  r.addShutdownHook(new FiveSec());
			  
		  }
		  catch(Exception e)
		  {
			  System.out.println(e);
		  }
		 
		  try
		  {
			 b.sleep(2000);
			 b.setName("4 Secs to go.......");
			 System.out.println( b.getName());
			 //r.addShutdownHook(new FourSec());
		  }
		  catch(Exception e)
		  {
			  System.out.println(e);
		  }
		  try
		  {
			  c.sleep(2000);
			  c.setName("3 Secs to go.......");
				 System.out.println( c.getName());
			  //r.addShutdownHook(new ThreeSec());
		  }
		  catch(Exception e)
		  {
			  System.out.println(e);
		  }
		  try
		  {
			  d.sleep(2000);
			  d.setName("2 Secs to go.......");
				 System.out.println( d.getName());
			 // r.addShutdownHook(new TwoSec());
		  }
		  catch(Exception e)
		  {
			  System.out.println(e);
		  }
		  try
		  {
			  g.sleep(2000);
			  g.setName("1 Secs to go.......");
				 System.out.println( g.getName());
			  
		  }
		  catch(Exception e)
		  {
			  System.out.println(e);
		  }
		//System.out.println("is completed");
		r.exec("notepad");
		
		//serialiazation
		
	  } 
	}


