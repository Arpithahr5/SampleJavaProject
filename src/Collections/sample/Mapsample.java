package Collections.sample;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.TreeSet;

import Saample.demo1;

public class Mapsample {

	public static void main(String[] args) {

		System.out.println("Tree example");
		ArrayList<Integer> list =new ArrayList<Integer>();
		list.add(199);
		list.add(11);
		list.add(200);
		list.add(234);
		list.add(234456);

		Iterator<Integer> it=list.iterator();
		
		while (it.hasNext())
		{
			Integer iq= it.next();
			list.add(12);
			System.out.println("values"+it.next());

		}
		
	}

}
