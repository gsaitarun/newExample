package com.in;

import java.io.*;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.LineNumberReader;
import java.io.ObjectOutputStream;

//import com.to.Student;

public abstract class Epson implements Ibm
{
	public void Connect()
	   {
		 System.out.println("printer is printed with Epson");
	   }

	public void Disconnect()
	   {
		 System.out.println("printer is disconnected with epson");
	   }
}
class User
{
  public static void main(String[] args) 
  {
	 /* Students s1 = new Students("tarun vbit",211);
	   FileOutputStream fos = new FileOutputStream("tarun22.txt");
	   ObjectOutputStream oos = new ObjectOutputStream(fos);
	   oos.writeObject(s1);
	   
*/	    try{
		  
	  FileReader fr = new FileReader("D:\\Basics\\tarun\\openingnotepad.txt");
	   LineNumberReader lnr = new LineNumberReader(fr);
	   String printname = lnr.readLine();
	   System.out.println("Loading the driver for : " + printname);
	   Class c = Class.forName(printname);
	   Ibm rf = (Ibm)c.newInstance();
	   rf.Connect("hello this is printed on the printed");
	   rf.Disconnect();
	  }catch(Exception e){}
	  
  }	
}