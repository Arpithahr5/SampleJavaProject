package Collections.sample;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Arraylist1 {

	public static void main(String[] args) {
		
		List<String> arrayList = new ArrayList<String>();

		arrayList.add("Java");
		arrayList.add("Honk");

		Iterator<String> iterator = arrayList.iterator();

		// if modification done once we got iterator
		// object will throw CME exception
		arrayList.add("fail fast");
		while (iterator.hasNext()) {
			String string = (String) iterator.next();
			System.out.println(string);

		}

		//Below is definitely fail
		/*while (iterator.hasNext()) {
			String string = (String) iterator.next();
			System.out.println(string);
			arrayList.add("fail fast");

		}*/

		}

	}


