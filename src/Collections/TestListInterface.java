package Collections;

import java.util.ArrayList;
import java.util.Collections;

public class TestListInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> intList = new ArrayList<Integer>();

		// add element in AL

		intList.add(140);
		intList.add(220);
		intList.add(430);
		intList.add(40);

		System.out.println(intList);
		for (int no : intList) {
			System.out.print(no + "  ");
		}
		System.out.println();

		intList.add(10);
		intList.add(220);
		intList.add(20);
		intList.add(450);

		System.out.println(intList);
		for (int no : intList) {
			System.out.print(no + "  ");
		}
		System.out.println();

		intList.remove(3);
		System.out.println(intList);
		System.out.println(intList.get(5));

		ArrayList<Integer> copyList = new ArrayList<Integer>(intList);
		System.out.println(copyList);
		System.out.println("------------sort----------");

		Collections.sort(intList);
		System.out.println(intList);

		// create AL of String and display in asending order

		ArrayList<String> strList = new ArrayList<String>();
		strList.add("Xyz");
		strList.add("Ayz");

		strList.add("Zyz");
		System.out.println(strList);
		Collections.sort(strList);
		System.out.println(strList);

		// can we create AL of Employees

	}
}
