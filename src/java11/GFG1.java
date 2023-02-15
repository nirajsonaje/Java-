package java11;
//Java Program to demonstrate

//the working of lines() method

import java.util.*;
import java.util.stream.Collectors;

class GFG1 {
	public static void main(String args[]) {
		String str = "Geeks\nFor\nGeeks";
		System.out.println(str.lines().collect(Collectors.toList()));
	}
}