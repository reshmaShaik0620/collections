package com.epam.collections;
import java.util.ArrayList; 

public class List {
	ArrayList<Integer> arraylist = new ArrayList<Integer>(10);

	List()

	{

	 arraylist.add(10);

	 arraylist.add(15);

	 arraylist.add(20);

	 arraylist.add(25);

	 arraylist.add(30);

	 arraylist.add(35);

	 arraylist.add(40);

	 arraylist.add(45);

	 arraylist.add(50);

	 arraylist.add(55);

	}

	public void insert(int index,int element)

	{

		arraylist.add(index,element);

	}

	public void remove(int element)

	{

		int n=arraylist.indexOf(element);

		arraylist.remove(n);

	}

	public boolean search(int element)

	{

		boolean a=arraylist.contains(element);

		return a;

	}

	public void printelements()

	{

		for(int i=0;i<arraylist.size();i++)

		{

			System.out.println(arraylist.get(i));

		}

	}



}