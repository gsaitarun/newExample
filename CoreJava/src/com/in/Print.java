package com.in;

public class Print implements  Ibm
{
   public void Connect(String text)
   {
	 System.out.println("printer is printed");
   }

@Override
   public void Disconnect()
   {
	 System.out.println(" printing is completd" +"   printer is disconnected with ibm");
   }
}
