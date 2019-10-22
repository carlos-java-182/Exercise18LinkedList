package com.Exercise18LinkedList.app;

import java.util.LinkedList;
import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Stack;
import java.util.Queue;
import java.util.HashMap;
import java.util.Random;
import java.util.Iterator;

public class LinkedListApp 
{

	public static void main(String[] args)
	{
		
		//Constant Variables
		
		final int ELEMENTS = 100;
		
		
		LinkedList <Byte> miListita  = new LinkedList<Byte>();
		ArrayList<Short> miArraycitu = new ArrayList<Short>();
		Stack<Integer> miPilita = new Stack<Integer>();
		PriorityQueue<Double> miColita = new PriorityQueue<Double>();
		HashMap<Integer,String> miDiccionaritu = new HashMap<Integer, String>();
		
		
		Random numbers = new Random();
		miListita.add((byte) 5);
		miListita.add((byte) 10);
		miListita.add((byte) 20);
		miListita.add((byte) 30);
		miListita.add((byte) 40);
	
		miListita.set(0,(byte)2); //This is slower than arraylist
		
		System.out.println(miListita.get(1)); //This method is better in array list too
		
		
		System.out.println(miListita.remove());
		System.out.println(miListita);
		
		Byte number = 2;		
		System.out.println(miListita.size());
		System.out.println(miListita.isEmpty());
		System.out.println(miListita.contains(number));
		
		miListita.clear();
		System.out.println(miListita);
		
		
		for(int i=0; i<ELEMENTS; i++)
		{
			miListita.add((byte)numbers.nextInt(100));
		}
		
		System.out.println(miListita);
		
		Iterator miIteradorcitu = miListita.iterator();
		while(miIteradorcitu.hasNext())
		{
			System.out.println(miIteradorcitu.next());
		}
		for(Byte miNumber : miListita)
		{
			System.out.println(miNumber);
		}
		
		
		miArraycitu.add((short)5);
		miArraycitu.add((short)10);
		miArraycitu.add((short)20);
		miArraycitu.add((short)30);
		miArraycitu.add((short)40);
		
		System.out.println(miArraycitu);
		
		miArraycitu.set(0,(short) 2);
		
		System.out.println(miArraycitu.get(2));
		System.out.println(miArraycitu);
		System.out.println(miArraycitu.remove(2));
		System.out.println(miArraycitu);
		
		miIteradorcitu = miArraycitu.iterator();
		
		while(miIteradorcitu.hasNext())
		{
			System.out.println(miIteradorcitu.next());
		}
		
		for(Short miShort:miArraycitu)
		{
			System.out.println(miShort);
		}
		
		
	
		
				

	}

}
