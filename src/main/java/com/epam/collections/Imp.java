package com.epam.collections;
import java.util.Scanner;

public class Imp extends List {
	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);

		List l=new List();

		System.out.println("Enter Your Choice \n1.Insert\n2.Delete\n3.Search\n4.view\n5.Exit");

		int ch=sc.nextInt();

		switch(ch)

		{

		case 1:System.out.println("Enter element");

				int ele=sc.nextInt();

				System.out.println("Enter position");

				int pos=sc.nextInt();

				l.insert(pos, ele);

				break;

		case 2:

			System.out.println("Enter element");

			int ele1=sc.nextInt();

			l.remove(ele1);

			break;

		case 3:

			System.out.println("Enter element");

			int ele2=sc.nextInt();

			boolean b=l.search(ele2);

			if(b)

			{

				System.out.println("Element Found");

			}

			else

				System.out.println("Element not found");

			break;

		case 4:

			l.printelements();

		case 5:

			return;

		}

	}
}